package com.googlecode.whiteprint.tip.multipledispatch;

interface Item {
    Outcome compete(Item it);

    Outcome eval(Paper p);

    Outcome eval(Rock r);

    Outcome eval(Scissors s);
}