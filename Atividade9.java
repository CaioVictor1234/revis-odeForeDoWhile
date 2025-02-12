import java.util.Scanner;  // Importação da classe Scanner

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Agora o Scanner vai funcionar
        System.out.printf("Digite um número de 1 a 10: ");
        int numero = sc.nextInt();

        // Loop para exibir a tabuada
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            int resultado = numero * tabuada; // Multiplicação correta
            System.out.printf("%d x %d = %d\n", numero, tabuada, resultado); // Exibe o resultado
        }

        sc.close(); // Fecha o Scanner
    }
}
