package com.fpinjava.functions.exercise02_02;

public class FunctionExamples {

  public static final Function<Integer, Integer> triple = x -> x * 3;

  public static final Function<Integer, Integer> square = x -> x * x;

  public static final Function<Integer, Integer> compose(final Function<Integer, Integer> f, final Function<Integer, Integer> g) {
    return x -> f.apply(g.apply(x));
  }
}
