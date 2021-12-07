#language: pt

Funcionalidade: Busca de questões no Banco de dados filtrando por categoria.

Cenário: Buscar questões por categoria selecionando a categoria Science: Computers verificando quantas questões por página.
Dado que navego pelo banco de questões
E digito no capo de texto ‘Science: Computers,’ seleciono Categoria.
Quando clico em Pesquisar
Então visualizo 25 itens na página com um controle de paginação abaixo.
