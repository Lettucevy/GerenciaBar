import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = scanner.nextInt();

        Cliente cliente = new Cliente(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

        Bar bar = new Bar();
        bar.gerarRelatorio(cliente);

        scanner.close();
    }
}