package week5CodingAssignment;
/*
 * Create two classes that implement the Logger interface
 * 		a. AsterikLogger
 * 		b.SpacedLogger
 * The log method on the AsteriskLogger should print the String it receives between 3 asterisk on either side of the string
 * The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word "ERROR:"
 */
public class AsteriskLogger implements Logger{

	@Override
	public void Log(String str) {
		System.out.println("***" + str + "***");
	}

	@Override
	public void Error(String str) {
		String error = "Error" + str;
		System.out.println("************");
		Log(error);
		System.out.println("************");
	}
}
