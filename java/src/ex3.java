public class ex3 {
    public static void main(String[] args) {

        String[] marcas = {"Mercedes", "Opel", "Ford", "Yamaha"};
        String[] modelos = {"A1", "Corsa", "Focus", "MT-07"};
        String[] cores = {"Cinzento", "Vermelho", "Cinzento", "Preto"};
        double[] cilindradas = {2.0, 1.6, 2.0, 0.7};
        boolean[] automaticos = {true, false, true, false};
        int[] anos = {2010, 2019, 2011, 2019};
        int totalCinzaCilindrada = 0;
        int totalAntes2020 = 0;

        if (cores[0].equals("Cinzento") && cilindradas[0] == 2.0) {
            totalCinzaCilindrada++;
            System.out.println("Encontrado veículo cinzento com cilindrada 2.0!");
        }
        if (cores[1].equals("Cinzento") && cilindradas[1] == 2.0) {
            totalCinzaCilindrada++;
            System.out.println("Encontrado veículo cinzento com cilindrada 2.0!");
        }
        if (cores[2].equals("Cinzento") && cilindradas[2] == 2.0) {
            totalCinzaCilindrada++;
            System.out.println("Encontrado veículo cinzento com cilindrada 2.0!");
        }
        if (cores[3].equals("Cinzento") && cilindradas[3] == 2.0) {
            totalCinzaCilindrada++;
            System.out.println("Encontrado veículo cinzento com cilindrada 2.0!");
        }


        if (anos[0] < 2020) {
            totalAntes2020++;
        }
        if (anos[1] < 2020) {
            totalAntes2020++;
        }
        if (anos[2] < 2020) {
            totalAntes2020++;
        }
        if (anos[3] < 2020) {
            totalAntes2020++;
        }

        if (totalAntes2020 > 0) {
            System.out.println("Existem " + totalAntes2020 + " veículos com ano inferior a 2020");
        } else {
            System.out.println("Nenhum veículo encontrado");
        }
    }
}
