# Práctica Exámen

Hecho por: __Pedro Martín Escuela__

</br>

- Crea un repositorio en tu cuenta de Github con el siguiente nombre: ejercicio_git_nombre_alumno, donde nombre_alumno debe de ser tu nombre siguiendo el patrón nombre_apellido1_apellido2. No incluyas el fichero README.md.

- Realiza la clonación del frepositorio creado.

- Añadir el archivo README al repositorio y realizar el primer commit.

- Crear una rama con nombre develop.

- Lista las ramas actuales.

</br>

```code
dam@a108pc04:~/PeterMartEsc$ ls
BASE_DE_DATOS  FOL                 MaquinaVirtualCopSegur  PROGRAMACION
ETS            LENGUAJE_DE_MARCAS  my-proyecto-millonario
dam@a108pc04:~/PeterMartEsc$ mkdir ejercicio-examen
dam@a108pc04:~/PeterMartEsc$ cd ejercicio-examen
dam@a108pc04:~/PeterMartEsc/ejercicio-examen$ git init
ayuda: Usando 'master' como el nombre de la rama inicial. Este nombre de rama predeterminado
ayuda: está sujeto a cambios. Para configurar el nombre de la rama inicial para usar en todos
ayuda: de sus nuevos repositorios, reprimiendo esta advertencia, llama a:
ayuda: 
ayuda: 	git config --global init.defaultBranch <nombre>
ayuda: 
ayuda: Los nombres comúnmente elegidos en lugar de 'master' son 'main', 'trunk' y
ayuda: 'development'. Se puede cambiar el nombre de la rama recién creada mediante este comando:
ayuda: 
ayuda: 	git branch -m <nombre>
Inicializado repositorio Git vacío en /home/dam/PeterMartEsc/ejercicio-examen/.git/
dam@a108pc04:~/PeterMartEsc/ejercicio-examen$ ls -la
total 12
drwxrwxr-x  3 dam dam 4096 oct 18 14:58 .
drwxrwxr-x 10 dam dam 4096 oct 18 14:58 ..
drwxrwxr-x  7 dam dam 4096 oct 18 14:58 .git
dam@a108pc04:~/PeterMartEsc/ejercicio-examen$ git clone https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
Clonando en 'ejercicio_git_Pedro_Martin_Escuela'...
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
warning: Pareces haber clonado un repositorio sin contenido.

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ touch README.md
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ ls
README.md
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git add .
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git commit -m "Se añade el archivo README"
[main (commit-raíz) da58403] Se añade el archivo README
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.md
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git branch develop
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git branch
  develop
* main
```

- Moverse a la rama y crear el fichero: hola.html. y añadir el contenido especificado

```code
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git checkout develop
Cambiado a rama 'develop'
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ touch hola.html
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ cat >> hola.html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Hola </title>
</head>
<body>
<h1 align="center" >Hola soy un título </h1>
<hr>
<p> Hola soy el alumno Pedro_Martin_Escuela </p>
</body>
</html>
```

- Moverse a la rama principal y crear el fichero adios.html > Sustituye nombre_alumno por tu nombre.

```code
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git checkout main
Cambiado a rama 'main'
Tu rama está basada en 'origin/main', pero upstream ha desaparecido.
  (usa "git branch --unset-upstream" para arreglar)
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git branch
  develop
* main
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ touch adios.html
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ cat >> adios.html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Adios </title>
</head>
<body>
<h1 align="center" >Adios soy un título </h1>
<hr>
<p> Adios soy el alumno Pedro_Martin_Escuela </p>
</body>
</html>
```

- Crea el commit con un mensaje descriptivo.

- Sube los cambios a la rama actual.

- Lista las ramas actuales.

- Realizar la mezcla en el repositorio principal.

- Sube los cambios al repositorio a tu cuenta de Github.

- Muestra todos los cambios realizados.

- Lista ahora los últimos cambios que se han producido en el repositorio, es decir, los últimos commits que han realizado en el repositorio.

- Lista todos los tags(etiquetas que existan).

- Crea una nueva etiqueta (tag) de nombre v.1 y sube los cambios.

- Crea la feature-2 y muevete a esta.

```code
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git add .
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git commit -m "Se añade la segunda rama llamada develop y se añaden los archivos hola, a esta rama y adiós, a la main"
[main 1758a49] Se añade la segunda rama llamada develop y se añaden los archivos hola, a esta rama y adiós, a la main
 2 files changed, 22 insertions(+)
 create mode 100644 adios.html
 create mode 100644 hola.html
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git push --set-upstream origin develop
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Total 0 (delta 0), reusados 0 (delta 0), pack-reusados 0
remote: 
remote: Create a pull request for 'develop' on GitHub by visiting:
remote:      https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela/pull/new/develop
remote: 
To https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
 * [new branch]      develop -> develop
Rama 'develop' configurada para hacer seguimiento a la rama remota 'develop' de 'origin'.
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git merge develop
Ya está actualizado.

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git add .
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git push 
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Enumerando objetos: 7, listo.
Contando objetos: 100% (7/7), listo.
Compresión delta usando hasta 12 hilos
Comprimiendo objetos: 100% (5/5), listo.
Escribiendo objetos: 100% (7/7), 835 bytes | 835.00 KiB/s, listo.
Total 7 (delta 1), reusados 0 (delta 0), pack-reusados 0
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
 * [new branch]      main -> main
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git branch
  develop
* main

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git log
commit 1758a491be1c3a4b7321c77aa7bba25bb79437c8 (HEAD -> main, origin/main)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:09:32 2023 +0100

    Se añade la segunda rama llamada develop y se añaden los archivos hola, a esta rama y adiós, a la main

commit da58403f35d749da3652db901035d4bb009dcc25 (develop)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:01:42 2023 +0100

    Se añade el archivo README

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git checkout -B feature-2
Cambiado a nueva rama 'feature-2'
```

- Crea el archivo Estamos_a_punto_de_terminar.html, con el siguiente contenido:

```code
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ touch Estamos_a_punto_de_terminar.html
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ ls
adios.html  Estamos_a_punto_de_terminar.html  hola.html  README.md
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ cat >> Estamos_a_punto_de_terminar.html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Terminando </title>
</head>
<body>
<h1 align="center" >Apunto de terminar </h1>
<hr>
<p> Esto se esta acabando Pedro_Martin_Escuela </p>
</body>
</html>
```

- Realiza el commit y sube los cambios.

- Muevete a la rama develop, y realiza la mezcla con la rama feature-2.

- Sube los cambios de la rama develop a Github.

- Cambia a la rama principal, realiza la mezcla con la rama develop.

- Realiza el tag con el nombre v.2. y sube los cambios.

- Muestra todos los cambios realizados en el repositorio.

- Muestra todos los commits realizados.

```code
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git add .
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git commit -m "Se ha añadido una nueva rama y añadido un archivo html con el texto indicado"
[feature-2 2ca54ce] Se ha añadido una nueva rama y añadido un archivo html con el texto indicado
 1 file changed, 11 insertions(+)
 create mode 100644 Estamos_a_punto_de_terminar.html

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git push --set-upstream origin feature-2
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Enumerando objetos: 4, listo.
Contando objetos: 100% (4/4), listo.
Compresión delta usando hasta 12 hilos
Comprimiendo objetos: 100% (3/3), listo.
Escribiendo objetos: 100% (3/3), 609 bytes | 609.00 KiB/s, listo.
Total 3 (delta 0), reusados 0 (delta 0), pack-reusados 0
remote: 
remote: Create a pull request for 'feature-2' on GitHub by visiting:
remote:      https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela/pull/new/feature-2
remote: 
To https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
 * [new branch]      feature-2 -> feature-2
Rama 'feature-2' configurada para hacer seguimiento a la rama remota 'feature-2' de 'origin'.

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git merge feature-2
Actualizando da58403..2ca54ce
Fast-forward
 Estamos_a_punto_de_terminar.html | 11 +++++++++++
 adios.html                       | 11 +++++++++++
 hola.html                        | 11 +++++++++++
 3 files changed, 33 insertions(+)
 create mode 100644 Estamos_a_punto_de_terminar.html
 create mode 100644 adios.html
 create mode 100644 hola.html

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git push --set-upstream origin develop
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Total 0 (delta 0), reusados 0 (delta 0), pack-reusados 0
To https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
   da58403..2ca54ce  develop -> develop
Rama 'develop' configurada para hacer seguimiento a la rama remota 'develop' de 'origin'.

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git checkout main
Cambiado a rama 'main'
Tu rama está actualizada con 'origin/main'.
dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git merge develop
Actualizando 1758a49..2ca54ce
Fast-forward
 Estamos_a_punto_de_terminar.html | 11 +++++++++++
 1 file changed, 11 insertions(+)
 create mode 100644 Estamos_a_punto_de_terminar.html

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git push 
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
Total 0 (delta 0), reusados 0 (delta 0), pack-reusados 0

To https://github.com/PeterMartEsc/ejercicio_git_Pedro_Martin_Escuela.git
   1758a49..2ca54ce  main -> main

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git show
commit 2ca54ce30377a952f6d2d81cceaf37f40715f3b7 (HEAD -> main, origin/main, origin/feature-2, origin/develop, feature-2, develop)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:20:50 2023 +0100

    Se ha añadido una nueva rama y añadido un archivo html con el texto indicado

diff --git a/Estamos_a_punto_de_terminar.html b/Estamos_a_punto_de_terminar.html
new file mode 100644
index 0000000..6e4782e
--- /dev/null
+++ b/Estamos_a_punto_de_terminar.html
@@ -0,0 +1,11 @@
+<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
+<html>
+<head>
+<title>Terminando </title>
+</head>
+<body>
+<h1 align="center" >Apunto de terminar </h1>
+<hr>
+<p> Esto se esta acabando Pedro_Martin_Escuela </p>
+</body>
+</html>

[3]+  Detenido                git show

dam@a108pc04:~/PeterMartEsc/ejercicio-examen/ejercicio_git_Pedro_Martin_Escuela$ git log
commit 2ca54ce30377a952f6d2d81cceaf37f40715f3b7 (HEAD -> main, origin/main, origin/feature-2, origin/develop, feature-2, develop)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:20:50 2023 +0100

    Se ha añadido una nueva rama y añadido un archivo html con el texto indicado

commit 1758a491be1c3a4b7321c77aa7bba25bb79437c8
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:09:32 2023 +0100

    Se añade la segunda rama llamada develop y se añaden los archivos hola, a esta rama y adiós, a la main

commit da58403f35d749da3652db901035d4bb009dcc25
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 18 15:01:42 2023 +0100

    Se añade el archivo README
```

Me he liado con los tag que es lo que no recordaba, espero que no afectase al resto de apartados.