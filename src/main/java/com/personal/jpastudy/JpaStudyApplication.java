package com.personal.jpastudy;

import com.personal.jpastudy.domain1.Order;
import com.personal.jpastudy.domain1.OrderItem;
import com.personal.jpastudy.domain2.Locker;
import com.personal.jpastudy.domain2.Team;
import com.personal.jpastudy.domain2.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStudyApplication {

  //  public static void main(String[] args) {
  //    MemberTest memberTest = new MemberTest();

  //    memberTest.persist();
  //    memberTest.find();
  //    memberTest.remove();
  //    memberTest.update();
  //    memberTest.multipleFind();
  //    memberTest.persistLazyWrite();
  //    memberTest.combinedLazyWrite();
  //    memberTest.jpqlFlushTest();
  //    memberTest.detachTest();
  //    memberTest.detachTest1();

  //    TestRepository testRepository = new TestRepository();

  //    testRepository.insertTest();
  //    testRepository.insertTest1();
  //  }

//  public static void main(String[] args) {
//    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
//    EntityManager entityManager = entityManagerFactory.createEntityManager();
//    EntityTransaction entityTransaction = entityManager.getTransaction();
//
//    entityTransaction.begin();
//
//    try {
//      Order order = new Order();
//
//      order.addOrderItem(new OrderItem());
//
//      entityTransaction.commit();
//    } catch (Exception exception) {
//      entityTransaction.rollback();
//    } finally {
//      entityManager.close();
//    }
//
//    entityManagerFactory.close();
//  }

  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    try {
//      Team team = new Team("test-team-1");
//
//      entityManager.persist(team);



      Locker locker = new Locker("test-locker-1");

      entityManager.persist(locker);

      User user = new User();
      user.setUsername("test-user-1");

      entityManager.persist(user);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
    }

    entityManagerFactory.close();
  }
}
