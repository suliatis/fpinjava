package com.fpinjava.recursion.exercise04_09;

import com.fpinjava.common.CollectionUtilities;
import com.fpinjava.common.TailCall;

import java.math.BigInteger;
import java.util.List;

import static com.fpinjava.common.CollectionUtilities.*;
import static com.fpinjava.common.TailCall.ret;
import static com.fpinjava.common.TailCall.sus;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;


public class Memoization {

  public static String fibo(int n) {
    return makeString(fibo_(list(ZERO), ONE, ZERO, BigInteger.valueOf(n)).eval(), ", ");
  }

  private static TailCall<List<BigInteger>> fibo_(List<BigInteger> acc, BigInteger acc1, BigInteger acc2, BigInteger n) {
    return n.equals(ZERO)
            ? ret(list(ZERO)) :
            n.equals(ONE)
                    ? ret(append(acc, acc1.add(acc2)))
                    : sus(() -> fibo_(append(acc, acc1.add(acc2)), acc2, acc1.add(acc2), n.subtract(ONE)));
  }

  public static <T> String makeString(List<T> list, String separator) {
    return list.isEmpty() ? "" : tail(list).isEmpty() ? head(list).toString() : head(list) + foldLeft(tail(list), "", x -> y -> x + separator + y);
  }
}
