package atv2Fibonacci;

import java.util.Scanner;

public class Main {
	public static boolean fib(int n) {
	    int n1 = 0;
	    int n2 = 1;
	    do {
	        int n3 = n1;
	        n1 = n2;
	        n2 = n3 + n2;
	        }
	    while (n2 < n);

	    if (n2 == n)
	        return true;
	    else
	        return false;
	}

	public static void main(String[] args) {
		int n = 8;
		Scanner src = new Scanner(System.in);
		
		System.out.println("Escreve o numero que voce deseja saber se e parte da sequencia de Fibonacci.");
		n = src.nextInt();
		
		if(fib(n))
			System.out.println("E parte da sequencia.");
		else 
			System.out.println("Não e.");

	}

}
