package com.tnsif.armstrong;

public class Armstrong {

	public static void main(String[] args) {
		int num=407,temp,rem,result=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			result=result+rem*rem*rem;
			num=num/10;
					
		}
		if(result==temp) {
			System.out.println(temp+""+"is an Armstrong number");
		}else
		{
			System.out.println(temp+""+"is not an Armstrong number");
			
			
		}
	}

}
