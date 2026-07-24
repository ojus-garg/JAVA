import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter marks of Subject 1: ");
        String mark1 = sc.nextLine();

        System.out.print("Enter marks of Subject 2: ");
        String mark2 = sc.nextLine();

        System.out.print("Enter marks of Subject 3: ");
        String mark3 = sc.nextLine();

  
        Integer num1 = Integer.valueOf(mark1);
        Integer num2 = Integer.valueOf(mark2);
        Integer num3 = Integer.valueOf(mark3);


       
        int total = num1 + num2 + num3;


        System.out.println("Marks:");
        System.out.println("Subject 1: " + num1);
        System.out.println("Subject 2: " + num2);
        System.out.println("Subject 3: " + num3);
        System.out.println("Total Marks = " + total);

        sc.close();
    }
}
