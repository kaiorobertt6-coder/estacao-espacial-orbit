# 🚀 Calculadora de Viagem Terra → Marte

## 📖 Sobre o projeto

Programa desenvolvido em **Java** que calcula uma estimativa do tempo necessário para uma nave viajar da **Terra até Marte e retornar à Terra**.

O cálculo utiliza a distância média entre os planetas e a velocidade média da nave informada pelo usuário.

## 🎯 Objetivo

Praticar conceitos básicos de programação em Java, como:

* Variáveis;
* Entrada e saída de dados;
* Operações matemáticas;
* Conversão de unidades;
* Git e GitHub.

## 🧮 Como funciona

O programa considera uma distância média de **225.000.000 km** entre a Terra e Marte.

A fórmula utilizada é:

```text
Tempo = Distância ÷ Velocidade
```

O resultado é apresentado em:

* Horas;
* Dias;
* Meses.

### Exemplo

Com uma velocidade de **100.000 km/h**:

```text
Ida: 93,75 dias
Volta: 93,75 dias
Total: 187,5 dias
Aproximadamente: 6,25 meses
```

## 💻 Tecnologias

* Java
* JDK 17+
* Scanner
* Git
* GitHub

## 📁 Estrutura

```text
viagem-marte/
├── ViagemMarte.java
└── README.md
```

## 🌿 Branches

O projeto utiliza três branches:

### `develop`

Utilizada para desenvolvimento de novas funcionalidades e alterações.

### `stage`

Utilizada para testes e validação das alterações antes da versão final.

### `main`

Contém a versão principal e estável do projeto.

### Fluxo

```text
develop → stage → main
```

## ▶️ Como executar

Compile o programa:

```bash
javac ViagemMarte.java
```

Execute:

```bash
java ViagemMarte
```

O programa solicitará a velocidade média da nave e exibirá o tempo estimado da viagem.

## ⚠️ Observação

O cálculo é uma **estimativa simplificada**. Uma missão espacial real precisa considerar órbitas, trajetória, aceleração, combustível, posições dos planetas e outros fatores.

## 👨‍💻 Autor

**Kaio Moreira**

Projeto desenvolvido para fins acadêmicos e de aprendizado em Garantia e Qualidade de Softawere.
