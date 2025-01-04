package bootcamp;

public class LoudAnimalLogger implements AnimalLogger{

	@Override
	public void speak(String animalName) {
		System.out.println(animalName.toUpperCase());
		
	}

	@Override
	public void action(String animalName, String activity) {
		System.out.println(animalName.toUpperCase()+ activity);
	}

}
