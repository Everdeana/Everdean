package ch06;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}



