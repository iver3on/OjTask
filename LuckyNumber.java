/**
 * 
 */
package jd96;

import java.util.Scanner;


/**
 * @author Iver3on
 * @date 2016年9月5日
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] t = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				out(t[i]);
			}
			System.out.println();
		}
		
	}

	/**
	 * @param i
	 */
	private static void out(int m) {
		int sum = 0;
		int num = 0;
		for (int i = 1;; i++) {
			sum = (int) (sum + Math.pow(2, i));
			if (sum > m) {
				num = i;
				break;
			}
		}

		int index = (int) (m - (sum - Math.pow(2, num)) - 1);
		int[] result = new int[num];
		int j = -1;
		do {
			if (index % 2 != 0) {
				result[++j] = 1;
			} else {
				result[++j] = 0;
			}
		} while ((index /= 2) != 0);
		StringBuffer sb = new StringBuffer();
		for (int i = num - 1; i >= 0; i--) {

			if (result[i] != 0) {
				sb.append("7");
			} else {
				sb.append("4");
			}
		}
		System.out.println(sb.toString().trim());
	}

}
