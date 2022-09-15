package fristproject;

public class PROG2 {
	public static void main(String[] args) {
		int k=1;
		int b [] = {1,2,3,6,9,-9,-8,-56,-89,9};
	for (int i=0;i<9;i++) {
		if(b[i]<0){
			k *=b[i];
			
		}
	}
System.out.println("the product of negative numbers is "+k);

	}

}
