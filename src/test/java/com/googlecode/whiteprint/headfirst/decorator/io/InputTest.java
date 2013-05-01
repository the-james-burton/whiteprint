package com.googlecode.whiteprint.headfirst.decorator.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class InputTest {

    @Test
    public void test() {
	int c;

	try {
	    System.out.println(new File("").getAbsolutePath());
	    InputStream in = new LowerCaseInputStream(new BufferedInputStream(
		    new FileInputStream("src/main/resources/readme.txt")));

	    while ((c = in.read()) >= 0) {
		System.out.print((char) c);
	    }

	    in.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
