package week14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// list에 데이터 추가
		list.add("Java");
		list.add("OOP");
		list.add("객체지향프로그래밍");
		
		System.out.println("리스트 총 개수 = " + list.size());
		String item = list.get(2);
		System.out.println("리스트 2번 인덱스 값 = " + item);
		
		System.out.println();
		for(String s : list)
			System.out.println(s);
		
		System.out.println();
		
		list.remove(1);
		for(int i=0; i<list.size(); i++)
			System.out.println(i + " : " + list.get(i));
		
		// vector => 동기화에 적용
		List<String> vector = new Vector<String>();
		vector.add("홍길동");
		vector.add("이순신");
		vector.add("강감찬");
		
		System.out.println();
		for(String s : vector)
			System.out.println(s);
		
		// LinkedList => 삽입, 삭제가 빈번한 경우 사용
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("apple");
		linkedList.add("melon");
		linkedList.add("banana");
		
		System.out.println();
		for(String s : linkedList)
			System.out.println(s);
		
		linkedList.remove("apple");
		System.out.println();
		for(String s : linkedList)
			System.out.println(s);
	}

}

// 출력
// 리스트 총 개수 = 3
// 리스트 2번 인덱스 값 = 객체지향프로그래밍

// Java
// OOP
// 객체지향프로그래밍

// 0 : Java
// 1 : 객체지향프로그래밍

// 홍길동
// 이순신
// 강감찬

// apple
// melon
// banana

// melon
// banana
