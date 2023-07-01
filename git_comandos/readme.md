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
