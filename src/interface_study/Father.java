package interface_study;

public interface Father {

	void money();

	void property();

	static void nature() {
		System.out.println("fathers nature");
	}

	static void love() {
		System.out.println("fathers love");
	}

	default void look() {
		System.out.println("fathers default look");
	}
}
