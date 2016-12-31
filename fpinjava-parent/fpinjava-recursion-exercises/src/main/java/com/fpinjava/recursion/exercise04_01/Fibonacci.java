package com.fpinjava.recursion.exercise04_01;

import com.fpinjava.common.TailCall;

import java.math.BigInteger;

public class Fibonacci {
  
  public static BigInteger fib(int n) {
    return fib_(BigInteger.valueOf(n), BigInteger.ONE, BigInteger.ZERO);
  }

  private static BigInteger fib_(BigInteger n, BigInteger acc1, BigInteger acc2) {
    if (n.equals(BigInteger.ZERO)) return BigInteger.ZERO;
    else if (n.equals(BigInteger.ONE)) return acc1.add(acc2);
    else return fib_(n.subtract(BigInteger.ONE), acc2, acc1.add(acc2));
  }
}
