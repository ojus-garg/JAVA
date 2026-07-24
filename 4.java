import java.util.Scanner;


public class WrapperclassDemo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        String str1 = sc.nextLine();

         System.out.println("Enter Second number");
        String str2 = sc.nextLine();

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        int a = num1;
        int b = num2;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        System.out.println("Sum of " +a + " and " +b+ " is : " + (a+b));
        System.out.println("Subtraction of " +a + " and " +b+ " is :" + (a-b));
        
       // primitive to wrapper (Autoboxing)
        int x = 101;

        Integer wrapperX = x;

        System.out.println("Primitive to Wrapper (Autoboxing): ");
        System.out.println("Primitive value: " + x);
        System.out.println("Wrapper value: " + wrapperX);

        // wrapper to primitive (Unboxing)

        Integer wrapperY = 202;
        int y = wrapperY;
        System.out.println("Wrapper to Primitive (Unboxing): ");
        System.out.println("Wrapper value: " + wrapperY);
        System.out.println("Primitive value: " + y);

        sc.close();
    }
    
}
