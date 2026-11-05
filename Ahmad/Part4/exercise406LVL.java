package Atelier_5.Ahmad.Part4;


public class exercise406LVL {
    public static void main(String[] args) {



        for (int i = 1; i <= 3; i++) {

            System.out.println("Outer loop: " + i);

            for (int j = 1; j <= 5; j++) {

                if (j == 3) {
                    break;
                }

                System.out.println("Inner loop: " + j);

            }
        
        
        
        }
    
    
    
    }
}

// when the outer loop reaches it's 3rd print , it breaks and the inner loop continues it's remaining loop before it stops 