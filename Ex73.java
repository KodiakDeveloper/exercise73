package bookExercises;

import javax.swing.JOptionPane;

public class Ex73 {

	static void calculateFactorial() {

		int a, factorial;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a value to calculate its factorial"));

		if (a <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			factorial = a;

			for (int i = a - 1; i > 0; i--) {

				factorial *= i;

			}

			JOptionPane.showMessageDialog(null, "Factorial of = " + a + "\nFinal Result = " + factorial);

		}
	}

	public static void main(String[] args) {

		String userAnswer;

		do {

			calculateFactorial();

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
