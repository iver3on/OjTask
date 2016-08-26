/**
 * 
 */

/**
 * @author Iver3on
 * @date 2016Äê8ÔÂ26ÈÕ
 */
public class ZTEcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(6);
	}

	public static void print(int n) {
		int max = n * n;
		String[] s = new String[n];
		int index = 0;
		for (int i = 1; i <= max; i = i + n) {
			StringBuffer sb = new StringBuffer();
			for (int j = i; j < i + n; j++) {
				if (j != i + n - 1) {
					sb.append(j + "*");
				} else {
					sb.append(j);
				}
			}
			s[index] = sb.toString();
			index++;
		}

		for(int i=0;i<n;i = i+2){
			if(i%2==0){
				System.out.println(s[i]);
			}
		}
		for(int m = n;m>0;m--){
			if(m%2==1){
				System.out.println(s[m]);
			}
		}
	}
}
