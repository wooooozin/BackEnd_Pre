package ch06;

public class Chapter1 {

	public static void main(String[] args) {
		
		System.out.println("TEST1");
		
		// int -> 32bit
		// 2진수 -> 00000000_00000000_00000000_0000000
		// 2진수 -> ff_ff_ff_ff
		int iNum = 10; // 10진수
		int bNum = 0b10; // 2진수
		int xNum = 0x10; // 16진수
		int oNum = 010; // 8진수

		System.out.println(iNum); // 10
		System.out.println(bNum); // 2
		System.out.println(xNum); // 16
		System.out.println(oNum); // 8
		
		// 2의 보수
		int bNum1 = 0b0000_0000_0000_0000_0000_0000_0000_1100; // 12
		int bNum4 = 0b1111_1111_1111_1111_1111_1111_1111_0100;
		// bNum1(12)에 대한 2의 보수는
		// bNum1 에 대한 1의 보수 + 1;
		
		// 0b1111_1111_1111_1111_1111_1111_1111_0011 반대 비트 여기에 +1;
		// 0b1111_1111_1111_1111_1111_1111_1111_0100;

		int bNum2 = 0b1000_0000_0000_0000_0000_0000_0000_1100; // 부호비트를 1로 바꾼다면?, -12가 나올까?
		int bNum3 = bNum1 + bNum4;
		System.out.println(bNum1);
		System.out.println(bNum4); 
		System.out.println(bNum3); 

	}

}
