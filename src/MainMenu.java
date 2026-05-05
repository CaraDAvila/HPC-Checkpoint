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

                    System.out.println("Email/telefone:");
                    input.next();

                    System.out.println("Motivo do contato (1-reclamação/ 2-sugestão):");
                    input.next();

                    System.out.println("Mensagem (texto):");
                    input.next();

                    System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
                case 2:


            }
        }
        while (option != 2);
    }
}
