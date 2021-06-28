import java.util.Arrays;
import java.util.Scanner;


public class sieve {
	public static boolean[] sieve (int n) {
		
		boolean [] sieve = new boolean[n];
			for(int i=2;i<n;i++) {
				
				sieve[i] = true;	
			}
			for(int base = 2; base<=(int)Math.sqrt(n);base++) {
				if(sieve[base] == true) {
					for(int bool = base*base; bool < n; bool = bool + base) {
						sieve[bool] = false;
					}
				}
			}

			
			return sieve;
	}
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to determine a range of integers that are/are not prime? Enter a number below:");
		int answer = scanner.nextInt();
		System.out.println("Prime numbers from integers between 0-" + answer + ":");
		System.out.print(Arrays.toString(sieve(answer)));
	}
}
