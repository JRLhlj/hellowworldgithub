package day09;

import java.util.HashSet;
import java.util.Random;

public class LianXi {
  public static void main(String[] args) {	  
	HashSet<String> hashSet = new HashSet<String>();
	randomSet(hashSet);
	System.out.println("���ߣ�"+hashSet);	   
}

private static void randomSet(HashSet<String> hashSet) {
	String person[] = new String[]{"����","����","����","����"};
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
