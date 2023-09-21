package Ingresso;

public class Main {
    public static void main(String[] args) {

        Normal n1 = new Normal(100);
        n1.getValorIngresso();
        Vip v1 = new Vip(100,50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100, 100, "Setor Camarte");
        c1.imprimeIngresso();
    }
}