package com.fpinjava.recursion.exercise04_04;

import com.fpinjava.common.TailCall;

import java.util.List;

import static com.fpinjava.common.CollectionUtilities.append;
import static com.fpinjava.common.CollectionUtilities.list;
import static com.fpinjava.common.TailCall.ret;
import static com.fpinjava.common.TailCall.sus;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
    return range_(start, end, list()).eval();
  }

  private static TailCall<List<Integer>> range_(Integer start, Integer end, List<Integer> zs) {
    return end <= start ? ret(zs) : sus(() -> range_(start + 1, end, append(zs, start)));
  }
}
