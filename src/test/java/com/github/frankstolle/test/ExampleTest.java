package com.github.frankstolle.test;

import org.junit.Test;

public class ExampleTest {

  @Test
  public void testFoo1() {
    try {
      new Example(1).foo("bar");
    } catch(AssertionError e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void testFoo2() {
    try {
      new Example(-1).foo("bar");
    } catch(AssertionError e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void testFoo3() {
    try {
      new Example(0).foo("bar");
    } catch(AssertionError e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void testFoo4() {
    try {
      new Example(0).foo("bar2");
    } catch(AssertionError e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void testFoo5() {
    try {
      new Example(0).foo("privatebar");
    } catch(AssertionError e) {
      System.out.println(e.getMessage());
    }
  }
}
