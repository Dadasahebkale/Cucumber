package practicearea;

public class ReverseString {

	public static void main(String[] args) {
		String str="Dadasaheb";
		char strArray[]=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
		}
	}
}
