package practicearea;

public class MaxiNumberFromArray {
	public static MaxiNumberFromArray mf=new MaxiNumberFromArray();
	public static void main(String[] args) {
	
		//MaxiNumberFromArray mf=new MaxiNumberFromArray();
		//mf.maxnum();
		//mf.minmum();
		mf.maxnum().minmum();
//		MaxiNumberFromArray.maxnum();
//		MaxiNumberFromArray.minmum();;
//		maxnum();
//		minmum();
	}
		
	
	public MaxiNumberFromArray maxnum() {
		int nums[]= {1,2,3,4,5,6,7,8};
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
				
			}
		}
		System.out.println("Maximum number is "+max);
	//this.max=max;
	return this;
	}
	public MaxiNumberFromArray minmum() {
		int mins[]= {1,2,3,4,5,6,7,8};
		int min=mins[0];
		for(int i=0;i<mins.length;i++) {
			if(mins[i]<min) {
				min=mins[i];
			}
		}
		System.out.println("Minimum number from array is "+min);
		return this;
	}
	}
