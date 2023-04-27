package test.care;

import test.java.TestClass01;
import test.java.TestClass02;
import test.java.TestClass03;

// import test.java.*; // * : 해당하는 폴더의 모든 값을 불러옴

public class Main01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test();
		t.num = 1;
		
		// 서로 다른 패키지인 경우 import로 추가해줘야함
		TestClass01 t01 = new TestClass01();
		t01.test();
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		// 동일한 이름의 클래스를 가져다 사용할때 import대신 위치정보를 표시
		test.date.Date dd = new test.date.Date();
		dd.data();
		
		test.java.Date d01 = new test.java.Date();
		d01.data();
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
	}
}
