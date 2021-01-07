import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
	{
		outputInstructions();
		String prePigLatin = getUserInput();
	
		String postPigLatin = PigLatin.convertPigLatin(prePigLatin);
		System.out.println(postPigLatin);

  }
	public static void outputInstructions()
	{
		System.out.println("This program will convert any string to PigLatin. This is a simplified form and will remove the first character of every word, move it to the end of the corresponding, and add \"ay\" at the end of the word");
		System.out.println("Please enter a sentence: ");
	}
	public static String getUserInput()
	{
		Scanner kbReader = new Scanner(System.in);
		String userInput = kbReader.nextLine();
		return userInput;
	}
}