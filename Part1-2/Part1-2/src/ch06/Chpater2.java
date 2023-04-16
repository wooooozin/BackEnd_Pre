package ch06;

import javax.lang.model.element.NestingKind;

public class Chpater2 {
	
	public static void main(String[] args) {
		
		// long - 64bit
		long lNum = 0b0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0001;
		long lNum2 = 0x00_00_00_00_00_00_00_01; // 8진
		System.out.println(lNum);
		System.out.println(lNum2);
		
		// int Max, min 값
		int iNum1 = Integer.MAX_VALUE;
		int iNum2 = Integer.MIN_VALUE;

		System.out.println(iNum1);
		System.out.println(iNum2);
		
		//short - 8bit
		short sNum = 10;
		short sNum1 = 11;
		short sNum2 = (short) (sNum + sNum1); // 자바에서 연산하게되면 int타입으로 처리하기 때문에 short 타입으로 항변환 필요
		
		System.out.println(sNum2);
		
		// 실수형 
		
	}

}
