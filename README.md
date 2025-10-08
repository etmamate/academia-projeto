Projeto feito por: Mateus Cristo da Silva e Mikaella Cintra
-----

# Gerenciador de Cardápio em Java (Exemplo OOP)

Este projeto é uma aplicação de console simples em Java, desenvolvida para demonstrar os conceitos fundamentais da Programação Orientada a Objetos (OOP), como Herança, Polimorfismo e Encapsulamento.

A aplicação simula o gerenciamento de um cardápio, onde é possível cadastrar diferentes tipos de itens (Pratos Principais e Sobremesas) que herdam de uma entidade base comum.

## ✨ Funcionalidades Principais

  * **Estrutura Hierárquica:** Utiliza uma classe base abstrata (`Entidade`) e classes derivadas (`PratoPrincipal`, `Sobremesa`) para representar a relação "é um".
  * **Cadastro de Itens:** Permite ao usuário adicionar novos pratos principais e sobremesas ao cardápio de forma interativa.
  * **Exibição de Informações:** Mostra uma lista completa de todos os itens cadastrados, exibindo os detalhes específicos de cada tipo de item.
  * **Cálculos Específicos:** Cada subclasse implementa seu próprio método para calcular o preço final, demonstrando o polimorfismo.
  * **Menu Interativo:** Uma interface de console simples guia o usuário através das funcionalidades disponíveis.

## 🚀 Tecnologias Utilizadas

  * **Java:** O projeto é inteiramente construído em Java.
  * **JDK (Java Development Kit):** Necessário para compilar e executar o código.

## 📂 Estrutura do Projeto

O código-fonte está organizado nos seguintes arquivos:

```
.
├── Entidade.java
├── GerenciadorCardapio.java
├── PratoPrincipal.java
├── Entrada.java
└── Sobremesa.java
```

  * `Entidade.java`: Classe base (abstrata) que define os atributos e métodos comuns a todos os itens do cardápio (ex: `nome`, `precoBase`).
  * `PratoPrincipal.java`: Subclasse que herda de `Entidade` e representa um prato principal. Adiciona atributos específicos e implementa seus próprios métodos.
  * `Entrada.java`: Subclasse que herda de `Entidade` e representa uma entrada. Adiciona atributos específicos e implementa seus próprios métodos.
  * `Sobremesa.java`: Subclasse que herda de `Entidade` e representa uma sobremesa, com seus próprios atributos e implementações.
  * `GerenciadorCardapio.java`: A classe principal da aplicação, contendo o método `main`. É responsável pelo menu, interação com o usuário e gerenciamento da lista de itens.

## ⚙️ Como Executar o Projeto

Para compilar e executar este projeto localmente, siga os passos abaixo.

### Pré-requisitos

  * Você precisa ter o **Java Development Kit (JDK)** instalado em sua máquina. Para verificar se ele está instalado, abra o terminal e digite:
    ```sh
    java -version
    ```

### Passos

1.  **Clone o repositório** (ou baixe os arquivos `.java` para uma mesma pasta):

    ```sh
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2.  **Navegue até o diretório do projeto** pelo terminal:

    ```sh
    cd seu-repositorio
    ```

3.  **Compile todos os arquivos `.java`**:

    ```sh
    javac *.java
    ```

    Este comando irá gerar os arquivos `.class` correspondentes.

4.  **Execute a aplicação**:

    ```sh
    java GerenciadorCardapio
    ```

Após executar o último comando, o menu interativo da aplicação será exibido no seu terminal.

## 📝 Exemplo de Uso

Ao iniciar o programa, você verá o seguinte menu:

```
===== GERENCIADOR DE CARDÁPIO =====
1. Cadastrar Prato Principal
2. Cadastrar uma Entrada
3. Cadastrar Sobremesa
4. Exibir Cardápio Completo
5. Sair
Escolha uma opção:
```

Você pode cadastrar um prato:

```
Escolha uma opção: 1
Nome do prato: Filé à Parmegiana
Preço base: 50.0
Ingrediente principal: Filé Mignon
Prato principal cadastrado com sucesso!
```

E uma sobremesa:

```
Escolha uma opção: 2
Nome da sobremesa: Petit Gâteau
Preço base: 25.0
É uma sobremesa gelada? (s/n): s
Sobremesa cadastrada com sucesso!
```

Depois, pode exibir o cardápio completo:

```
Escolha uma opção: 3

========= CARDÁPIO COMPLETO =========

--- Prato Principal ---
Nome: Filé à Parmegiana
Preço Base: R$ 50,00
Ingrediente Principal: Filé Mignon
Preço Final (com taxa): R$ 55,00

--- Sobremesa ---
Nome: Petit Gâteau
Preço Base: R$ 25,00
É gelada? Sim
Preço Final: R$ 27,50
=====================================
```
