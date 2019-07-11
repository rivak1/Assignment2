package get2019.assignment2;

import java.util.HashMap;

public class HexFunction {

	String a;
	int hexa(String a){
		int startWord=10;
		int base=1;
		int sum=0;
		a=a.toUpperCase();
		for(int i=a.length();i>0;i--){
			if((a.charAt(i-1)>='A' && a.charAt(i-1)<='Z')){
				//System.out.println(a.charAt(i-1)-55);	
				sum=sum+(a.charAt(i-1)-55)*base;
				//System.out.println(sum);
				base=base*16;
			}else {
				//System.out.println(a.charAt(i-1)-48);
				sum=sum+(a.charAt(i-1)-48)*base;
				base=base*16;
			}
		}
		return sum;	
		
	}
	String decimal(int  a){
		System.out.println(a);
		String h="";
		char k;
		int i=0;
		String z=String.valueOf(a);
		//System.out.println(z.split('.'));
		int remainder []= new int[z.length()];
		int quotient=0;
		while(a>0){
			remainder[i]=a%16;
			System.out.println(i+"R"+a%16);
			System.out.println(i+"Q"+a/16);
			a=a/16;
			i=i+1;
		}
		for(int j=remainder.length-1;j>0;j--) {
			System.out.print("V"+remainder[j-1]);
			if(remainder[j-1]>=10&&remainder[j-1]<=15){
				k = (char)(remainder[j-1]+55);
				h=h+k;
			}else {
				k = (char)(remainder[j-1]+48);
				h=h+k;
			}
		}
		return h;
		
	}
	String add(String a,String b) {
		int a1=hexa(a);
		int b1=hexa(b);
		//System.out.println(a1+b1);
		return decimal(a1+b1);
	}
	String m(String a,String b) {
		int a1=hexa(a);
		int b1=hexa(b);
		System.out.println(a1+"<->"+b1);
		
		return decimal(a1*b1);
	}
	String d(String a,String b) {
		int a1=hexa(a);
		int b1=hexa(b);
		if(a1<b1) {
			int temp=a1;
			a1=b1;
			b1=temp;
		}
		System.out.println(a1+"-"+b1);
		return decimal(a1/b1);
	}
	String s(String a,String b) {
		int a1=hexa(a);
		int b1=hexa(b);
		//System.out.println(a1+b1);
		return decimal(a1-b1);
	}
	
}
