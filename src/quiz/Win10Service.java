package quiz;

import java.util.HashMap;

public class Win10Service {
	/*
	 생성자를 통해서 기본값 초기화
	 각각의 기능 설정 
	*/
	Win10DTO dto;
	public Win10Service() {
		dto = new Win10DTO();
		HashMap<String, String> map = new HashMap<>();
		map.put("Ram", "16GB");
		dto.setInfo(map);
	}
}
