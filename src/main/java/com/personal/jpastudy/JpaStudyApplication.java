package com.personal.jpastudy;

import com.personal.jpastudy.domain8.Address;
import com.personal.jpastudy.domain8.Member;
import com.personal.jpastudy.domain8.Period;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

  //  public static void main(String[] args) {
  //    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
  //    EntityManager entityManager = entityManagerFactory.createEntityManager();
  //    EntityTransaction entityTransaction = entityManager.getTransaction();
  //
  //    entityTransaction.begin();
  //
  //    try {
  //      Album album = new Album();
  //
  //      // item 항목
  //      album.setName("test-name-1");
  //      album.setPrice(1111);
  //
  //      // album 항목
  //      album.setArtist("artist-1");
  //
  //      entityManager.persist(album);
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
  //      Team team = new Team();
  //
  //      team.setName("team-1");
  //
  //      entityManager.persist(team);
  //
  //      Member member1 = new Member();
  //
  //      member1.setName("member-1");
  //      member1.setTeam(team);
  //
  //      entityManager.persist(member1);
  //
  //      Member member2 = new Member();
  //
  //      member2.setName("member-2");
  //      member2.setTeam(team);
  //
  //      entityManager.persist(member2);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      //      Member findMember1 = entityManager.find(Member.class, member1.getId());
  //      Member findMember1 = entityManager.getReference(Member.class, member1.getId());
  //
  //      System.out.println("#### START ####");
  //      System.out.println(findMember1.getClass());
  //
  //      System.out.println(findMember1.getId());
  //      System.out.println(findMember1.getName());
  //      System.out.println("#### END ####");
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
  //      Team team = new Team();
  //
  //      team.setName("team-1");
  //
  //      entityManager.persist(team);
  //
  //      Member member1 = new Member();
  //
  //      member1.setName("member-1");
  //      member1.setTeam(team);
  //
  //      entityManager.persist(member1);
  //
  //      Member member2 = new Member();
  //
  //      member2.setName("member-2");
  //      member2.setTeam(team);
  //
  //      entityManager.persist(member2);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      //      Member findMember1 = entityManager.find(Member.class, member1.getId());
  //      Member findMember1 = entityManager.getReference(Member.class, member1.getId());
  //
  //      System.out.println("ref class : " + findMember1.getClass());
  //
  ////      System.out.println(entityManagerFactory.getPersistenceUnitUtil().isLoaded(findMember1));
  ////
  ////      findMember1.getName();
  ////
  ////      System.out.println(entityManagerFactory.getPersistenceUnitUtil().isLoaded(findMember1));
  //
  //      Hibernate.initialize(findMember1);
  //
  //      entityTransaction.commit();
  //    } catch (Exception exception) {
  //      entityTransaction.rollback();
  //      exception.printStackTrace();
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
  //      Team team = new Team();
  //      team.setName("test-team-1");
  //
  //      entityManager.persist(team);
  //
  //      Team team2 = new Team();
  //      team2.setName("test-team-2");
  //
  //      entityManager.persist(team2);
  //
  //      Member member1 = new Member();
  //      member1.setName("test-member-1");
  //      member1.setTeam(team);
  //
  //      entityManager.persist(member1);
  //
  //      Member member2 = new Member();
  //      member2.setName("test-member-2");
  //      member2.setTeam(team);
  //
  //      entityManager.persist(member2);
  //
  //      Member member3 = new Member();
  //      member3.setName("test-member-3");
  //      member3.setTeam(team2);
  //
  //      entityManager.persist(member3);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  ////      Member findMember1 = entityManager.find(Member.class, member1.getId());
  ////
  ////      System.out.println("#### founded member name : " + findMember1.getName());
  ////      System.out.println("#### founded team name : " + findMember1.getTeam().getName());
  //
  //      List<Member> findMembers = entityManager.createQuery("select m from Member m",
  // Member.class).getResultList();
  //
  //      entityTransaction.commit();
  //    } catch (Exception exception) {
  //      entityTransaction.rollback();
  //      exception.printStackTrace();
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
  //      Child child1 = new Child();
  //      child1.setName("child-1");
  //
  //      Child child2 = new Child();
  //      child2.setName("child-2");
  //
  //      Parent parent = new Parent();
  //      parent.setName("parent-1");
  //
  //      parent.addChild(child1);
  //      parent.addChild(child2);
  //
  ////      entityManager.persist(child1);
  ////      entityManager.persist(child2);
  //      entityManager.persist(parent);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      Parent findParent1 = entityManager.find(Parent.class, parent.getId());
  ////      findParent1.getChildren().remove(0);
  //
  //      entityManager.remove(findParent1);
  //
  //      entityTransaction.commit();
  //    } catch (Exception exception) {
  //      entityTransaction.rollback();
  //      exception.printStackTrace();
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
      Member member = new Member();

      member.setName("user-name-1");
      member.setHomeAddress(new Address("city-1", "street-1", "zipcode-1"));
      member.setWorkAddress(new Address("city-2", "street-2", "zipcode-2"));
      member.setWorkPeriod(new Period(LocalDate.now(), LocalDate.now().plus(3, ChronoUnit.DAYS)));

      entityManager.persist(member);

      entityTransaction.commit();
    } catch (Exception exception) {
      entityTransaction.rollback();
      exception.printStackTrace();
    } finally {
      entityManager.close();
    }

    entityManagerFactory.close();
  }
}
