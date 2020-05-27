package test.main;
/*
 * [ Jaba 기본 데이터 type ]
 * 
 * 2. 논리형 (boolean)
 * - true, false 두가지 값 중 하나이다
 * - true, false를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
 * - 참과 거짓을 나타내는 데이터 type
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
		//비교 연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리 연산의 결과로 얻어진 boolean 값 담기
		boolean result=true||false;
		
		//한 번 선언한 변수에 다시 선언 불가능.
		//boolean result=false;
		result=false; //변수에 다른 값을 대입 할 수 있다(동일한 type인 경우)
		//result=10; //다른 type값은 변수에 담을 수 없다.
	}
}
