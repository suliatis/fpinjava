package com.fpinjava.makingjavafunctional.exercise03_14;

import java.util.List;

import static com.fpinjava.common.CollectionUtilities.list;
import static com.fpinjava.common.CollectionUtilities.prepend;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
    if (end <= start) return list();
    else return prepend(start, range(++start, end));

  }
}
