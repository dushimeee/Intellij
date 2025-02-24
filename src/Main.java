import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String a= sc.nextLine();


        System.out.println("What year were you born in?");
        int b= sc.nextInt();
        int age= 2025-b;
        System.out.println("Hello, " + a + "!"+ "\nYou will turn "+ age +" this year" );

        }
    }
