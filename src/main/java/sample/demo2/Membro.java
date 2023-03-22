package sample.demo2;

import javafx.beans.property.SimpleStringProperty;

public class Membro {
    SimpleStringProperty Nome;
    SimpleStringProperty Telefone;
    SimpleStringProperty Cpf;
    SimpleStringProperty Acao;

    public Membro(String nome, String telefone, String cpf, String acao) {
        Nome = new SimpleStringProperty(nome);
        Telefone = new SimpleStringProperty(telefone);
        Cpf = new SimpleStringProperty(cpf);
        Acao = new SimpleStringProperty(acao);
    }

    public String getNome() {
        return Nome.get();
    }


    public void setNome(String nome) {
        this.Nome.set(nome);
    }

    public String getTelefone() {
        return Telefone.get();
    }


    public void setTelefone(String telefone) {
        this.Telefone.set(telefone);
    }

    public String getCpf() {
        return Cpf.get();
    }

    public void setCpf(String cpf) {
        this.Cpf.set(cpf);
    }

    public String getAcao() {
        return Acao.get();
    }

    public void setAcao(String acao) {
        this.Acao.set(acao);
    }
}
