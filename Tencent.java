import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
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
	            	System.out.println(j);
	               l.add(j);
	            }
	        }
		 int sum = 0;
		 int n = 0;
		 int index = 0;
		 Collections.sort(l);
		 for(int i=0;i<l.size();i++){
			sum = l.get(i)*2;
			if(sum==m){
				n++;
				index = i;
			}
		 }
		 
		 for(int i=0,j=l.size()-1;i<index&&j>index;){
			 if(l.get(i)+l.get(j)<m){
				 i++;
				 continue;
			 }
			 if(l.get(i)+l.get(j)==m){
				 n++;
				 break;
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
