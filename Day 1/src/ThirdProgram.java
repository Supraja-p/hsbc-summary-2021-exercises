import java.util.Scanner;

public class ThirdProgram {
public static void printEven(int num1,int num2) {
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
			System.out.println(i+" ");}
		}
	}

public static void printOdd(int num1,int num2) {
	if(num2%2!=0) {
		for(int i=num1;i<=num2;i++) {
			if(i%2!=0) {
			System.out.println(i+" ");
			}
		}
	}
}
public static void main(String[] args) {
	printEven(15,40);
	printOdd(10,25);
}
}
