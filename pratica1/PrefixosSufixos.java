package pratica1;

import java.util.Scanner;

public class PrefixosSufixos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        //loop
        while (true) {
            //le palavra do usuario
            System.out.println("Digite uma palavra qualquer ou escreva 'sair' para deixar a aplicação.");
            input = scanner.nextLine();

            //sair
            if(input.equalsIgnoreCase ("sair")) {
                break;
            }
            //prefixos
            System.out.println("Prefixos:");
            for(int i = 1; i<= input.length(); i++) {
                System.out.println(input.substring(0,i));
            }
            //sufixos
            System.out.println("Sufixos:");
            for(int i = 0; i< input.length(); i++) {
                System.out.println(input.substring(i));
            }
            
            System.out.println();
        
        }

        scanner.close();
    }
}