package FolhaDePagamento;

public class Main {
    public static void main(String[] args) {


        FPadrao fp = new FPadrao(1, "Thales", 10000);

        System.out.println(fp.toString());

        FComissionado fc =new FComissionado(2, "Guilherme", 2000, 2, 1000);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(1, "Leornado", 650,0.50,100);
        System.out.println(fpr.toString());

    }

}
