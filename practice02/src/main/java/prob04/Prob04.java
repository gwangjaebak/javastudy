package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[arr1.length-i-1];
		}
		return arr2;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for (char ch : array) {
			System.out.println(ch);
		}
		System.out.println();
	}
}