package prob04;

import java.util.Arrays;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		String[] arr = new String[str.length()];
		System.out.println(Arrays.toString(arr));
		
//		for (int i=arr.length-1; i<=0; i--) {
//			arr[i] = String.valueOf(str.charAt(i));
//		} 
		
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.print(array);
		
	}
}