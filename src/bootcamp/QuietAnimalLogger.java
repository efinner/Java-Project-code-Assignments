package bootcamp;

public class QuietAnimalLogger implements AnimalLogger{

	@Override
	public void speak(String animalName) {
		System.out.println(animalName.toLowerCase());
		
	}

	@Override
	public void action(String animalName, String activity) {
	System.out.println(animalName.toLowerCase()+   " makes a "+ activity + " Sound");
		
	}

}
