import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println();
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Deseja informar seu nome? (0- sim/ 2-não) ");
                    input.nextLine();
                    break;

                case 2:
                    System.out.println("Email/telefone:");
                    input.next();

            }
        }
        while (option != 2) ;
    }
}
