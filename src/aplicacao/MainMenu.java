package aplicacao;

import fila.FilaMensagens;

import java.util.Scanner;
//RM
public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FilaMensagens fila = new FilaMensagens();

        int option;
        do {
            System.out.println("0 - Encerra");
            System.out.println("1 - Recebimento de mensagem");
            System.out.println("2 - Atendimento de mensagem");
            option = input.nextInt();

            switch (option) {

                case 0:
                    System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
                    break;

                case 1:

                    System.out.println("Deseja informar seu nome? (0- sim/ 2-não) ");
                    input.nextLine();
                    //if ( = 0)
                    {
                    System.out.println("Nome: ");
                        input.nextLine();
                    }

                    System.out.println("Email/telefone:");
                    input.next();

                    System.out.println("Motivo do contato (1-reclamação/ 2-sugestão):");
                    input.next();

                    System.out.println("Mensagem (texto):");
                    input.next();

                    //fila.enqueue();
                    break;

                case 2:
                    System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
                    break;


                default:
                    System.out.println("ERRO");
            }
        }
        while (option != 2);
        System.out.println("PROGRAMA ENCERRADO");
    }
}
