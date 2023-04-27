package temp;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args) {
		/*
		 보여지는 공간
		 1. 온도올리기
		 2. 온도내리기
		 3. 현재 설정 정보 
		*/
		int temp = 10, num;
		Scanner sc = new Scanner(System.in);
		TempService tS = new TempService();
		
		while(true) {
			System.out.println("1. 온도올리기");
			System.out.println("2. 온도내리기");
			System.out.println("3. 현재설정정보");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				temp = tS.upTemp();
				break;
			case 2 : 
				temp = tS.downTemp();
				break;
			case 3 : 
				tS.temp(temp);
				break;
			}
			
		}
	}
}
