package com.design.patterns.proxy;

interface Connection {
  Object get();
  void set(Object x);
  void release();
}