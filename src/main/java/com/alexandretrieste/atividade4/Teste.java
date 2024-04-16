/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alexandretrieste.atividade4;

/**
 *
 * @author xande
 */
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {

        int resp = 0;
        boolean adicionarNovoVeiculo = false;
        Leitura leitura = new Leitura();


        Passeio[] veiculoPasseio = new Passeio[8];
        Carga[] veiculoCarga = new Carga[8];


        veiculoPasseio[0] = new Passeio("ABC-23145", "Ford", "Mustang", "Vermelho", 250, 4, 4, 460, 8);
        veiculoPasseio[1] = new Passeio("DEF-8426", "Chevrolet", "Camaro", "Amarelo", 300, 4, 2, 650, 8);
        veiculoPasseio[2] = new Passeio("GHI-9012", "Audi", "A4", "Azul", 220, 4, 5, 190, 4);
        veiculoPasseio[3] = new Passeio("JKL-8984", "Honda", "Civic", "Preto", 270, 4, 5, 150, 8);
        veiculoPasseio[4] = new Passeio("MNO-1212", "Toyota", "Corolla", "Prata", 200, 4, 5, 140, 4);
        veiculoCarga[0] = new Carga("DEF7890", "Scania", "R440", "Branco", 120, 8, 25000, 8000, 440, 6);
        veiculoCarga[1] = new Carga("GHI8901", "Volvo", "FH460", "Azul", 110, 8, 30000, 9000, 460, 6);
        veiculoCarga[2] = new Carga("JKL0123", "Mercedes-Benz", "Actros 2546", "Vermelho", 100, 10, 35000, 10000, 460, 6);
        veiculoCarga[3] = new Carga("MNO3456", "Ford", "Cargo 2428", "Amarelo", 100, 6, 15000, 5000, 280, 6);
        veiculoCarga[4] = new Carga("PQR6789", "Iveco", "Stralis", "Verde", 130, 10, 28000, 8500, 460, 6);

        //Menu
        do{
            System.out.println("=============================================\n");
            System.out.println("Sistema de Gestão de Veículos - Menu Inicial\n");
            System.out.println("1)  Cadastrar Veiculo de Passeio");
            System.out.println("2)  Cadastrar Veiculo de Carga");
            System.out.println("3)  Imprimir Todos os Veiculos de Passeio");
            System.out.println("4)  Imprimir Todos os Veiculos de Carga");
            System.out.println("5)  Imprimir Veiculo de Passeio pela Placa");
            System.out.println("6)  Imprimir Veiculo de Carga pela Placa");
            System.out.println("7)  Sair do Sistema\n\n");
            System.out.println("=============================================");
            resp = leitura.entDadosInt("Digite uma das opções acima: ");

            switch (resp){
                case 1:
                    do {
                        System.out.println("=================== CADASTRO DE VEICULO DE PASSEIO ===================");
                        System.out.println("Insira os dados e valores solicitados abaixo");
                        System.out.println("======================================================================");
                        String placa = leitura.entDadosString("Placa: ");
                        boolean placaExistente = false;
                        for (Passeio passeio : veiculoPasseio) {
                            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placa)) {
                                placaExistente = true;
                                break;
                            }
                        }
                        if (placaExistente) {
                            System.out.println("======================== ATENÇÃO! ========================");
                            System.out.println("Já existe um veículo (passeio) cadastrado com a placa "+placa);
                            break;
                        } else {
                            String marca = leitura.entDadosString("Marca: ");
                            String modelo = leitura.entDadosString("Modelo: ");
                            String cor = leitura.entDadosString("Cor: ");
                            int qtdRodas = leitura.entDadosInt("Quantidade de Rodas: ");
                            int qtdPassageiros = leitura.entDadosInt("Quantidade de Passageiros: ");
                            int velocMax = leitura.entDadosInt("Velocidade Máxima: ");
                            int potenciaMotor = leitura.entDadosInt("Potência do Motor: ");
                            int qtdPistoesMotor = leitura.entDadosInt("Quantidade de Pistões do Motor: ");
                            Passeio novoVeiculo = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPassageiros,
                            potenciaMotor, qtdPistoesMotor);
                            for (int i = 0; i < veiculoPasseio.length; i++) {
                                if (veiculoPasseio[i] == null) {
                                    veiculoPasseio[i] = novoVeiculo;
                                    System.out.println("Veículo de passeio cadastrado com sucesso!");
                                    System.out.println("Deseja adicionar um novo veículo? (S/N)");
                                    String resposta = leitura.entDadosString("");
                                    if (resposta.equalsIgnoreCase("S")) {
                                        adicionarNovoVeiculo = true;
                                    } else {
                                        adicionarNovoVeiculo = false;
                                    }
                                    break;
                                }
                            }
                        }
                    }while(adicionarNovoVeiculo);
                    adicionarNovoVeiculo = true;
                    break;
                case 2:
                    do{
                        System.out.println("=================== CADASTRO DE VEICULO DE CARGA ===================");
                        System.out.println("Insira os dados e valores solicitados abaixo");
                        System.out.println("====================================================================");
                        String placa = leitura.entDadosString("Placa: ");
                        boolean placaExistente = false;
                        for (Carga carga : veiculoCarga) {
                            if (carga != null && carga.getPlaca().equalsIgnoreCase(placa)) {
                                placaExistente = true;
                                break;
                            }
                        }
                        if (placaExistente) {
                            System.out.println("======================== ATENÇÃO! ========================");
                            System.out.println("Já existe um veículo (carga) cadastrado com a placa "+placa);
                            break;
                        } else {
                            String marca = leitura.entDadosString("Marca: ");
                            String modelo = leitura.entDadosString("Modelo: ");
                            String cor = leitura.entDadosString("Cor: ");
                            int qtdRodas = leitura.entDadosInt("Quantidade de Rodas: ");
                            int cargaMaxima = leitura.entDadosInt("Carga Máxima: ");
                            int tara = leitura.entDadosInt("Tara: ");
                            int velocMax = leitura.entDadosInt("Velocidade Máxima: ");
                            int potenciaMotor = leitura.entDadosInt("Potência do Motor: ");
                            int qtdPistoesMotor = leitura.entDadosInt("Quantidade de Pistões do Motor: ");
                            Carga novoVeiculo = new Carga(marca, modelo, placa, cor, qtdRodas, velocMax, cargaMaxima, tara,
                                    potenciaMotor, qtdPistoesMotor);
                            for (int i = 0; i < veiculoCarga.length; i++) {
                                if (veiculoCarga[i] == null) {
                                    veiculoCarga[i] = novoVeiculo;
                                    System.out.println("Veículo de carga cadastrado com sucesso!");
                                    System.out.println("Deseja adicionar um novo veículo? (S/N)");
                                    String resposta = leitura.entDadosString("");
                                    if (resposta.equalsIgnoreCase("S")) {
                                        adicionarNovoVeiculo = true;
                                    } else {
                                        adicionarNovoVeiculo = false;
                                    }
                                    break;
                                }
                            }
                        }
                    }while(adicionarNovoVeiculo);
                    adicionarNovoVeiculo = true;
                    break;
                case 3:
                    for (Passeio passeio : veiculoPasseio) {
                        if (passeio != null) {
                            System.out.println("\n=============== VEICULO PASSEIO ===============\n");
                            System.out.println(passeio);
                            System.out.println("===============================================\n");
                        }
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 4:
                    System.out.println("Todos os Veículos de Carga:");
                    for (Carga carga : veiculoCarga) {
                        if (carga != null) {
                            System.out.println("\n=============== VEICULO CARGA ===============\n");
                            System.out.println(carga);
                            System.out.println("===============================================\n");
                        }
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 5:
                    String placaPasseio = leitura.entDadosString("Insira a placa que deseja pesquisar: ");
                    boolean encontradoPasseio = false;
                    for (Passeio passeio : veiculoPasseio) {
                        if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placaPasseio)) {
                            System.out.println("\n=============== VEICULO DE PASSEIO PLACA "+ placaPasseio +" ===============\n");
                            System.out.println(passeio);
                            System.out.println("===============================================\n");
                            encontradoPasseio = true;
                            break;
                        }
                    }
                    if (!encontradoPasseio) {
                        System.out.println("\n======================== ATENÇÃO! ========================");
                        System.out.println("Veículo de passeio não encontrado com a placa informada.\n");
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 6:
                    String placaCarga = leitura.entDadosString("Insira a placa que deseja pesquisar: ");
                    boolean encontradoCarga = false;
                    for (Carga carga : veiculoCarga) {
                        if (carga != null && carga.getPlaca().equalsIgnoreCase(placaCarga)) {
                            System.out.println("\n=============== VEICULO DE CARGA PLACA "+ placaCarga +" ===============\n");
                            System.out.println(carga);
                            System.out.println("===============================================\n");
                            encontradoCarga = true;
                            break;
                        }
                    }
                    if (!encontradoCarga) {
                        System.out.println("\n======================== ATENÇÃO! ========================");
                        System.out.println("Veículo de carga não encontrado com a placa informada.\n");
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    adicionarNovoVeiculo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    adicionarNovoVeiculo = true;
                    break;
            }
        }while(adicionarNovoVeiculo);
    }
}

