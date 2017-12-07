package assignment2;

/**
 * REQUIREMENT 3:
 * 
 * The class must have an immutable String called speakParameter (note camel case)
 * 
 * REQUIREMENT 4:
 * 
 * The class must have a non-static method called speak which prints the speakParameter
 * onto the screen.
 * 
 * 
 * @author tim
 */
public class Animal {

    public Animal(String speakParameter) {
        this.speakParameter = speakParameter;
    }
    private final String speakParameter;
    public void speak(){
        System.out.println(this.speakParameter);
    }
}
