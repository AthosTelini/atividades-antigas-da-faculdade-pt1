# Projeto-Banco-Java

Atividade de revisão 

(Crie as classes dentro do pacote banco no projeto)

 O objetivo aqui é criar um sistema para gerenciar os funcionários do Banco.

1) Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário (double), a data de entrada no banco (String), seu RG (String) e um valor booleano que indique se o funcionário ainda está ativa na empresa no momento ou se já foi mandado embora.

Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método bonifica que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento. Crie, também, um método demite, que não recebe parâmetro algum, só modifica o valor booleano indicando que o funcionário não trabalha mais aqui.

A idéia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funcionário faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.

2) Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main. Você deve criar a classe do funcionário chamada Funcionario, e a classe de teste você pode nomear como quiser. A de teste deve possuir o método main.

Um esboço da classe:

class Funcionario {
double salario;
// seus outros atributos e métodos
void bonifica(double aumento) {
// o que fazer aqui dentro?
}
void demite() {
// o que fazer aqui dentro?
}
}

Incremente essa classe. Faça outros testes, imprima outros atributos e invoque os métodos que você criou a mais.

3) Crie um método mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos os atributos do nosso funcionário. Dessa maneira, você não precisa ficar copiando e colando um monte de System.out.println() para cada mudança e teste que fizer com cada um de seus funcionários, você simplesmente vai fazer:

Funcionario f1 = new Funcionario();
f1.mostra();

O esqueleto do método ficaria assim:
class Funcionario {
// seus outros atributos e métodos
void mostra() {
System.out.println("Nome: " + this.nome);
// imprimir aqui os outros atributos...
}
}

Implemente o encapsulamento (get e set) na classe Funcionário e Cliente.

Atividade 2 (crie um novo pacote no projeto com o nome “casa”)

1) Programa 1
Classe: Pessoa Atributos: nome, idade. Método: void fazAniversario() Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.

2) Programa 2
Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta() Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método estaAberta para verificar se ela está aberta.

3) Programa 3
Classe: Casa Atributos: cor, porta1, porta2, porta3 os três últimos atributos fará referência para  classe Porta Método: void pinta(String s), int quantasPortasEstaoAbertas() Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.


Atividade 3

- No projeto crie um pacote com o nome “contasPagas” e dentro deste pacote crie as seguintes classes: “Cliente”, “Produto”, “Conta” e “Programa”.
– A classe “Cliente” deverá conter os seguintes atributos ou variáveis de instância:  “nomeCliente” e “cpf” (todos private)
– A classe “Produto” deverá conter os seguintes atributos ou variáveis de instância:  “descricaoProduto” e “valorProduto” (todos private)
– A classe “Conta” deverá ter os seguintes atributos: “idConta”, “dataVencimento”, “dataPagamento”, (todos private) “pro”  (do tipo Produto) e  “cli” (do tipo Cliente). 
- A classe “Conta” deverá conter um método sem retorno e sem parâmetro com o nome “visualizarConta” , esse método deverá imprimir na saída padrão as seguintes informações: 1ª linha (identificador da conta), 2ª linha (nome do produto), 3ª linha (nome e cpf do cliente), 4ª linha (valor do produto), 5ª linha (data do vencimento) e na 6ª linha (data do pagamento).
 – A classe “Programa” necessitará do método principal (main), onde deverão ser instanciados dois objetos da classe “Produto”, dois da classe “Cliente” e dois da classe “Conta”. 
 – Na classe “Programa” passe valores para os atributos dos objetos instanciados na questão anterior, utilize o método “visualizarConta” para visualização das duas contas pagas anteriormente ”. 

 

