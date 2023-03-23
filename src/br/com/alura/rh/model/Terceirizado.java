package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado{

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome,cpf,cargo,salario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }
}
