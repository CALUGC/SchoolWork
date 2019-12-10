import java.util.Scanner;

public class StringSplit{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		while( input.hasNext() ){
			String inputStr = input.next();
			for( int i = 0; i < inputStr.length(); i++ ){
				if( Character.isUpperCase(inputStr.charAt(i)) == true && i != 0 ){
					System.out.printf(" %c", inputStr.charAt(i));
				}
				else{
					System.out.printf("%c", inputStr.charAt(i));
				}
			}
			System.out.printf("\n");
		}
	}
}