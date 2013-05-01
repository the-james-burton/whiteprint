package com.googlecode.whiteprint.headfirst.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class InputTest {

    @Test
    public void test() {
	int c;

	try {
	    InputStream in = new LowerCaseInputStream(new BufferedInputStream(
		    new FileInputStream("test.txt")));

	    while ((c = in.read()) >= 0) {
		System.out.print((char) c);
	    }

	    in.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}