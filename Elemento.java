public class Elemento {
    int id;
    int codigoInfo;
    float valorInfo;

    public Elemento(int id, int codigoInfo, float valorInfo) {
        this.id = id;
        this.codigoInfo = codigoInfo;
        this.valorInfo = valorInfo;
    }

    public void imprimir() {
        System.out.println("ID: " + id + ", Código: " + codigoInfo + ", Valor: " + valorInfo);
    }
}
