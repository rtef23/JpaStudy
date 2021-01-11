package com.personal.jpastudy;

import com.personal.jpastudy.domain3.join.Album;
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

  //  public static void main(String[] args) {
  //    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
  //    EntityManager entityManager = entityManagerFactory.createEntityManager();
  //    EntityTransaction entityTransaction = entityManager.getTransaction();
  //
  //    entityTransaction.begin();
  //
  //    try {
  ////      Team team = new Team("test-team-1");
  ////
  ////      entityManager.persist(team);
  //
  //
  //
  //      Locker locker = new Locker("test-locker-1");
  //
  //      entityManager.persist(locker);
  //
  //      User user = new User();
  //      user.setUsername("test-user-1");
  //
  //      entityManager.persist(user);
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
      Album album = new Album();

      // item 항목
      album.setName("test-name-1");
      album.setPrice(1111);

      // album 항목
      album.setArtist("artist-1");

      entityManager.persist(album);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
    } finally {
      entityManager.close();
    }

    entityManagerFactory.close();
  }
}
