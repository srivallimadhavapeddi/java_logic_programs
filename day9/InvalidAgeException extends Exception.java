//User defined Exception

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); 
    }
}

public class InvalidAge {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            validateAge(16); 
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}