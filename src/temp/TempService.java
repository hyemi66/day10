package temp;

public class TempService {
	/*
	 연산을 담당
	 온도를 올리고 내리는 연산
	 온도는 TempDTO에 있는 변수 활용
	 private int temp = 10; 
	*/
	TempDTO dto = new TempDTO();
	public int upTemp() {
		int t = dto.getTemp() + 1;
		dto.setTemp(t);
		return t;
	}
	public int downTemp() {
		int t = dto.getTemp() - 1;
		dto.setTemp(t);
		return t;
	}
	public void temp(int t) {
		System.out.println("온도 : "+t);
	}
}
