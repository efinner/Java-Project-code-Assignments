package bootcamp;

public class AnimalApp {

	public static void main(String[] args) {
		AnimalLogger loudLogger = new LoudAnimalLogger();
		AnimalLogger quietLogger = new QuietAnimalLogger();
		
		loudLogger.speak("speak to me");
		loudLogger.action("Gee gee", "Bark");
		
		quietLogger.speak("Talk to me nice");
		quietLogger.action("Hannah", " meow");
	}

}


//In this project, I implemented the AnimalLogger interface to define two methods: speak and action. These methods represent behaviors that can be shared by different types of loggers. By creating the LoudAnimalLogger and QuietAnimalLogger classes, I was able to provide distinct implementations for these methods.

//LoudAnimalLogger: This class outputs messages in uppercase to simulate loud behavior. For example, it ensures that both the animal's name and its activity appear bold and intense, reflecting a loud personality.
//QuietAnimalLogger: This class outputs messages in lowercase to represent soft and quiet behavior. It adds descriptive text like "softly" or "quietly" to emphasize the gentle nature of the output.
//By using the AnimalLogger interface, I ensured both logger classes followed a common structure, making the code flexible and reusable. In the AnimalApp class, I created instances of LoudAnimalLogger and QuietAnimalLogger to test their behaviors with different animal names and activities. Using polymorphism allowed me to treat both loggers as AnimalLogger objects while still using their unique implementations.
//
//This approach reinforces key Object-Oriented Programming concepts like abstraction, polymorphism, and code reusability. It also demonstrates how to handle distinct behaviors in a consistent and organized way. This exercise was useful for practicing interface design, class implementation, and method overriding.
//
//
//
//
//
//
