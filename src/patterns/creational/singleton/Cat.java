package patterns.creational.singleton;

public class Cat {

	private static Cat instance = null;

	private Cat() {
		//Nothing to do here
	}

	public static Cat getInstance() {
		if (instance == null) {
			instance = new Cat();
		}
		return instance;
	}
}
