import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		answerReader answers;
		inputReader inputs;
		Checker c;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			answers = new answerReader();
			c = new Checker();
			System.out.println("Input exit to kill the program");
			System.out.println("Choose the Evaluation number(1~6):");
			try {
				String read = in.next();
				if(read.equals("exit")) {
					System.exit(0);
				}
				int num = Integer.valueOf(read);
				answers.readAnswers("answers/"+ num +".txt");
				inputs = new inputReader(answers.getSize());
				inputs.readInput();
				c.check(answers.getAnswers(), inputs.getInputs());
				System.out.println(c.toString());
			}catch (InputMismatchException e) {
				System.out.println("Wrong path");
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			

			
		}
		
	}
	
}
