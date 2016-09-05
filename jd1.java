/**数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
输入
输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
输出
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
样例输入
81 4
2 2
样例输出
94.73
3.41
 * 
 */
package jd95;

import java.text.DecimalFormat;
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
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			double sum = 0;
			double s = n;
			DecimalFormat df = new DecimalFormat("#.00");
			for (int i = 0; i < m; i++) {
				sum = sum + s;
				s = Math.sqrt(s);
			}
			System.out.println(df.format(sum));
		}
	}

}
