<div aling="justify">

<div style="text-align: center; "> 

# Manipulación Avanzada en Git (Manipulación avanzados de Git, GitHub y Markdown)

</div>

</br>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Pasos Previos: [Anterior Tarea](#antar)

- Procedimiento actual: [Trabajo con nuevas ramas](#newbranch)

</br>

## Pasos Previos <a name="antar"></a>

</br>

En la anterior tarea creamos un repositorio y trabajamos en el. En mi caso, tengo el repositorio creado pero no trabajado al completo como se pedía en la tarea anterior. De igual forma, trabajaré en el para esta tarea sin tocar nada.

</br>

## Trabajo con nuevas ramas <a name="newbranch"></a>

</br>

- Crear una rama v0.2

- Posiciona tu carpeta de trabajo en esta rama

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git branch v0.2
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout v0.2
Cambiado a rama 'v0.2'
```

- Añadir un fichero 2.txt en la rama v0.2

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git branch v0.2
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout v0.2
Cambiado a rama 'v0.2'
```

- Subir los cambios al reposiorio remoto

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git push origin v0.2
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Enumerando objetos: 4, listo.
Contando objetos: 100% (4/4), listo.
Compresión delta usando hasta 12 hilos
Comprimiendo objetos: 100% (2/2), listo.
Escribiendo objetos: 100% (3/3), 296 bytes | 296.00 KiB/s, listo.
Total 3 (delta 0), reusados 0 (delta 0), pack-reusados 0
remote: 
remote: Create a pull request for 'v0.2' on GitHub by visiting:
remote:      https://github.com/PeterMartEsc/my-proyecto-millonario/pull/new/v0.2
remote: 
To https://github.com/PeterMartEsc/my-proyecto-millonario.git
 * [new branch]      v0.2 -> v0.2
```

- Posicionarse en la rama master

- Hacer un merge de la rama v0.2 en la rama master

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout main
Cambiado a rama 'main'
Tu rama está actualizada con 'origin/main'.

dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$  git merge v0.2 -m "merge v0.2 sin conflictos"
Actualizando 27a07d1..cc0366a
Fast-forward (no commit created; -m option ignored)
 2.txt | 0
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 2.txt
```

- En la rama master poner Hola en el fichero 1.txt y hacer commit

- Posicionarse en la rama v0.2 y poner Adios en el fichero "1.txt" y hacer commit

- Posicionarse de nuevo en la rama master y hacer un merge con la rama v0.2

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout main
Ya en 'main'
Tu rama está adelantada a 'origin/main' por 1 commit.
  (usa "git push" para publicar tus commits locales)
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ echo "Hola" >> 1.txt
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git add .
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git commit -m "hola en 1.txt"
[main b6c0ec2] hola en 1.txt
 1 file changed, 1 insertion(+)
 create mode 100644 1.txt

dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout v0.2
Cambiado a rama 'v0.2'
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ echo "Adios" >> 1.txt
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git add . 
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git commit -m "Adios en 1.txt"
[v0.2 87863fb] Adios en 1.txt
 1 file changed, 1 insertion(+)
 create mode 100644 1.txt

dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git checkout main
Cambiado a rama 'main'
Tu rama está adelantada a 'origin/main' por 2 commits.
  (usa "git push" para publicar tus commits locales)
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ nano 1.txt
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git add .
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git commit -m "arreglado el merge en 1.txt"
[main 1560a68] arreglado el merge en 1.txt
```
- Listar las ramas con merge y las ramas sin merge

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git branch --merged
* main
  v0.2
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git branch --no-merged
```

- Arreglar el conflicto anterior y hacer un commit.

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ nano 1.txt
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git add .
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git commit -m "arreglado el merge en 1.txt"
[main 1560a68] arreglado el merge en 1.txt
```

- Crear un tag v0.2

- Borrar la rama v0.2

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git tag v0.2
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git branch -d v0.2
Eliminada la rama v0.2 (era 87863fb).
```

- Listar los distintos commits con sus ramas y sus tags

```code
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git config --global alias.list 'log --oneline --decorate --graph --all'
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ git list
*   1560a68 (HEAD -> main, tag: v0.2) arreglado el merge en 1.txt
|\  
| * 87863fb Adios en 1.txt
* | b6c0ec2 hola en 1.txt
|/  
* cc0366a (origin/v0.2) Se añade el archivo 2.txt
* 27a07d1 (origin/main, origin/HEAD) Initial commit
```

