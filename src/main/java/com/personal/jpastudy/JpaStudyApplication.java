package com.personal.jpastudy;

import com.personal.jpastudy.member.MemberTest;

public class JpaStudyApplication {

  public static void main(String[] args) {
    MemberTest memberTest = new MemberTest();

//    memberTest.persist();
//    memberTest.find();
//    memberTest.remove();
//    memberTest.update();
//    memberTest.multipleFind();
//    memberTest.persistLazyWrite();
//    memberTest.combinedLazyWrite();
//    memberTest.jpqlFlushTest();
//    memberTest.detachTest();
    memberTest.detachTest1();
  }
}
