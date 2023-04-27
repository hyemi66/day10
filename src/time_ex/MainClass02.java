package time_ex;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("시작");
		long start = System.currentTimeMillis();
		// try catch 예외처리
		try {
			Thread.sleep(3000); // 3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("끝");
		System.out.println((end - start)/1000);
	}
}
