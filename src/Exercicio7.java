import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorLado = entrada.nextDouble();
        entrada.close();
        double area = valorLado * valorLado;

        System.out.print(area * 2);

    }
    // calcule a area de um quadrado e mostre o dobro para o usuario
    // Area quadrado A = L²
}
