import static java.lang.Math.round;

public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public double getSalario(){
        return salario;
    }

    public double calculoIR() {
        double aliquot;
        if (salario >= 2112.01 && salario <= 2826.65) {
            aliquot = 0.075 * salario;
        } else if (salario >= 2826.66 && salario <= 3571.05) {
            aliquot = 0.15 * salario;
        } else if (salario >= 3571.06 && salario <= 4664.68) {
            aliquot = 0.225 * salario;
        } else if (salario > 4664.68) {
            aliquot = 0.275 * salario;
        } else {
            aliquot = 0 * salario;
        }
        return round(aliquot);
    }
    public double calculoINSS(){
        double contribuicao;
        if (salario <= 1320){
            contribuicao = 0.075 * salario;
        }else if (salario > 1320 && salario <= 2571.29){
            contribuicao = 0.09 * salario;
        }else if (salario > 2571.29 && salario <= 3856.94){
            contribuicao = 0.12 * salario;
        }else{
            contribuicao = 0.14 * salario;
        }
        return round(contribuicao);
    }
}
