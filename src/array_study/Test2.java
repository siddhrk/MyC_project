package array_study;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		char grade[] = new char[8];

		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		for (int i = 0; i <= 5; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("======================================");

		for (int i = 0; i <= grade.length - 1; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("*******************After Sorting***********************");
		Arrays.sort(grade);
		for (int i = 0; i <= grade.length - 1; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("*****************descinding Order*****************");

		for (int i = grade.length - 1; i >= 0; i--) {
			System.out.println(grade[i]);

		}
	}
}