import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        System.out.println("Enter your values:");

        // Taking input for the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Print your values:");
        // Printing the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter your values:");

        // Taking input for the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = input.nextInt();
            }
        }
        System.out.println("Print your values:");
        // Printing the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }

        System.out.println("Add value:");
        // Printing the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +(A[i][j]+B[i][j]));
            }
            System.out.println();
        }


    }
}
