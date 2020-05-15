package day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * HashSet 存储的数据是无序的，并且不能重复
 * @author Administrator
 *
 */
public class SetTest {
   public static void main(String[] args) {
	 HashSet hashSet = new HashSet();
	 hashSet.add(1);
	 hashSet.add("梅");
	 hashSet.add("兰");
	 hashSet.add("竹");
	 hashSet.add("梅");//梅是重复的只输出一次
	 System.out.println(hashSet.hashCode());
	 for (Iterator iterator = hashSet.iterator(); 
			 iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	 }		
	 /**
	  *  LinkedHashSet,是有序的
	  *  
	  */
	 LinkedHashSet hashSet2 = new LinkedHashSet();
	 hashSet2.add(1);
	 hashSet2.add("梅");
	 hashSet2.add("兰");
	 hashSet2.add("竹");
	 hashSet2.add("梅");
	 System.out.println(hashSet2.hashCode());
	 for (Iterator iterator2 = hashSet2.iterator(); 
			 iterator2.hasNext();) {
		Object object1 = (Object) iterator2.next();
		System.out.println(object1);
		
	}
	 /**
	  * TreeSet可以进行自动排序
	  */
	 TreeSet treeSet = new TreeSet();
	 treeSet.add("4");
	 treeSet.add("2");
	 treeSet.add("1");
	 treeSet.add("8");
	 System.out.println(treeSet.pollLast());
	 System.out.println("---------------");
	 for (Iterator iterator = treeSet.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
}}





















