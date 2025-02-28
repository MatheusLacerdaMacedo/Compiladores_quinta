package pratica3;

import java.util.Scanner;

public class automato {
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
                    if (simbolo == 'b') estado = "s3";
                    else if (simbolo == 'a') estado = "s4";
                    else return false;
                    break;
                case "s3":
                    if (simbolo == 'b') estado = "s6";
                    else if (simbolo == 'a') estado = "q0";
                    else return false;
                    break;
                case "s4":
                    if (simbolo == 'b') estado = "s3";
                    else if (simbolo == 'a') estado = "s6";
                    else return false;
                    break;
                case "s6":
                    if (simbolo == 'a' || simbolo == 'b') estado = "s6";
                    else return false;
                    break;
            }
        }
        return estado.equals("s4") || estado.equals("s6"); // Estados finais
    }
}

