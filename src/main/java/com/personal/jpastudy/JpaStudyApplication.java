package com.personal.jpastudy;

import com.personal.jpastudy.domain10.Member;
import com.personal.jpastudy.domain10.Team;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
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

  //  public static void main(String[] args) {
  //    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
  //    EntityManager entityManager = entityManagerFactory.createEntityManager();
  //    EntityTransaction entityTransaction = entityManager.getTransaction();
  //
  //    entityTransaction.begin();
  //
  //    try {
  //      Member member = new Member();
  //
  //      member.setName("user-name-1");
  //      member.setHomeAddress(new Address("city-1", "street-1", "zipcode-1"));
  //      member.setWorkAddress(new Address("city-2", "street-2", "zipcode-2"));
  //      member.setWorkPeriod(new Period(LocalDate.now(), LocalDate.now().plus(3,
  // ChronoUnit.DAYS)));
  //
  //      entityManager.persist(member);
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
  //      Address address1 = new Address("city-1", "street-1", "zipcode-1");
  //
  //      Member member1 = new Member();
  //
  //      member1.setName("member-1");
  //      member1.setHomeAddress(address1);
  //
  //      entityManager.persist(member1);
  //
  //      Member member2 = new Member();
  //
  //      member2.setName("member-2");
  //      member2.setHomeAddress(address1);
  //
  //      entityManager.persist(member2);
  //
  //      member1.setHomeAddress(new Address("newcity1", "street1", "zipcode1"));
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
  //      Address sampleAddress = new Address("city1", "street1", "zipcode1");
  //      Member member = new Member();
  //
  //      Set<String> favoriteFoods = new HashSet<>();
  //      favoriteFoods.add("food-1");
  //      favoriteFoods.add("food-2");
  //
  //      member.setName("name-1");
  //      member.setFavoriteFoods(favoriteFoods);
  //      //      member.setAddressHistory(
  //      //          Arrays.asList(
  //      //              sampleAddress,
  //      //              new Address("city2", "street2", "zipcode2"),
  //      //              new Address("city3", "street3", "zipcode3")));
  //
  //      member.setAddressHistory(
  //          Arrays.asList(
  //              new AddressEntity("city1", "street1", "zipcode1"),
  //              new AddressEntity("city2", "street2", "zipcode2"),
  //              new AddressEntity("city3", "street3", "zipcode3")));
  //
  //      entityManager.persist(member);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      System.out.println("####");
  //      Member findMember = entityManager.find(Member.class, member.getId());
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
  ////      List<Member> members =
  ////          entityManager
  ////              .createQuery("select m from Member m where m.name like '%test%'", Member.class)
  ////              .getResultList();
  //
  //      CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
  //      CriteriaQuery<Member> query = criteriaBuilder.createQuery(Member.class);
  //
  //      //루트 클래스 (조회를 시작할 클래스)
  //      Root<Member> member = query.from(Member.class);
  //
  //      //쿼리 생성
  //      CriteriaQuery<Member> selectQuery =
  //          query.select(member).where(criteriaBuilder.like(member.get("name"), "test"));
  //
  //      List<Member> findMembers = entityManager.createQuery(selectQuery).getResultList();
  //
  ////      //[JPQL] select m from Member m where m.age > 18 order by name DESC
  ////      JPAFactoryQuery query = new JPAQueryFactory(entityManager);
  ////      QMember member = QMember.member;
  ////
  ////      List<Member> findMembers = query
  ////          .selectFrom(member)
  ////          .where(m.age.gt(18))
  ////          .orderBy(m.name.desc)
  ////          .fetch();
  //
  //      String sql = "select member_id, name from Member where name like '%test%'";
  //
  //      List<Member> findMembers1 = entityManager.createNativeQuery(sql,
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
  //
  //      //      entityManager.createQuery("select m from Member m", Member.class);
  //      //      entityManager.createQuery("select m.username from Member m", String.class);
  //
  //      Member findMember =
  //          entityManager
  //              .createQuery("select m from Member m where m.username=:username", Member.class)
  //              .setParameter("username", "test-user-name")
  //              .getSingleResult();
  //
  //      Member findMember1 =
  //          entityManager
  //              .createQuery("select m from Member m where m.username=?1", Member.class)
  //              .setParameter(1, "test-user-name")
  //              .getSingleResult();
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
  //      Member member = new Member("name-1", 10);
  //
  //      entityManager.persist(member);
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  ////      List results =
  ////          entityManager.createQuery("select m.username, m.age from Member m").getResultList();
  //
  ////      List<Object[]> results =
  ////          entityManager.createQuery("select m.username, m.age from Member m").getResultList();
  ////
  ////      Object[] resultObjects = results.get(0);
  ////
  ////      System.out.println("resultObjects[0] : " + resultObjects[0]);
  ////      System.out.println("resultObjects[1] : " + resultObjects[1]);
  //
  //      List<MemberDTO> results = entityManager.createQuery("select new
  // com.personal.jpastudy.domain10.MemberDTO(m.username, m.age) from Member m",
  // MemberDTO.class).getResultList();
  //
  //      System.out.println("result[0] : " + results.get(0));
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
  //      IntStream.rangeClosed(0, 9)
  //          .forEach(
  //              (number) -> {
  //                Member member = new Member("name-" + number, number);
  //
  //                entityManager.persist(member);
  //              });
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      List<Member> members =
  //          entityManager
  //              .createQuery("select m from Member m order by m.age desc", Member.class)
  //              .setFirstResult(0)
  //              .setMaxResults(10)
  //              .getResultList();
  //
  //      System.out.println(members.toString().replace("},", "},\n"));
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
  //      Team team = new Team("team-name");
  //
  //      entityManager.persist(team);
  //
  //      IntStream.rangeClosed(0, 9)
  //          .forEach(
  //              (number) -> {
  //                Member member = new Member("name-" + number, number);
  //
  //                member.changeTeam(team);
  //
  //                entityManager.persist(member);
  //              });
  //
  //      entityManager.flush();
  //      entityManager.clear();
  //
  //      //      List<Member> findMembers = entityManager.createQuery("select m from Member m left
  // join
  //      // m.team t", Member.class).getResultList();
  //      //
  //      //      System.out.println(findMembers);
  //      //      System.out.println("#### before getTeam()");
  //      //      System.out.println(findMembers.get(0).getTeam());
  //
  ////      List<Member> result =
  ////          entityManager.createQuery("select m from Member m ,Team t",
  // Member.class).getResultList();
  //
  //      List<Member> result = entityManager.createQuery("select m from Member m where m.age > ALL
  // (select length(t.name) from Team t)", Member.class).getResultList();
  //
  //      System.out.println(result);
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
      List<Team> teams =
          Arrays.asList(new Team("team-name1"), new Team("team-name2"), new Team("team-name3"));

      teams.forEach(entityManager::persist);

      IntStream.rangeClosed(0, 9)
          .forEach(
              (number) -> {
                Member member = new Member("name-" + number, number);
                Team selectedTeam = teams.get((int) (Math.random() * teams.size()));

                member.changeTeam(selectedTeam);

                entityManager.persist(member);
              });

      entityManager.flush();
      entityManager.clear();

      //      List<Member> results = entityManager.createQuery("select m from Member m",
      // Member.class).getResultList();
      //      List<Member> results = entityManager.createQuery("select m from Member m join fetch
      // m.team", Member.class).getResultList();
//      List<Team> results =
//          entityManager
//              .createQuery("select t from Team t join fetch t.members", Team.class)
//              .getResultList();
      List<Team> results =
          entityManager
              .createQuery("select distinct t from Team t join fetch t.members", Team.class)
              .getResultList();


      //      for(Member member : results){
      //        System.out.println("member name : " + member.getUsername() + "\n\tteam name : " +
      // member.getTeam().getName());
      //      }
      results.forEach(
          (team) -> {
            System.out.println("team name : " + team.getName());

            team.getMembers()
                .forEach(
                    (member) -> {
                      System.out.println(
                          "=> member id : "
                              + member.getId()
                              + "\tmember name : "
                              + member.getUsername());
                    });
          });

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
