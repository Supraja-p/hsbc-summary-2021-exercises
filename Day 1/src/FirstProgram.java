import java.util.Scanner;

public class FirstProgram {
	public static void checkAlphabet(char c) {
		if((c>='a'&&c<='z')||(c>='A' &&c<='Z')) {
			System.out.println(c+" is an alphabet");
		}
		else {
			System.out.println(c+"is not a alphabet");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	char ch = sc.next().charAt(0);   
	checkAlphabet(ch);
}
}
