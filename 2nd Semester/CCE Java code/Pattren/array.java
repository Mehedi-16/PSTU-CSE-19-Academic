import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++)
         {
            numbers[i] = scanner.nextInt();
        }
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        int equalCount = 0;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) 
            {
                negativeCount++;
            } 
            else if (numbers[i] > 0) 
            {
                positiveCount++;
            } 
            else 
            {
                zeroCount++;
        
            }
            for (int j = i+1; j < 5; j++) 
            {
            if(numbers[i]== numbers[j]) 
            {
              equalCount++;
            }  
            }
           
            
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
        System.out.println("Number of equal numbers: " + equalCount);

    }
}
