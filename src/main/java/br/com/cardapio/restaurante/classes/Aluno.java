package br.com.cardapio.restaurante.classes;

public class Aluno extends PessoaAcademia{

    public String plano, curso;
    public float mensalidade;

    public float calculaMensalidade(float mensalidade){
        return 0;
    }

    public Aluno(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        
    }

    public String cadastroAluno(){
         return "CADASTRO ALUNO\n" +"Nome: "+ this.getNome() + "\nCPF: " + this.getCpf() + "\nNascimento: " + this.getDataNascimento();
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
