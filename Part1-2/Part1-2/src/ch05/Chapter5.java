package ch05;

public class Chapter5 {
	
	// 필드 정
	int age;
	// int -> 키워드
	// age -> 식별자(변수)
	int age1 = 10;
	
	// 메서드
	
	// 두개의 숫자갑을 입력받아서 높은 값을 구하는 메서드
	public int maxNumber(int x, int y) {
		int num = x > y ? x : y;
		return num;
	}
	
	public void getAge() {
		this.maxNumber(age1, age)
		System.out.println(age);
	}

}
