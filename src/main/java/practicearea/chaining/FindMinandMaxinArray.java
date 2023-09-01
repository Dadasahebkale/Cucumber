package practicearea.chaining;

public class FindMinandMaxinArray {
	public static int MyArray[]= {1,2,3,4,5,11,23,44,56,78,80};
	public static FindMinandMaxinArray fm=new FindMinandMaxinArray();
	public static void main(String[] args) {
	fm.maxiMum().miniMum().Median().ReverseString().Middlevalue().ReversNumber().ArmStrong();
	fm.ArmStrongOneToHundred();
	}
	public FindMinandMaxinArray maxiMum() {
		
		int max=MyArray[0];
		for(int i=0;i<MyArray.length;i++) {
			if(MyArray[i]>max) {
				max=MyArray[i];
			}
		}
		System.out.println("Maximum number in array is "+max);
		return this;
	}
	public FindMinandMaxinArray miniMum() {
		int min=MyArray[0];
		for(int i=0;i<MyArray.length;i++) {
			if(MyArray[i]<min) {
				min=MyArray[i];
			}
		}
		System.out.println("Minimum number in array is :"+min);
		return this;
	}
	public FindMinandMaxinArray ReverseString() {
		String str="emocleW";
		char []strArray=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
			
		}
		return this;
	}
	public FindMinandMaxinArray Middlevalue() {
		int n=11;
		MyArray[0]=n;
		double mid=0;
		if(n%2==1) {
			mid=MyArray[(n+1)/2-1];
		}else {
			mid=(MyArray[n/2-1]+MyArray[n/2])/2;	
		}
		System.out.println("Middle value is "+mid);
		return this;
	}

public FindMinandMaxinArray Median() {
  	    int n=5;
  	    double a[]= {10,20,30,40,50};

double m=0;
if(n%2==1)
{
	m=a[(n+1)/2-1];
}
else
{
	m=(a[n/2-1]+a[n/2])/2;
}

   System.out.println("Median :"+m);
   return this;
}
public FindMinandMaxinArray ReversNumber(){
	int num=153,result=0,remi;
	while(num>0) {
		remi=num%10;
		result=(result*10)+remi;
		num=num/10;
		
	}
	System.out.println("Reverse number is :"+result);
	return this;
}
public void ArmStrong() {
	int num=123,rem,temp,result=0;
	temp=num;
	while(num>0) {
		rem=num%10;
		result=(rem*rem*rem)+result;
		num=num/10;
	}
	if(temp==result) {
	System.out.println(" ArmStrong number");
}else {
System.out.println(" Not armstrong number");	
}
}
public FindMinandMaxinArray ArmStrongOneToHundred() {
int num,result=0,rem;
System.out.println("Armstrong number from 1 to 1000");
for(int i=1;i<=1000;i++) {
	num=i;
	while(num>0) {
		rem=num%10;
		result=(rem*rem*rem)+result;
		num=num/10;
	}
	if(result==i) {
		System.out.print(i+" ");
	}
	result=0;
	
}
return this;
}
}
