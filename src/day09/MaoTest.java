package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MaoTest {
   public static void main(String[] args) {
	 HashMap hashmap = new HashMap();
	  hashmap.put("1", "甲");
	  hashmap.put("2", "乙");
	  hashmap.put("3", "丙");
	  hashmap.put("4", "丁");
	  hashmap.put("甲", "1");
	  /**
	   * Map集合迭代
	   */
	  Iterator it =hashmap.entrySet().iterator();
	  while(it.hasNext()) {
		  Map.Entry entry = (Entry)it.next();
		  String key = (String)entry.getKey();
		  String value = (String) entry.getValue();
		  System.out.println("key="+key+";"+"value"+value);
	  }
	  System.out.println("-----------------------------");
	  /**
	   * Map迭代方式2
	   */
	  for (Iterator it1 =hashmap.entrySet().iterator();
			  it1.hasNext();) {
		  Map.Entry entry = (Entry)it1.next();
		  String key = (String)entry.getKey();
		  String value = (String) entry.getValue();
		  System.out.println("key="+key+";"+"value"
		                               +hashmap.get(key));
	}
	}
}

