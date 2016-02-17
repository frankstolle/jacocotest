package com.github.frankstolle.test;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Logic {
  private final int i;

  public Logic(int i) {
    this.i = i;
  }

  public void bar() {
    privatebar();
    if (i == 0) return;
    if (i > 0) throw new RuntimeException(new AssertionError("error 1"));
    throw new RuntimeException("error 2");
  }

  private void privatebar() {

  }
}
