## Como remover arquivos da área de stage
git status
git reset

## Como desfazer modificações não salvas
git status
git reset
git clear -df
git checkout -- .

## O que fazer quando abre o editor VIM
### habilitar o modo de edição:
i
### sair do VIM, salvando as alterações:
<ESC>
:wq
<ENTER>
### Sair do VIM, descartando as alterações:
<ESC>
:q!
<ENTER>

## Como desfazer o último commit:
Desfazer o último commit sem desfazer as modificações nos arquivos:
git status
git reset --soft HEAD~1 

## Como deletar commits e também modificações nos arquivos (# Atenção: acão destrutiva!):
### voltar o projeto ao estado de um dado commit (deletar commits e alterações posteriores a esse commit):
git status
git reset --hard <código do commit>
### voltar o projeto ao estado do penúltimo commit:
git status
git reset --hard HEAD~1

## Como atualizar o repositório local em relação ao remoto
git status
git pull <nome do remote> <nome da branch>

## Como resolver push rejeitado
Não é permitido enviar um push se seu repositório local está atrasado em relação ao histórico do repositório remoto!
Você tem que atualizar o repositório local:
git pull <nome do remote> <nome do branch>

## Resolvendo conflito
Analise o código fonte
Faça as edições necessárias
Faça um novo commit

## Como sobrescrever um histórico no GitHub (# ATENÇÃO: ação destrutiva!)
git reset --hard <código do commit>
git push -f <nome do remote> <nome do branch>

## Como apontar o projeto para outro repositório remoto
git remote set-url origin git@github.com:seuusuario/seurepositorio.git