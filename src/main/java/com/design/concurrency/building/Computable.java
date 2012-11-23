package com.design.concurrency.building;
interface Computable <A, V> {
    V compute(A arg) throws InterruptedException;
}