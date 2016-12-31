package com.fpinjava.recursion.exercise04_02;

import com.fpinjava.common.TailCall;

import java.math.BigInteger;


public class Fibonacci {

  public static BigInteger fib(int x) {
    return fib_(BigInteger.valueOf(x), BigInteger.ONE, BigInteger.ZERO).eval();
  }

  private static TailCall<BigInteger> fib_(BigInteger n, BigInteger acc1, BigInteger acc2) {
    if (n.equals(BigInteger.ZERO)) return TailCall.ret(BigInteger.ZERO);
    else if (n.equals(BigInteger.ONE)) return TailCall.ret(acc1.add(acc2));
    else return TailCall.sus(() -> fib_(n.subtract(BigInteger.ONE), acc2, acc1.add(acc2)));
  }
}
