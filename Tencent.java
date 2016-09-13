import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 给出一个整数。。求小于这个整数的质数 之和为这个整数的组数。。包括质数本身*2 这种情况
 */

/**
 * @author Iver3on
 * @date 2016年9月11日
 */
public class Tencent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		 for(int j = 2; j<m; j++){
	            if(m(j)){
	            	System.out.print(j+" ");
	               l.add(j);
	            }
	        }
		 int n = 0;
		 Collections.sort(l);
		 for(int i=0,j=l.size()-1;i<=j;){
			 if(l.get(i)+l.get(j)<m){
				 i++;
				 continue;
			 }
			 if(l.get(i)+l.get(j)>m){
				 j--;
				 continue;
			 }
			 if(l.get(i)+l.get(j)==m){
				 i++;
				 j--;
				 n++;
			 }
		 }
		 System.out.println(n);
	}

	 public static boolean  m(int num){     
	        for(int j = 2; j<=Math.sqrt(num);j++){
	            if(num%j == 0){
	                return false;
	            }
	        }        
	        return true;
	    }
}
