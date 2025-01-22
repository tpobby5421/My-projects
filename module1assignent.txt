// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  public class Main {
    public static void main(String[] args) {
      Double myVar1 = 88.2;
      Double myVar2 = 78.9;
      Double myVar3 = 97.6;
       System.out.println("Test score: " + myVar1);
       System.out.println("Test score: " + myVar2);
       System.out.println("Test Score: " + myVar3);
       Double average = ((myVar1 + myVar2 + myVar3) / 3);
       Double rounded = Math.round(average * 10.0) / 10.0;
       System.out.println("The average grade is " + rounded);
      
      
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
