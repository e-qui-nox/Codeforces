import java.util.*;
import java.lang.*;

public class 268A {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] home = new int[n];
		int[] away = new int[n];
		
		for(int i=0; i<n; i++) {
		    home[i] = sc.nextInt();
		    away[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n; i++)
		    for(int j=0; j<n; j++) {
		        if(home[i] == away[j]) //comparing each value in the home array with every values in the away array
		            count++;
		    }
		
		System.out.println(count);
		
		sc.close();
	}
}
