package FolhaDePagamento;

public class FComissionado extends Funcionario{
    private double porcentual;
    private double vendas;

    public FComissionado(int matricula, String nome, double salario, double porcentual, double vendas) {
        super(matricula, nome, salario);
        this.porcentual = porcentual;
        this.vendas = vendas;
    }

    public double getPorcentual() {
        return porcentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setPorcentual(double porcentual) {
        this.porcentual = porcentual;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double calcularProventos () {
        return getSalario()+ (getVendas()* getPorcentual()/ 100);
    }
    public String toString(){
        return "Nome :" + getNome() + "\n"+"Matriculo:" + getMatricula()+ "\n"+ "Salário"+ calcularProventos();
    }
}
