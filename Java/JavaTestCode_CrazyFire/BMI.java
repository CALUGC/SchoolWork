import java.util.Scanner;

public class BMI{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		double height = input.nextDouble();
		double weight = input.nextDouble();

		double BMII = weight / (( height * 0.01 ) * ( height * 0.01 ));

		if( BMII < 18.5 ){
			System.out.println( "Underweight" );
		}
		else if( BMII < 24 ){
			System.out.println( "Normal" );
		}
		else if( BMII < 30 ){
			System.out.println( "Overweight" );
		}
		else{
			System.out.println( "Obese" );
		}
	}
}