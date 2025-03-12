package pratica4;

import java.util.*;

public class Conjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber e armazenar o conjunto A
        System.out.println("Digite a quantidade de elementos do conjunto A (máximo 10): ");
        int nA = scanner.nextInt();
        Set<Integer> A = new HashSet<>();
        System.out.println("Digite os elementos do conjunto A:");
        while (A.size() < nA) {
            A.add(scanner.nextInt());
        }
        System.out.println("Conjunto A: " + A + " | Cardinalidade: " + A.size());
        
        // Receber e armazenar o conjunto B
        System.out.println("Digite a quantidade de elementos do conjunto B (máximo 10): ");
        int nB = scanner.nextInt();
        Set<Integer> B = new HashSet<>();
        System.out.println("Digite os elementos do conjunto B:");
        while (B.size() < nB) {
            B.add(scanner.nextInt());
        }
        System.out.println("Conjunto B: " + B + " | Cardinalidade: " + B.size());
        
        // União de A e B
        Set<Integer> uniao = new HashSet<>(A);
        uniao.addAll(B);
        System.out.println("União (A ∪ B): " + uniao + " | Cardinalidade: " + uniao.size());
        
        // Interseção de A e B
        Set<Integer> intersecao = new HashSet<>(A);
        intersecao.retainAll(B);
        System.out.println("Interseção (A ∩ B): " + intersecao + " | Cardinalidade: " + intersecao.size());
        
        // Diferença A - B
        Set<Integer> diferenca = new HashSet<>(A);
        diferenca.removeAll(B);
        System.out.println("Diferença (A - B): " + diferenca + " | Cardinalidade: " + diferenca.size());
        
        // Produto Cartesiano A × B
        Set<String> produtoCartesiano = new HashSet<>();
        for (Integer a : A) {
            for (Integer b : B) {
                produtoCartesiano.add("(" + a + ", " + b + ")");
            }
        }
        System.out.println("Produto Cartesiano (A × B): " + produtoCartesiano + " | Cardinalidade: " + produtoCartesiano.size());
        
        // Conjunto das partes de A
        Set<Set<Integer>> partesA = calcularPartes(A);
        System.out.println("Conjunto das Partes de A: " + partesA + " | Cardinalidade: " + partesA.size());
        
        // Conjunto das partes de B
        Set<Set<Integer>> partesB = calcularPartes(B);
        System.out.println("Conjunto das Partes de B: " + partesB + " | Cardinalidade: " + partesB.size());
        
        scanner.close();
    }
    
    // Método para calcular o conjunto das partes
    private static Set<Set<Integer>> calcularPartes(Set<Integer> conjunto) {
        List<Integer> lista = new ArrayList<>(conjunto);
        Set<Set<Integer>> resultado = new HashSet<>();
        int n = lista.size();
        int totalSubconjuntos = (int) Math.pow(2, n);
        for (int i = 0; i < totalSubconjuntos; i++) {
            Set<Integer> subconjunto = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subconjunto.add(lista.get(j));
                }
            }
            resultado.add(subconjunto);
        }
        return resultado;
    }
}
