package com.fpinjava.makingjavafunctional.exercise03_05;

import com.fpinjava.common.Function;

import java.util.List;

public class Fold {

  public static Integer fold(List<Integer> is, Integer identity, Function<Integer, Function<Integer, Integer>> f) {
    for (Integer i : is) {
      identity = f.apply(identity).apply(i);
    }
    return identity;
  }
}
