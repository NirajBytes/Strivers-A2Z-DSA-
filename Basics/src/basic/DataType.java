//Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
//Given a data type, help Geek in finding the size of it in byte.
//
//Data Type - Character, Integer, Long, Float and Double
//
//Example 1:
//
//Input: Character
//Output: 1
//Explaination: For java it would be 2 bytes.
package basic;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataType {

	static int dataTypeSize(String str) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Character", 1);
		map.put("Integer", 4);
		map.put("Long", 8);
		map.put("Float", 4);
		map.put("Double", 8);
		if(map.containsKey(str)){
			return map.get(str);
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Datatype Need to Check Size");
		String str=sc.next();
		if(dataTypeSize(str)==-1){
			System.out.println("Invalid Data Type");
		}
		else{
			System.out.println("Size of "+str+" is "+dataTypeSize(str));
		}
		
		
		sc.close();
	}

}
