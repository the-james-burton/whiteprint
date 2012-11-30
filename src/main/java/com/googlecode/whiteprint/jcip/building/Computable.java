package com.googlecode.whiteprint.jcip.building;
interface Computable <A, V> {
    V compute(A arg) throws InterruptedException;
}