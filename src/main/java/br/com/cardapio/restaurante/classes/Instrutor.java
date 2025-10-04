package br.com.cardapio.restaurante.classes;

public class Instrutor extends PessoaAcademia {

    public String especialidade;
    public float salarioMensal;

    public float calculaSalario(float salarioMensal, float horasExtras ){
        return 0;
    }

    public Instrutor(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
}
