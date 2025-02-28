package pratica2;

import java.util.Scanner;

public class Automato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();

        if (verificaPalavra(palavra)) {
            System.out.println("Palavra aceita!");
        } else {
            System.out.println("Palavra não aceita!");
        }
    }

    public static boolean verificaPalavra(String palavra) {
        String estado = "q0"; // Estado inicial

        for (char simbolo : palavra.toCharArray()) {
            switch (estado) {
                case "q0":
                    if (simbolo == 'a') estado = "q1";
                    else if (simbolo == 'b') estado = "q2";
                    else return false; // Símbolo inválido
                    break;
                case "q1":
                    if (simbolo == 'a' || simbolo == 'b') estado = "qf";
                    else return false;
                    break;
                case "q2":
                    if (simbolo == 'b') estado = "q2";
                    else return false;
                    break;
                case "qf":
                    return false; // Depois de chegar ao estado final, não aceita mais símbolos
            }
        }
        return estado.equals("qf"); // Se terminou no estado final, a palavra é aceita
    }
}
