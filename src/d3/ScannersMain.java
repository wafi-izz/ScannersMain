package d3;

import java.util.Scanner;

public class ScannersMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        System.out.print("Enter ID value: ");
//        int ID = sc.nextInt();
//        System.out.println(ID);
        menu();
    }

    static void menu(){
        while(true) {

            System.out.println("1 - user menu");
            System.out.println("2 - products menu");
            System.out.println("3 - HR");
            System.out.println("4 - exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {
                printUsers();
            }
            if(choice == 2) {
                printProdcuts();
            }
            if(choice == 4) {
                return;
            }
        }
    }

    static void printUsers(){
        System.out.println("alex");
        System.out.println("john");
        System.out.println("doe");
    }
}
