package com.personal.jpastudy.member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MemberTest {
  public void persist() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember = new Member();

      testMember.setId(1L);
      testMember.setName("test-name3");

      entityManager.persist(testMember);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void find() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member member = entityManager.find(Member.class, 1L);

      System.err.println("member : " + member);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void remove(){
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member member = entityManager.find(Member.class, 1L);
      entityManager.remove(member);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void update(){
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member member = entityManager.find(Member.class, 1L);

      member.setName("test-2");

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }
}
