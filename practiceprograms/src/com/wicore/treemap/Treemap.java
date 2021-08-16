package com.wicore.treemap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	TreeMap<String,Integer> numbers = new TreeMap<>();
	 

	public void AddNum() {
		numbers.put("king", 10);
        numbers.put("Queen", 9);
        numbers.put("Minister", 5);
        for(Map.Entry m:numbers.entrySet()) {
        	System.out.println(m.getKey()+","+m.getValue());
        }
	}
	public static void main(String[] args) {
		Treemap tm = new Treemap();
		tm.AddNum();
	}

}
