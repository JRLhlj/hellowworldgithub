package day09;

import java.util.Arrays;
import java.util.HashMap;

public class XiTi {
   public static void main(String[] args) {
	int arr[] = {1,3,1,2,1,3,2,1};
	int result[] = new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		System.out.println("当前数"+arr[i]);
		for(int j=0;j<i;j++) {
			System.out.println("枚举前面的数"+arr[i]);
					if(arr[j]==arr[i]) {
						result[i] = j;
						break;
					}else {
						result[i] = -1;
					}
		}
		System.out.println( );
	}
	System.out.println(Arrays.toString(result));
	System.out.println("-------------------");
	
	int arr1[] = {1,3,1,2,1,3,2,1};
	int result1[] = new int[arr1.length];
	HashMap hashMap = new HashMap();
	for(int i = 0;i<arr1.length;i++) {
		if(hashMap.containsKey(arr1[i])) {
			result1[i] = (int) hashMap.get(arr1[i]);
		}
		else {
			hashMap.put(arr1[i], i);
			if(i == 0) {
				result1[i] = 0;
			}
			else
				result1[i] = -1;
		}
	}
	System.out.println(Arrays.toString(result1));
}
	
   }






