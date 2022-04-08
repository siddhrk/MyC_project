package interface_study;

public interface Mother {

void love();
void nature();
default void look() {
	System.out.println("mothers default look");
}
}
