## Este foi meu primeiro curso gratuito para aprender a utilizar a linguagem Java

# ☕ Meu Primeiro Curso de Java

Este é o meu **primeiro curso para aprender a utilizar a linguagem Java**.

Neste arquivo, vou registrar os principais conteúdos aprendidos durante as aulas, juntamente com os exercícios realizados ao longo do curso.

---

## 📚 Conteúdos Aprendidos

### 🖨️ Aula 01 — `println()`

A primeira aula foi dedicada ao funcionamento do método `println()` em Java.

Aprendi como utilizar o `println()` para **exibir informações no console**.

Ele é um dos primeiros recursos utilizados quando começamos a aprender Java.

Exemplo:

    System.out.println("Olá, mundo!");

O código acima exibe a mensagem:

    Olá, mundo!

---

### 🔢 Aula 02 — Tipos Primitivos

A segunda aula foi sobre os **tipos primitivos de variáveis** disponíveis em Java.

Aprendemos alguns dos principais tipos, como:

| Tipo | Descrição | Exemplo |
|------|-----------|---------|
| `int` | Números inteiros | `10` |
| `double` | Números decimais | `10.5` |
| `float` | Números decimais | `10.5f` |
| `char` | Um único caractere | `'A'` |
| `boolean` | Verdadeiro ou falso | `true` |
| `byte` | Números inteiros pequenos | `100` |
| `short` | Números inteiros | `1000` |
| `long` | Números inteiros maiores | `100000L` |

Exemplos de utilização:

    int idade = 20;
    double altura = 1.75;
    char inicial = 'J';
    boolean estudante = true;

Após a explicação sobre os tipos primitivos, foram realizados alguns **exercícios básicos** para praticar os conceitos aprendidos.

---

### ➕ Aula 03 — Operadores

Na aula seguinte, o tema abordado foi **Operadores em Java**.

Aprendemos a utilizar alguns dos operadores mais comuns da linguagem.

#### Operadores Aritméticos

São utilizados para realizar operações matemáticas.

| Operador | Operação |
|----------|----------|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão |

Exemplo:

    int numero1 = 10;
    int numero2 = 5;

    int soma = numero1 + numero2;
    int subtracao = numero1 - numero2;
    int multiplicacao = numero1 * numero2;
    int divisao = numero1 / numero2;
    int resto = numero1 % numero2;

---

#### Operadores de Atribuição

São utilizados para atribuir ou atualizar valores em variáveis.

    =
    +=
    -=
    *=
    /=

Exemplo:

    int numero = 10;
    numero += 5;

Nesse caso, o valor da variável `numero` passa a ser `15`.

---

#### Operadores Relacionais

São utilizados para realizar **comparações** entre valores.

    ==
    !=
    >
    <
    >=
    <=

Exemplo:

    int idade = 18;

    System.out.println(idade >= 18);

Resultado:

    true

---

#### Operadores Lógicos

São utilizados principalmente para trabalhar com valores booleanos e criar condições.

    &&
    ||
    !

| Operador | Significado |
|----------|-------------|
| `&&` | E |
| `||` | OU |
| `!` | NÃO |

Exemplo:

    int idade = 20;
    boolean possuiDocumento = true;

    System.out.println(idade >= 18 && possuiDocumento);

Resultado:

    true

---

### 🔀 Aula 04 — Estruturas Condicionais

Nesta aula aprendi sobre **estruturas condicionais**, que permitem que o programa tome decisões de acordo com determinadas condições.

As principais estruturas estudadas foram:

- `if`
- `else`
- `else if`

#### `if`

O `if` é utilizado para executar um determinado bloco de código **caso uma condição seja verdadeira**.

Exemplo:

    int idade = 18;

    if (idade >= 18) {
        System.out.println("Maior de idade");
    }

Nesse caso, a mensagem será exibida somente se `idade` for maior ou igual a `18`.

---

#### `else`

O `else` é utilizado para executar outro bloco de código quando a condição do `if` for **falsa**.

Exemplo:

    int idade = 16;

    if (idade >= 18) {
        System.out.println("Maior de idade");
    } else {
        System.out.println("Menor de idade");
    }

Resultado:

    Menor de idade

---

#### `else if`

O `else if` permite verificar **outras condições** caso a primeira condição não seja verdadeira.

Exemplo:

    int nota = 7;

    if (nota >= 9) {
        System.out.println("Excelente");
    } else if (nota >= 6) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
    }

Resultado:

    Aprovado

As estruturas condicionais são importantes porque permitem que o programa **tome decisões diferentes dependendo dos valores recebidos**.

---

### 🔁 Aula 05 — Estruturas de Repetição

Nesta aula aprendi sobre **estruturas de repetição**, utilizadas para executar um determinado bloco de código várias vezes enquanto uma condição for atendida.

Entre as estruturas estudadas estão:

- `while`
- `do-while`

---

#### `while`

O `while` executa um bloco de código **enquanto uma determinada condição for verdadeira**.

Exemplo:

    int contador = 1;

    while (contador <= 5) {
        System.out.println(contador);
        contador++;
    }

Resultado:

    1
    2
    3
    4
    5

A condição é verificada **antes** da execução do bloco.

Por isso, caso a condição já seja falsa inicialmente, o código dentro do `while` não será executado nenhuma vez.

---

#### `do-while`

O `do-while` é parecido com o `while`, porém possui uma diferença importante: o bloco de código é executado **pelo menos uma vez**, pois a condição é verificada somente depois da execução.

Exemplo:

    int contador = 1;

    do {
        System.out.println(contador);
        contador++;
    } while (contador <= 5);

Resultado:

    1
    2
    3
    4
    5

A principal diferença entre `while` e `do-while` é:

- `while` → verifica a condição **antes** de executar.
- `do-while` → executa primeiro e verifica a condição **depois**.

---

## 📝 Exercícios

Durante o curso também foram realizados exercícios para colocar em prática os conteúdos apresentados nas aulas.

Até o momento, os exercícios foram **bem básicos**, com o objetivo de reforçar os conceitos fundamentais da linguagem Java.

Os exercícios envolveram conceitos como:

- Exibição de informações no console;
- Declaração e utilização de variáveis;
- Tipos primitivos;
- Operações matemáticas;
- Comparações;
- Operadores lógicos;
- Estruturas condicionais;
- Estruturas de repetição.

---

## 🎯 Objetivo do Curso

O objetivo deste curso é construir uma **base sólida em Java**, aprendendo gradualmente os principais conceitos da linguagem por meio de explicações e exercícios práticos.

A ideia é registrar aqui minha evolução durante o aprendizado e utilizar este arquivo como uma forma de **documentar minha jornada com Java**.

---

## 📈 Progresso

- [x] `println()`
- [x] Tipos Primitivos
- [x] Operadores
- [x] Condicionais
- [x] Estruturas de Repetição
- [ ] Arrays
- [ ] Métodos
- [ ] Programação Orientada a Objetos
- [ ] Classes e Objetos
- [ ] Herança
- [ ] Polimorfismo
- [ ] Encapsulamento
- [ ] Outros conceitos

---

> 🚀 **Este é apenas o começo da minha jornada com Java!**