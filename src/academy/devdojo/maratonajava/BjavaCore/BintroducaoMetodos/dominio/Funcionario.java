package academy.devdojo.maratonajava.BjavaCore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario = new double [3];


    public double calcularSalario(double ... salario){
        double acumuladoDoSalario = 0;
        for(double salario1 : salario){
            acumuladoDoSalario += salario1;
        }
        return Math.round(acumuladoDoSalario / salario.length);
    }

    public void imprimirSalario(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.printf("%d Salario: %.2f |",i+1, salario[i]);
        };
    }

}
