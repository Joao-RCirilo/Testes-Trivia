#language: pt

Funcionalidade: Buscar no Banco de Questões 

Cenário: Buscar por questões inexistentes 
Dado que navego para a página de busca do banco de questões 
E digito ‘Science: Computer no campo de busca 
Quando clico no botão de buscar 
Então visualizo uma mensagem de erro com o texto ‘No questions found.’
