/**
 * 春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
现在要求输出所有在m和n范围内的水仙花数。
 */
package jd95;

import java.util.Scanner;

/**
 * @author Iver3on
 * @date 2016年9月5日
 */
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			boolean tag  = false;
			for(int i = m;i<=n;i++){
				if(ok(i)){
					tag = true;
					System.out.print(i+" ");
				}
			}
			if(!tag)
			System.out.println("no");
		}
	}
	public static boolean ok(int n){
		int x = n/100;
		int y = (n-x*100)/10;
		int z = (n-y*10-x*100);
		if(Math.pow(x, 3)+Math.pow(y, 3)+Math.pow(z, 3)==n){
			return true;
		}
		return false;
	}
}
