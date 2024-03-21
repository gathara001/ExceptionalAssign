
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
class Patient {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130){
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 130.");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}


public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();

        try {
            patient.setAge(25);
            System.out.println("Patient's age: " + patient.getAge());

            patient.setAge(150);
            System.out.println("Patient's age: " + patient.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age Exception: " + e.getMessage());
        }

    }
}