package day09;

import java.util.HashSet;
import java.util.Random;

public class LianXi {
  public static void main(String[] args) {	  
	HashSet<String> hashSet = new HashSet<String>();
	randomSet(hashSet);
	System.out.println("获奖者："+hashSet);	   
}

private static void randomSet(HashSet<String> hashSet) {
	String person[] = new String[]{"张三","李四","王五","赵六"};
	int randomKey = -1;
	Random random = new Random();	
	 for(int i = 0;i<3;i++) {
	    randomKey = random.nextInt(person.length);
	    hashSet.add(person[randomKey]); 
}
	 if(hashSet.size()!=3) {
			randomSet(hashSet);
		}
	
}
}
