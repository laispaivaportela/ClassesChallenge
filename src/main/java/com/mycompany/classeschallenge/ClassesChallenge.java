/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeschallenge;

/**
 *
 * @author laispaivaportela 
 */

/*
Classes Challenge
O desafio consiste em desenvolver uma classe representando uma conta bancária, contendo informações como: número da conta, nome do cliente, saldo, e-mail e número de telefone.
*/

import javax.swing.JOptionPane;

public class ClassesChallenge {
    public static
    void main (String[] args) {



        //cria um objeto Account e o atribui a minhaConta  (cria uma conta chamada minhaConta)
        Account minhaConta = new Account ();

        JOptionPane.showMessageDialog (null , "Cadastro de conta");


        //solicita e lê o numero da conta
        String oNumero = JOptionPane.showInputDialog (null , "Digite o numero da conta:");
        minhaConta.setNumeroDoUsuario (oNumero); //insere a variavel "oCelular" em minhaConta

        //solicita e lê o saldo
        String oSaldoString = JOptionPane.showInputDialog (null , "Digite o saldo da conta:");
        double oSaldo = Double.parseDouble (oSaldoString);
        minhaConta.setSaldoDoUsuario (oSaldo); //insere a variavel "oSaldo" em minhaCont

        //solicita e lê o nome
        String oNome = JOptionPane.showInputDialog (null , "Digite o seu nome: ");
        minhaConta.setNomeDoUsuario (oNome); //insere a variavel "oNome" em minhaConta

        //solicita e lê o email
        String oEmail = JOptionPane.showInputDialog (null , "Digite o seu email: ");
        minhaConta.setEmailDoUsuario (oEmail); //insere a variavel "oEmail" em minhaConta

        //solicita e lê o celular
        String oCelular = JOptionPane.showInputDialog (null , "Digite o seu numero de celular: ");
        minhaConta.setNumeroCelularUsuario (oCelular); //insere a variavel "oCelular" em minhaConta

        //formata informacoes da conta
        String informacoesDaConta = String.format (
                "numero da conta: %s\nsaldo da conta: %.2f\nnome do usuario: %s\nemail do usuario: %s\nnumero de celular do usuario: %s\n" ,
                minhaConta.getNumeroDoUsuario () ,
                minhaConta.getSaldoDoUsuario () ,
                minhaConta.getNomeDoUsuario () ,
                minhaConta.getEmailDoUsuario () ,
                minhaConta.getNumeroCelularUsuario ()
                                                  );
        //exibe informacoes da conta
        JOptionPane.showMessageDialog (null , informacoesDaConta);

        //cria um loop até o usuario desejar sair
        while (true) {
            Object[] opcoes = {"Exibir saldo" , "Depositar" , "Sacar" , "Sair"};
            //verifica a operacao que o usuario deseja realizar
            int escolhaDeOpcao = JOptionPane.showOptionDialog (
                    null ,
                    "Escolha uma operação" ,
                    "Operações" ,
                    JOptionPane.DEFAULT_OPTION ,
                    JOptionPane.QUESTION_MESSAGE ,
                    null ,
                    opcoes ,
                    opcoes[0]
                                                              );
            // verifica qual opção foi escolhida
            if (escolhaDeOpcao != JOptionPane.CLOSED_OPTION) {
                String opcaoEscolhida = (String) opcoes[escolhaDeOpcao];
                //se o usuario escolher sair o programa encerra
                if (opcaoEscolhida.equals ("Sair")) {
                    JOptionPane.showMessageDialog (null , "Saindo...");
                    break;
                } else {
                    //realiza o pedido do usuario
                    switch (opcaoEscolhida) {
                        case "Exibir saldo":
                            String saldoUsuario = String.format ("%.2f", minhaConta.getSaldoDoUsuario());
                            JOptionPane.showMessageDialog (null , saldoUsuario);
                            break;
                        case "Depositar":
                            String oDepositoString = JOptionPane.showInputDialog (null , "Digite o valor do deposito: ");
                            double valorDeposito = Double.parseDouble (oDepositoString);
                            minhaConta.depositoUsuario (valorDeposito);
                            break;
                        case "Sacar":
                            String oSaqueString = JOptionPane.showInputDialog (null , "Digite o valor do saque: ");
                            double valorSaque = Double.parseDouble (oSaqueString);
                            minhaConta.saqueUsuario (valorSaque);
                            break;
                    }

                }
            } else {
                JOptionPane.showMessageDialog (null , "Nenhuma opção foi selecionada.");
            }
        }
    }
}
