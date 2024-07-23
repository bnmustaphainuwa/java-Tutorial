import java.util.Scanner;

public class Hello {
    //main metho
    public static void main(String[] args) {
        //create a scanner
        Scanner input =  new Scanner(System.in);
        //prompt the user to enter his name
        System.out.print("Enter your name:");
        String name = input.nextLine();
        //print the name to the user
        System.out.println("Hello " + name + " Welcome to java" );
    }
}
