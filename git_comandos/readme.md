## Como remover arquivos da área de stage

git status
git reset

## Como desfazer modificações não salvas

git status
git reset
git clear -df
git checkout -- .

## O que fazer quando abre o editor VIM
### sair do VIM, salvando as alterações:
<ESC>
:wq
<ENTER>

### Sair do VIM, descartando as alterações:
<ESC>
:q!
<ENTER>