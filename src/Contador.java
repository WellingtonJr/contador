import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosException e) {
            System.out.println("O primeiro parametro não pode ser maior que o segundo");
        }

        scanner.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosException("O primeiro parametro não pode ser maior que o segundo");
        }

        int count = parametroDois - parametroUm;
        for (int i = 0; i < count; i++) {
            System.out.println("Imprimindo o numero " + (i + 1));
        }
    }
}
