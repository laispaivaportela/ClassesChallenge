/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeschallenge;

/**
 *
 * @author laispaivaportela
 */
public class Account {
    private String nomeDoUsuario; //variavel de instancia
    private double saldoDoUsuario;  //variavel de instancia
    private String emailDoUsuario; //variavel de instancia
    private String numeroDoUsuario; //variavel de instancia
    private String numeroCelularUsuario; //variavel de instancia




    //metodo para definir o nome do usuario
    public void setNomeDoUsuario (String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    //metodo para recuperar o nome do usuario
    public String getNomeDoUsuario () {
        return nomeDoUsuario; //retorna o nome para o chamador
    }

    //metodo para definir o saldo do usuario
    public void setSaldoDoUsuario (double saldoDoUsuario) {
        this.saldoDoUsuario = saldoDoUsuario;
    }
    //metodo para recuperar o saldo do usuario
    public double getSaldoDoUsuario () {
        return saldoDoUsuario; //retorna o nome para o chamador
    }
    //metodo para definir o email do usuario
    public void setEmailDoUsuario (String emailDoUsuario) {
        this.emailDoUsuario = emailDoUsuario;
    }
    //metodo para recuperar o email do usuario
    public String getEmailDoUsuario () {
        return emailDoUsuario; //retorna o email para o chamador
    }
    //metodo para definir o celular do usuario
    public void setNumeroCelularUsuario (String  numeroCelularUsuario) {
        this.numeroCelularUsuario = numeroCelularUsuario;
    }
    //metodo para recuperar o celular do usuario
    public String getNumeroCelularUsuario () {
        return numeroCelularUsuario; //retorna o celular para o chamador
    }
    //metodo para definir o numero do usuario
    public void setNumeroDoUsuario (String  numeroDoUsuario) {
        this.numeroDoUsuario = numeroDoUsuario;
    }
    //metodo para recuperar o numero do usuario
    public String getNumeroDoUsuario () {
        return numeroDoUsuario; //retorna o numero da conta para o chamador
    }

    //metodo para calcular o deposito do usuario
    public void depositoUsuario (double valorDeposito) {
        if(valorDeposito > 0){
            saldoDoUsuario += valorDeposito;
        }
    }
    //metodo para calcular o saque do usuario
    public void saqueUsuario (double valorSaque) {
        if(valorSaque > 0  && valorSaque <= saldoDoUsuario){
            saldoDoUsuario -= valorSaque;
        }
    }




}
//agora a classe Account possui uma variavel de instancia nome e metodos para configurar e obter seu valor

