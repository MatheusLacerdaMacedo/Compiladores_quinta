import conjunto.Conjunto;

public class Main {
    public static void main(String[] args) {
        int cardinalidadeA = 0, cardinalidadeB = 0;

        double[] A = new double[10];
        double[] B = new double[10];

        Conjunto conjunto = new Conjunto();
        System.out.println("Leitura dos elementos do conjunto A");
        cardinalidadeA = conjunto.lerElementos(A);
        System.out.println("Leitura dos elementos do conjunto B");
        cardinalidadeB = conjunto.lerElementos(B);

        System.out.println("Elementos do conjunto A: ");
        conjunto.imprimirElementos(A, cardinalidadeA);

        
        System.out.println("Elementos do conjunto B: ");
        conjunto.imprimirElementos(B, cardinalidadeB);

        conjunto.uniao(A, B);
        conjunto.intersecao(A, B);
        conjunto.diferenca(A, B);
        conjunto.produtoCartesiano(A, B);
        conjunto.conjuntoDasPartes(A);

    }
}