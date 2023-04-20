package com.jsp.bank.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
EntityManager em =emf.createEntityManager();
EntityTransaction et=em.getTransaction();

Bank bank=new Bank();
 bank.setName("icici");

Branch b1=new Branch();
b1.setName("vashi");
b1.setIfsc_code("dfgh85");

Branch b2=new Branch();
b2.setName("thane");
b2.setIfsc_code("dfgh85");

Branch b3=new Branch();
b3.setName("mumbai");
b1.setIfsc_code("dfgh85");

ArrayList<Branch>branch=new ArrayList<Branch>();
branch.add(b1);
branch.add(b2);
branch.add(b3);

bank.setBranches(branch);
b1.setBank(bank);
b2.setBank(bank);
b3.setBank(bank);

et.begin();
em.persist(bank);
em.persist(b3);
em.persist(b2);
em.persist(b1);
et.commit();
}
}