/**
 * 中兴笔试题
 */

/**
 * @author Iver3on
 * @date 2016年8月25日
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
		//short s1 = 1; s1 = s1 + 1;有错，s1是short型，s1+1是int型,不能显式转化为short型。
		//这中间多处了个赋值的s1=s1+1的过程，就如你说的那样
		//而s1 += 1，没有赋值过程，可以理解为s++，就不需要类型的转换，或者也可以说是自动类型的转换；
		//public static int main （String []arg） 可以是main方法
		float x = 1,y = 2,z = 3;
		//先计算自增自减  再计算除法  后面是赋值 注意是float  3.5
		System.out.println(y+=z--/++x);
		System.out.println(Math.round(-11.5));// -11
		System.out.println(Math.round(11.5));// 12
		/*
		 * 5：假设x=10，y=20，z=30；计算下列表达式的值（6分）
　　A x<10||x>10_________false
　　B !(x<=20)___________false
　　C z-y==x&&Math.abs(y-z)!=x_____________false
		 * 
		 */
	}

	//equals()是Object类提供的方法之一。Object类中定义的equals方法是直接使用“==”运算符比较的两个对象，所以在没有覆盖equals方法的情况下，equals和
	//==运算符一样，比较的都是引用。
	//equals区别就是他可以被覆盖。比如String类的equals方法比较的就是独立对象的内容是否相同，即堆中的内容是否相同。
}
