import javax.swing.JOptionPane;

//On the whiteboard (or on paper) write the following methods:


//1. Write a method to support the code below, that prints "The League rocks" when it is called.

public class introToMethodsWS	{
	public static void main(String args[])	{
		//weRock();
		//rocker(JOptionPane.showInputDialog("What is your name?"));
	}
	
	public static void weRock()	{
		System.out.println("The League rocks");
	}

//weRock(); //prints "The League rocks"

//2. Write a method to support the code below, that takes a name as a parameter and prints that they rock.
	
	public static void rocker(String name) {
		System.out.println(name + " rocks!");
	}

//rocker("Bob"); //prints "Bob rocks"


//3. Write a method to support the code below, that takes a name as a parameter and adds " is awesome" if the name is your favorite singer, but " is annoying " if it is someone else.

	void truth(String name) {
		if (name.equals("Rob Thomas")) {
			name += " is awesome";
		} else {
			name += " is annoying";
		}
	}

//truth("Rob Thomas"); //prints "Rob Thomas is awesome"
//truth("Justin Bieber"); //prints "Justin Bieber is annoying"


//4. Write a method to support the code below, that takes a word as a parameter and prints it twice.

	void echo(String word) {
		System.out.println(word + " " + word);
	}

//echo("hello"); //prints "hello hello"


//5. Write a method to support the code below, that takes a word and a number as parameters and prints the word a number of times.

	void repeat(String word, int number) {
		for (int i = number; i > 0; i--) {
			System.out.println(word);
		}
	}

//repeat("mayday", 4); //prints "mayday mayday mayday mayday"


//6. Write a method to support the code below that returns the name of the best programmer.

	 String getTheBestCoder() {
		String name = "theBest";
		return name;
	}

//String theBest = getTheBestCoder();
//System.out.println(theBest);


//7. Write a method to support the code below that adds 2 whole numbers and returns the result.

	 int add(int num1, int num2) {
		 int numFinal = num1 + num2;
		 return numFinal;
	 }

//int sum = add(2,2);
//System.out.println(sum); //prints 4


//8. Write a method that figures out whether a given number is odd or not.

	  void oddOrNot(int number) {
		  if (number % 2 != 0) {
			 System.out.println("It's odd");
		  } else {
			 System.out.println("It's even");
		  }
	 }
}

//[Optional] 9. Try these:


//Sum Double
//Monkey Trouble
