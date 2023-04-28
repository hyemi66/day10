package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Win10Main {
	public static void main(String[] args) {
		/*
		 service 생성자에 각각의 값들 전송
		 1. 성능(info)
		 2. 기능사용
		 	1) 계산기 2) 메모장 3) 직접입력
		*/
		HashMap<String, String> info = new HashMap<>();
		String calc = "calc", notepad = "notepad";
		String msg = null;
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 성능(info)");
			System.out.println("2. 기능사용");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				info.put("Ram", "16GB");
				info.put("시스템종류", "x64");
				Iterator<String> infoIt = info.keySet().iterator();
				for (;infoIt.hasNext();) {
					infoIt.next();
				}
				break;
			case 2 : 
				System.out.println("1)계산기 2)메모장 3)직접입력");
				System.out.print(">>> ");
				num = sc.nextInt();
				ProcessBuilder pro = new ProcessBuilder();
				if(num==1) {
					pro.command(calc);
				}
				else if(num==2) {
					pro.command(notepad);
				}
				else if(num==3) {
					System.out.print("직접입력 : ");
					msg = sc.next();
					pro.command(msg);
				}
				break;
			}
		}
	}
}
