import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String respostaSair;

        do {
            System.out.print("Por favor, insere a marca do carro: \n");
            String marca = scanner.next();


            System.out.print("Por favor, insere a cilindrada do carro (ex: 1,0 ou 2,0): \n");
            double cilindrada = scanner.nextDouble();


            System.out.print("O carro é automático? (sim ou nao): \n");
            String respostaAuto = scanner.next();


            System.out.print("Por favor, insere o número de identificação: \n");
            int numeroID = scanner.nextInt();


            System.out.println("\n");


            if (marca.equals("Audi") || marca.equals("BMW")) {
                System.out.println("Marca: Carro alemão.");
            } else {
                System.out.println("Marca: Outro fabricante.");
            }


            if (cilindrada >= 2.0) {
                System.out.println("Cilindrada: Motor potente.");
            } else {
                System.out.println("Cilindrada: Motor moderado.");
            }


            if (respostaAuto.equals("sim")) {
                System.out.print("Tipo: Caixa automática. \n");
            } else {
                System.out.print("Tipo: Caixa manual. \n");
            }


            if (numeroID == 5) {
                System.out.println("NI: O número de identificação deste carro é o número: " + numeroID + ".");
            } else {
                numeroID = 5;
                System.out.println("NI:O número de identificação deste carro é o número: " + numeroID + ".");
            }

            System.out.print("Quer sair? (sim ou nao): \n");
            respostaSair = scanner.next();

        } while (!respostaSair.equals("sim"));

        scanner.close();
    }
}