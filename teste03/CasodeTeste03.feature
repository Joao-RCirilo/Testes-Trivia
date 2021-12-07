#language: pt
Funcionalidade: adicionar questões ao banco de dados. 

Cenário: Adicionar uma nova questão inexistente.
Dado que estou na página inicial 
Quando clico em adicionar nova questão 
E quero adicionar uma questão inexistente no banco de questões 
Então visualizo uma mensagem que não posso adicionar uma nova questão porque não estou logado a nenhuma conta.
