package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {

		// intNum에 저장된 값들중에 5가 있으면
		// 몇번째에 있는지 찾아 보세요.

		int[] intNum = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;

		}

		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");

		}
		System.out.println();
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] == 7) {
				System.out.println((i + 1) + "번째입니다\t");
				break;
				 
			}
			int index ;
			for (index = 0; index < intNum.length; index++) {
				if (intNum[index] == 7) {
					System.out.println("7은"+ (index + 1) + "번째입니다\t");
					break;

	}

	// intNum에 저장된 값들중에서 7이 최초에
	// 몇번째에 나타나는지 찾아보세요
	// 만약7이 없으면 없다교 표시
	

}}}}
