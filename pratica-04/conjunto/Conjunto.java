package conjunto;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Conjunto implements ConjuntoInterface {
    
    public int lerElementos(double[] vet) {
        String opcao;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe ");
            vet[cont++] = teclado.nextDouble();
            System.out.println("Deseja informar outro Elemento? (sim/s)");
            opcao = teclado.next();
        } while ((opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) && cont < 10);

        return cont;
    }

    public void imprimirElementos(double[] vet, int cont) {
        for (int i = 0; i < cont; i++)
            System.out.print(vet[i] + "   ");
        System.out.println();
    }

    public int uniao(double[] vet1, double[] vet2) {
        Set<Double> resultado = new HashSet<>();
        for (double v : vet1) resultado.add(v);
        for (double v : vet2) resultado.add(v);
        
        System.out.println("União: " + resultado);
        return resultado.size();
    }

    public int intersecao(double[] vet1, double[] vet2) {
        Set<Double> set1 = new HashSet<>();
        Set<Double> set2 = new HashSet<>();
        
        for (double v : vet1) set1.add(v);
        for (double v : vet2) set2.add(v);
        
        set1.retainAll(set2);
        System.out.println("Interseção: " + set1);
        return set1.size();
    }

    public int diferenca(double[] vet1, double[] vet2) {
        Set<Double> resultado = new HashSet<>();
        Set<Double> set2 = new HashSet<>();
        
        for (double v : vet2) set2.add(v);
        for (double v : vet1) {
            if (!set2.contains(v)) {
                resultado.add(v);
            }
        }
        
        System.out.println("Diferença: " + resultado);
        return resultado.size();
    }

    public int produtoCartesiano(double[] vet1, double[] vet2) {
        List<String> resultado = new ArrayList<>();
        
        for (double v1 : vet1) {
            for (double v2 : vet2) {
                resultado.add("(" + v1 + ", " + v2 + ")");
            }
        }
        
        System.out.println("Produto Cartesiano: " + resultado);
        return resultado.size();
    }

    public int conjuntoDasPartes(double[] vet) {
        List<Set<Double>> resultado = new ArrayList<>();
        int n = vet.length;
        int totalSubconjuntos = (int) Math.pow(2, n);
        
        for (int i = 0; i < totalSubconjuntos; i++) {
            Set<Double> subconjunto = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subconjunto.add(vet[j]);
                }
            }
            resultado.add(subconjunto);
        }
        
        System.out.println("Conjunto das Partes: " + resultado);
        return resultado.size();
    }
}
