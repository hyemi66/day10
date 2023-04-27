package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		// 현재시간을 초단위로 표시
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		// 현재날짜 및 시간 표시
		Date d = new Date();
		System.out.println(d);
		
		// 현재날짜 및 시간 표시를 원하는 방식으로 수정
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");
		String s_t = s.format(d);
		System.out.println(s_t);
		
	}
}
