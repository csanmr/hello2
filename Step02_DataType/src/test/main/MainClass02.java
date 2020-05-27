package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해보세요.
		double a=(kor+eng)/2.0; // (int+int)/int(정수)형식이면 소수점 계산이 안 됨 실수가 하나라도 존재해야함
		System.out.println("평균:"+a);
	}
}
