public class Pet {   
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.setName("Random Pet");
        this.setType("Animal");
        this.setAge(0);
    }

    // Custom constructor with 3 parameters
    public Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    // Set (mutator) methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) { // Ensuring age is not negative
            this.age = newAge;
        } else {
            this.age = 0; // Default age if input is invalid
        }
    }

    // Get (accessor) methods
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    // Method to make the pet speak
    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "yowl";
        }
    }

    // Updated toString() method
    public String toString() {
        String output = "\nPet Information:\n";
        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age: " + this.getAge();
        return output;
    }
}

