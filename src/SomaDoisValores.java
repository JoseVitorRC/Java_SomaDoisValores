import java.util.Scanner;

public class SomaDoisValores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.println("Insira o segundo valor: ");
        float valor2 = scanner.nextFloat();

        float soma = valor1 + valor2;

        System.out.println("O resultado da soma foi: " + soma);

        scanner.close();
    }
}