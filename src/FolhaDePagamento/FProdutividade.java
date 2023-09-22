package FolhaDePagamento;

public class FProdutividade extends Funcionario{
    private double valor;
    private int producao;

    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double calcularProventos () {
        return getSalario() + getProducao() * getValor();
    }
    public String toString(){ // poliformismo ( repete varios metodos)
        return "Nome :" + getNome() + "\n"+"Matriculo:" + getMatricula()+ "\n"+ "Salário"+ calcularProventos();
    }
}
