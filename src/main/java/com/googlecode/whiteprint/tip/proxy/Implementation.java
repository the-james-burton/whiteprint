package com.googlecode.whiteprint.tip.proxy;

import java.util.logging.Logger;

class Implementation implements ProxyBase {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void f() {
	log.info("Implementation.f()");
    }

    @Override
    public void g() {
	log.info("Implementation.g()");
    }

    @Override
    public void h() {
	log.info("Implementation.h()");
    }
}