package com.github.frankstolle.test;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Example {
  private final int i;

  public Example(int i) {
    this.i = i;
  }

  public void foo(String methodName) {
    try {
      Logic logic = Logic.class.getConstructor(int.class).newInstance(i);
      Method method = Logic.class.getDeclaredMethod(methodName);
      method.invoke(logic);
    } catch (InvocationTargetException e) {
      if (e.getTargetException() instanceof AssertionError)
        throw (AssertionError) e.getTargetException();
      throw new AssertionError(e.getTargetException());
    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
      throw new AssertionError(e);
    }
  }
}
