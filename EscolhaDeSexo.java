import java.util.Scanner;

public class EscolhaDeSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha seu sexo:");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");

        String sexo = sc.nextLine();

        if (sexo.equals("1")) {
            System.out.println("Você escolheu Masculino.");
        } else if (sexo.equals("2")) {
            System.out.println("Você escolheu Feminino.");
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        sc.close();
    }
}
