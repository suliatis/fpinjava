package com.fpinjava.functions.exercise02_01;

public class FunctionExamples {

  public static final Function<Integer, Integer> triple = new Function<Integer, Integer>() {

    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  };

  public static final Function<Integer, Integer> square = new Function<Integer, Integer>() {

    @Override
    public Integer apply(Integer arg) {
      return arg * arg;
    }
  };

  public static final Function<Integer, Integer> compose(final Function<Integer, Integer> f, final Function<Integer, Integer> g) {
    return new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer i) {
        return f.apply(g.apply(i));
      }
    };
  }
}
