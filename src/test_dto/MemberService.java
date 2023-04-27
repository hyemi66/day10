package test_dto;

import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	
	public void inputName() {
		System.out.print("이름 입력 : ");
		String name = sc.next();
		dto.setName(name);
	}
	public void inputAge() {
		System.out.print("나이 입력 : ");
		//age = sc.nextInt();
		dto.setAge(sc.nextInt());
	}
	public void print() {
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
	}
}
