# Descrição do Projeto

Este repositório contém a implementação das classes Veículo, Motor e Teste em Java, de acordo com a atividade 4 da disciplina de POO. O projeto permite criar e gerenciar informações de veículos de passeio e carga, definindo suas características como marca, modelo, placa, velocidade máxima, tipo de motor (potência e tipo) e outros atributos.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/main/java/com/alexandretrieste/atividade4**:
  - Veiculo.java: Classe abstrata que define as características básicas de um veículo.
  - Passeio.java: Classe que representa um veículo de passeio, herdando da classe Veiculo.
  - Carga.java: Classe que representa um veículo de carga, herdando da classe Veiculo.
  - Motor.java: Classe que define as características de um motor.
  - Teste.java: Classe com o método main para testar o sistema.

## Funcionalidades

O sistema permite:

- Criar e instanciar objetos das classes Veículo, Passeio e Carga:
  - Definindo os atributos de cada veículo, como marca, modelo, placa, velocidade máxima, tipo de motor, etc.
- Calcular a velocidade máxima de cada veículo:
  - Implementando o método abstrato `calcVel()` na classe Veículo.
- Testar as funcionalidades do sistema:
  - Através da classe Teste, instanciando objetos das classes Veículo, Passeio e Carga e chamando seus métodos.

## Exemplos de Uso

```java
// Criando um veículo de passeio
Veiculo passeio = new Passeio();
passeio.setMarca("Ford");
passeio.setModelo("Mustang");
passeio.setPlaca("ABC-1234");
passeio.setVelocMax(250);
passeio.setQtdRodas(4);
passeio.setCor("Vermelho");
passeio.setQtdPassageiros(4);
passeio.getMotor().setPotencia(460);
passeio.getMotor().setTipo("gasolina");

// Imprimindo informações do veículo de passeio
System.out.println("Veículo de Passeio:");
System.out.println("  Placa: " + passeio.getPlaca());
System.out.println("  Marca: " + passeio.getMarca());
System.out.println("  Modelo: " + passeio.getModelo());
System.out.println("  Cor: " + passeio.getCor());
System.out.println("  Velocidade Máxima: " + passeio.getVelocMax());
System.out.println("  Número de Rodas: " + passeio.getQtdRodas());
System.out.println("  Motor:");
System.out.println("    Potência: " + passeio.getMotor().getPotencia());
System.out.println("    Tipo: " + passeio.getMotor().getTipo());
System.out.println("  Número de Passageiros: " + ((Passeio) passeio).getQtdPassageiros());

// Criando um veículo de carga
Veiculo carga = new Carga();
carga.setMarca("Volkswagen");
carga.setModelo("Amarok");
carga.setPlaca("DEF-5678");
carga.setVelocMax(180);
carga.setQtdRodas(4);
carga.setCor("Branco");
carga.setTara(2000);
carga.setCargaMax(5000);
carga.getMotor().setPotencia(200);
carga.getMotor().setTipo("diesel");

// Imprimindo informações do veículo de carga
System.out.println("\nVeículo de Carga:");
System.out.println("  Placa: " + carga.getPlaca());
System.out.println("  Marca: " + carga.getMarca());
System.out.println("  Modelo: " + carga.getModelo());
System.out.println("  Cor: " + carga.getCor());
System.out.println("  Velocidade Máxima: " + carga.getVelocMax());
System.out.println("  Número de Rodas: " + carga.getQtdRodas());
System.out.println("  Motor:");
System.out.println("    Potência: " + carga.getMotor().getPotencia());
System.out.println("    Tipo: " + carga.getMotor().getTipo());
```
