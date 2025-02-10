import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First Pet: Using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Second Pet: Using custom constructor
        Pet pet2 = new Pet("Buddy", "Dog", 3);
        System.out.println(pet2);

        // Third Pet: Taking user input
        System.out.print("\nEnter pet's name: ");
        String userPetName = input.nextLine();

        System.out.print("Enter pet's type (e.g., Dog, Cat, Fish): ");
        String userPetType = input.nextLine();

        System.out.print("Enter pet's age: ");
        int userPetAge = input.nextInt();
        
        Pet pet3 = new Pet(userPetName, userPetType, userPetAge);
        System.out.println(pet3);

        // Closing scanner
        input.close();
    }
}
