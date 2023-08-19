package net.hackspace.creational.singleton;

public class SingletonLazyInstance {

	// Have a private constructor so that it cannot be instanciate other then
	// from this class.
	private SingletonLazyInstance() {
	}

	public static SingletonLazyInstance uniqueInstance = null;
	public static final SingletonLazyInstance getInstance(){
		if(uniqueInstance == null){
			System.out.println("Creating the instance for first and only time ");
			uniqueInstance = new SingletonLazyInstance();
		}
		return uniqueInstance;
	}
	public int stateholder = 1;

	public void doCounting() {
		System.out.println("Each time this method is called, it current state would get incremanted by 5");
		for (int i = 1; i <= 5; i++,stateholder++)
			System.out.println("Count is " + stateholder);
	}

}
