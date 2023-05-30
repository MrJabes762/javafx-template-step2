package br.edu.ifba.saj.fwads.model;

public class Autor {
    private String nome;
    private String email;
    private String CPF;
    public Autor(String nome, String email, String cPF) {
        this.nome = nome;
        this.email = email;
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", email=" + email + ", CPF=" + CPF + "]";
    }
    
}
