package conjunto;

public interface ConjuntoInterface {

    public int lerElementos(double[] vet);
    public void imprimirElementos(double[] vet, int cont);
    public int uniao(double[] vet1, double[] vet2);
    public int intersecao(double[] vet1, double[] vet2);
    public int diferenca(double[] vet1, double[] vet2);
    public int produtoCartesiano(double[] vet1, double[] vet2);
    public int conjuntoDasPartes(double[]vet);

}
