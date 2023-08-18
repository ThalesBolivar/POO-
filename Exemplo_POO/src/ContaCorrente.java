public class ContaCorrente {

    private long numero;
    private String nome;
    private int agencia ;
    private double saldo;

    public void cadastrar(long num, String nomPessoa, int ag){
        numero=num;

        nome=nomPessoa;

        agencia=ag;

        saldo=0;

    }


    public  void depositar (double valor) {
        saldo = saldo + valor;

    }

    public void sacar (double valor){
    if (valor <= saldo)
        saldo = saldo - valor;

    else
        System.out.println("Saldo insuficiente");
    }

    public double ConsultarSaldo(){
        return saldo;
    }
}
