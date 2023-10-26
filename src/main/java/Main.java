/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        // Get name from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //Check to see if it is 'Bob' or 'Alice
        //Greet if name = 'Bob' or 'Alice'
        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hey Bob or Alice");
        }else{
            System.out.println("Not Bob or Alice");
        }
    };

}
