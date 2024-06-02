# Bootcamp DIO

## POO - Desafio

Modelagem e Diagramação de um Componente iPhone

Neste desafio, o objetivo será modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

Contexto
Com base no vídeo de lançamento do iPhone de 2007 se deve elaborar a diagramação das classes e interfaces. Em seguida, implemente as classes e interfaces no formato de arquivos .java.


### Interfaces
| ReprodutorMusical  | NavegadorNaInternet | Telefone |
| ------------- | ------------- | ------------- |
| + tocar()  | + exibirPagina(String url) | + ligar(String numero)  |
| + pausar()  | + adicionarNovaAba() | + atender()  |
| + selecionarMusica(String musica) |+ atualizarPagina() | + iniciarCorreioVoz()|


### Class
| Iphone |
|--------|
|Implementa:|
|ReprodutorMusical|
|NavegadorNaInternet|
|Telefone|
