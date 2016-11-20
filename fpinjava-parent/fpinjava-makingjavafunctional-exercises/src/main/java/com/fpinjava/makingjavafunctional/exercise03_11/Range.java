package com.fpinjava.makingjavafunctional.exercise03_11;

import com.fpinjava.makingjavafunctional.exercise03_10.CollectionUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Range {

  public static List<Integer> range(int start, int end) {
    List<Integer> list = new ArrayList<>();
    for (int i = start; i < end; ++i) list.add(i);
    return Collections.unmodifiableList(list);
  }
}
