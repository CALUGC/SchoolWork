import java.util.Scanner;

public class displofChar{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int rows = input.nextInt();
		int columns = input.nextInt();
		String fillup = input.next();

		for( int i = 0; i < rows; i++ ){
			for( int j = 0; j < columns; j++ ){
				System.out.printf("%s", fillup);
			}
			System.out.printf("\n");
		}
	}
}