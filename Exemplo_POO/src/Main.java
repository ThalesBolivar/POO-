
public class Main {
    public static void main(String[] args) {
        System.out.println("Boa noite!!!");

        ContaCorrente c1 = new ContaCorrente(); //cria um obj com nome c1 (variavel) do tipo conta corrente
        c1.cadastrar (123,"Ana",789);

        c1.depositar(1000);

        System.out.println("Saldo:" + c1.ConsultarSaldo());

        c1.sacar(200);

        System.out.println("Saldo Atual:" + c1.ConsultarSaldo());






    }


}