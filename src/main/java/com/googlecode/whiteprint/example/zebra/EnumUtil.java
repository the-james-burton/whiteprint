package com.googlecode.whiteprint.example.zebra;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class EnumUtil {
    private static <T extends Enum<T>> List<List<T>> perm(List<T> elems) {
	List<List<T>> res = new ArrayList<List<T>>();
	if (elems.size() == 1) {
	    res.add(new ArrayList<T>(elems));
	    return res;
	}
	int lastIndex = elems.size() - 1;
	T x = elems.get(lastIndex);
	List<T> subList = elems.subList(0, lastIndex);
	List<List<T>> perms = perm(subList);
	for (List<T> perm : perms) {
	    for (int i = 0; i <= perm.size(); i++) {
		List<T> newPerm = new ArrayList<T>(perm);
		newPerm.add(i, x);
		res.add(newPerm);
	    }
	}
	return res;
    }

    public static <T extends Enum<T>> List<List<T>> permute(Class<T> enumClass) {
	EnumSet<T> enumSet = EnumSet.allOf(enumClass);
	List<T> elems = new ArrayList<T>(enumSet);
	return perm(elems);
    }
}