public class Pet2 {   
    // Private data fields
    private String name;

    // Public constructor
    public Pet2() {
        this.setName("");
    }

    // Public setter (mutator) method
    public void setName(String newName) {
        this.name = newName;
    }

    // Public getter (accessor) method
    public String getName() {
        return this.name;
    }

    public String toString() {
        String output = "Pet name: ";
        output += this.getName();
        return output;
    }

    // Main method
    public static void main(String[] args) {
        Pet2 myPet = new Pet2();
        myPet.setName("Bartholomew");  
        System.out.println(myPet.getName());  
        System.out.println("Pet name: " + myPet); 
    }
}