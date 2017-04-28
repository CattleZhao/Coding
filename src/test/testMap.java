package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * 简单实现Map
 * @author Scorpion
 *
 */
public class testMap {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		List<String> readlist = Collections.unmodifiableList(list);
		list.add("d");
	}
}

