import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira o seu nome: \n");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo da programação em Java!!");

        scanner.close();
    }
}