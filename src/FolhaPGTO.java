public class FolhaPGTO {
    Mensalista mens;
    Horista hors;

    public void imprimirMensalista(String nome, String endereco, String cargo){
        mens = new Mensalista(nome, endereco, cargo);
        mens.calcularSalario();
        double salario = mens.getSalario();
        
        System.out.println("Nome:" + mens.getNome() + "\nEndereço: " + mens.getEndereco() + "\nCargo: " + mens.getCargo());
        if (salario == 0) {
            System.out.println("Cargo inválido. Disponíveis: Junior, Pleno Senior");
        }else{
            System.out.println("O salario do Mensalista " + nome + " é: R$" + salario);
            System.out.println("O valor da contribuição do INSS do Mensalista " + nome + " é de: " + mens.calculoINSS());
            System.out.println("O valor do Imposto de Renda do Mensalista " + nome + " é de: " + mens.calculoIR());
        }
    }
    public void imprimirHorista(String nome, String endereco, double horas){
        hors = new Horista(nome, endereco, horas);
        hors.calcularSalario();

        System.out.println("Nome:" + hors.getNome() + "\nEndereço: " + hors.getEndereco() + "\nhoras: " + hors.getHoras());
        System.out.println("O salario do Horista " + nome + " é: R$" + hors.getSalario());
        System.out.println("O valor da contribuição do INSS do Horista " + nome + " é de: " + hors.calculoINSS());
        System.out.println("O valor do Imposto de Renda do Horista " + nome + " é de: " + hors.calculoIR());
    }
}
