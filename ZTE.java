/**
 * ���˱�����
 */

/**
 * @author Iver3on
 * @date 2016��8��25��
 */
public class ZTE {
	public static int x = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s1 = 1;
		s1 +=1;//correct 
		//short s1 = 1; s1 = s1 + 1;�д�s1��short�ͣ�s1+1��int��,������ʽת��Ϊshort�͡�
		//���м�ദ�˸���ֵ��s1=s1+1�Ĺ��̣�������˵������
		//��s1 += 1��û�и�ֵ���̣��������Ϊs++���Ͳ���Ҫ���͵�ת��������Ҳ����˵���Զ����͵�ת����
		//public static int main ��String []arg�� ������main����
		float x = 1,y = 2,z = 3;
		//�ȼ��������Լ�  �ټ������  �����Ǹ�ֵ ע����float  3.5
		System.out.println(y+=z--/++x);
		System.out.println(Math.round(-11.5));// -11
		System.out.println(Math.round(11.5));// 12
		/*
		 * 5������x=10��y=20��z=30���������б��ʽ��ֵ��6�֣�
����A x<10||x>10_________false
����B !(x<=20)___________false
����C z-y==x&&Math.abs(y-z)!=x_____________false
		 * 
		 */
	}

	//equals()��Object���ṩ�ķ���֮һ��Object���ж����equals������ֱ��ʹ�á�==��������Ƚϵ���������������û�и���equals����������£�equals��
	//==�����һ�����ȽϵĶ������á�
	//equals������������Ա����ǡ�����String���equals�����Ƚϵľ��Ƕ�������������Ƿ���ͬ�������е������Ƿ���ͬ��
}
