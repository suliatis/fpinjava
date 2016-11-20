package com.fpinjava.makingjavafunctional.exercise03_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionUtilities {

  public static <T> List<T> list() {
    return Collections.emptyList();
  }

  public static <T> List<T> list(T t) {
    return Collections.singletonList(t);
  }
  public static <T> List<T> list(List<T> ts) {
    return Collections.unmodifiableList(ts);
  }

  @SafeVarargs
  public static <T> List<T> list(T... ts) {
    return Collections.unmodifiableList(Arrays.asList(ts));
  }
}
