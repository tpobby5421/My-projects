import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int[] array;
    private Random rand = new Random();

    // Constructor
    public IntArray(int l) {
        array = new int[l];
    }

    // Returns the size of the array
    public int size() {
        return array.length;
    }

    // Fills the array with random numbers between 1 and 6
    public void fillRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(6) + 1; // Random numbers between 1 and 6
        }
    }

    // Fills the array with random numbers within a specified range
    public void fillWithNumbers(int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
    }

    // Sets a specific index to a given value
    public void set(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Retrieves the value at a specific index
    public int get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Clears the array (sets all elements to zero)
    public void clear() {
        Arrays.fill(array, 0);
    }

    // Checks if the array is empty (all elements are zero)
    public boolean isEmpty() {
        for (int num : array) {
            if (num != 0) return false;
        }
        return true;
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(array);
    }

    // Returns a string representation of the array
    public String toString() {
        return Arrays.toString(array);
    }
}
