package practicearea;

public class OneToHundered {

	public static void main(String[] args) {
		//Calculate();
		PrintNum();
		swappinString();
	}
	public static void Calculate() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	public static void PrintNum() {
		int one='A'/'A';
		String s1="..........";
		for(int i=one;i<=(s1.length()*s1.length());i++) {
			System.out.println(i);
		}
	}
	public static void swappinString() {
		String s1="Hello";
		String s2="Ganesh";
		System.out.println("Before Swapping s1 : "+s1);
		System.out.println("Before Swapping s2 : "+s2);
		// using append method
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After Swapping s1 is : "+s1);
		System.out.println("After Swapping s2 is : "+s2);
		
	}
}
