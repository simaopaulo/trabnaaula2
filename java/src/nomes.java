import java.util.ArrayList;

public class nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Simão");
        nomes.add("Paulo");
        for (String nome: nomes) {
            System.out.println("Ola "+nome);
        }
    }
}
