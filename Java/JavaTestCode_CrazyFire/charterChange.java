import java.util.Scanner;

public class charterChange{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		String inputString = input.nextLine();
		for( int i = inputString.length() - 1; i >= 0; i-- ){
			System.out.printf("%c", inputString.charAt(i));
		}
	}
}