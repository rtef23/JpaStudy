package com.personal.jpastudy.test;

import java.util.stream.IntStream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRepository {
  public void insertTest() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
      Test test1 = new Test();

      test1.setName("test-1");

      entityManager.persist(test1);

      entityTransaction.commit();
    } catch (Exception e) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }

  public void insertTest1() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {

      /*
        최초 persist API 실행시에만 sequence select & update 쿼리가 2번 호출 되었고
        나머지 호출 실행시에는 sequence select & update 쿼리가 호출되지 않는다.
       */
      IntStream.rangeClosed(0, 99)
          .forEach((number) -> {
            Test test = new Test();

            test.setName("test-" + number);

            entityManager.persist(test);
          });

      System.out.println("========= before transaction.commit() =========");

      entityTransaction.commit();
    } catch (Exception e) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
      entityManagerFactory.close();
    }
  }
}
