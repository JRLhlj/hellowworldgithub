package day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * HashSet �洢������������ģ����Ҳ����ظ�
 * @author Administrator
 *
 */
public class SetTest {
   public static void main(String[] args) {
	 HashSet hashSet = new HashSet();
	 hashSet.add(1);
	 hashSet.add("÷");
	 hashSet.add("��");
	 hashSet.add("��");
	 hashSet.add("÷");//÷���ظ���ֻ���һ��
	 System.out.println(hashSet.hashCode());
	 for (Iterator iterator = hashSet.iterator(); 
			 iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	 }		
	 /**
	  *  LinkedHashSet,�������
	  *  
	  */
	 LinkedHashSet hashSet2 = new LinkedHashSet();
	 hashSet2.add(1);
	 hashSet2.add("÷");
	 hashSet2.add("��");
	 hashSet2.add("��");
	 hashSet2.add("÷");
	 System.out.println(hashSet2.hashCode());
	 for (Iterator iterator2 = hashSet2.iterator(); 
			 iterator2.hasNext();) {
		Object object1 = (Object) iterator2.next();
		System.out.println(object1);
		
	}
	 /**
	  * TreeSet���Խ����Զ�����
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





















