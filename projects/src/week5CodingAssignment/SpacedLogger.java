package week5CodingAssignment;
/*
* Create two classes that implement the Logger interface
* 		a. AsterikLogger
* 		b.SpacedLogger
* The SpacedLogger should add spaces between each character of the String argument passed into its methods.
* The error method should do the same , but with the "ERROR:" preceding the spaced out input 
*/

public class SpacedLogger implements Logger{

	@Override
	public void Log(String str) {
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i)).append(" ");
		}
		System.out.println("log");
	}

	@Override
	public void Error(String str) {
		String er = ("ERROR: " + str);	
		Log(er);
	}
}
