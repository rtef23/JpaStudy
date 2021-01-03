package com.personal.jpastudy.member;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MemberTest {
  public void persist() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember = new Member();

      testMember.setId(1L);
      testMember.setUserName("test-name3");

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

  public void remove() {
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

  public void update() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member member = entityManager.find(Member.class, 1L);

      member.setUserName("test-2");

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void multipleFind() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member member1 = entityManager.find(Member.class, 1L);
      Member member2 = entityManager.find(Member.class, 1L);
      // member1 == member2

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void persistLazyWrite() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember1 = new Member();
      Member testMember2 = new Member();

      testMember1.setId(2L);
      testMember1.setUserName("test-name-2");

      testMember2.setId(3L);
      testMember2.setUserName("test-name-3");

      entityManager.persist(testMember1);
      entityManager.persist(testMember2);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void combinedLazyWrite() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember1 = new Member();

      testMember1.setId(4L);
      testMember1.setUserName("test-name-1");

      entityManager.persist(testMember1);
      entityManager.remove(testMember1);
      entityManager.persist(testMember1);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void jpqlFlushTest() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember1 = new Member();
      Member testMember2 = new Member();
      Member testMember3 = new Member();

      testMember1.setId(5L);
      testMember1.setUserName("test-name-5");

      testMember1.setId(6L);
      testMember1.setUserName("test-name-6");

      testMember1.setId(7L);
      testMember1.setUserName("test-name-7");

      entityManager.persist(testMember1);
      entityManager.persist(testMember2);
      entityManager.persist(testMember3);

      Query query = entityManager.createQuery("select m from Member m", Member.class);
      List<Member> members = query.getResultList();
      // createQuery api를 사용한 시점이 아닌 getResultList를 사용한 시점에서 쿼리가 전송된다.

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void detachTest() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember1 = entityManager.find(Member.class, 1L);

      testMember1.setUserName("SSSSSS");

      entityManager.detach(testMember1);
      // testMember1 엔티티를 준영속 상태로 만들어 update 쿼리가 전송되지 않게 된다.

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void detachTest1() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Member testMember1 = entityManager.find(Member.class, 4L);
      testMember1.setUserName("SSSSSS");

      entityManager.detach(testMember1);

      Member testMember2 = entityManager.find(Member.class, 4L);
      testMember2.setUserName("SSSS");

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }
}
