package aplicacao;

import fila.FilaMensagens;

import java.util.Scanner;
//RM
public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaMensagens fila = new FilaMensagens();

        int option;
        do {
            System.out.println("0 - Encerra");
            System.out.println("1 - Recebimento de mensagem");
            System.out.println("2 - Atendimento de mensagem");
            System.out.println("3 - Recebimento e Encaminhamento de Resolução");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 0:

                    break;

                case 1:

                    System.out.println("Deseja informar seu nome? (1- sim/ 2-não) ");
                    sc.nextLine();
                    //if ( = 1)//
                    {
                    System.out.println("Nome: ");
                        sc.nextLine();
                    }

                    System.out.println("Email/telefone:");
                    sc.next();

                    System.out.println("Motivo do contato (1-reclamação/ 2-sugestão):");
                    sc.next();


                    System.out.println("Mensagem (texto):");
                    sc.next();

                    //fila.enqueue();
                    break;

                case 2:
                    System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
                    break;
                case 3:
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
