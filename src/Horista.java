public class Horista extends Empregado{
    private double horas;
    public Horista(String nome, String endereco, double horas) {
        super(nome, endereco);
        this.horas = horas;
    }
    public void setHoras(double horas){
        this.horas = horas;
    }
    public double getHoras(){
        return horas;
    }
    public void calcularSalario(){
        setSalario(horas * 50);
    }
}
