## Como remover arquivos da área de stage
git status <br>
git reset

## Como desfazer modificações não salvas
git status <br>
git reset <br>
git clear -df <br>
git checkout -- .

## O que fazer quando abre o editor VIM
### habilitar o modo de edição:
i
### sair do VIM, salvando as alterações:
<ESC>
:wq <br>
<ENTER>
### Sair do VIM, descartando as alterações:
<ESC>
:q! <br>
<ENTER>

## Como desfazer o último commit:
Desfazer o último commit sem desfazer as modificações nos arquivos: <br>
git status <br>
git reset --soft HEAD~1 

## Como deletar commits e também modificações nos arquivos (# Atenção: acão destrutiva!):
### voltar o projeto ao estado de um dado commit (deletar commits e alterações posteriores a esse commit):
git status <br>
git reset --hard <código do commit>
### voltar o projeto ao estado do penúltimo commit:
git status <br>
git reset --hard HEAD~1

## Como atualizar o repositório local em relação ao remoto
git status <br>
git pull <nome do remote> <nome da branch>

## Como resolver push rejeitado
Não é permitido enviar um push se seu repositório local está atrasado em relação ao histórico do repositório remoto! <br>
Você tem que atualizar o repositório local: <br>
git pull <nome do remote> <nome do branch>

## Resolvendo conflito
Analise o código fonte <br>
Faça as edições necessárias <br>
Faça um novo commit

## Como sobrescrever um histórico no GitHub (# ATENÇÃO: ação destrutiva!)
git reset --hard <código do commit> <br>
git push -f <nome do remote> <nome do branch>

## Como apontar o projeto para outro repositório remoto
git remote set-url origin git@github.com:seuusuario/seurepositorio.git
