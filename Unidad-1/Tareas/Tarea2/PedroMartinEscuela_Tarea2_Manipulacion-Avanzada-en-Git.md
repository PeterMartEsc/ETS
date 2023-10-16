<div aling="justify">

<div style="text-align: center; "> 

# Manipulación Avanzada en Git

</div>

</br>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Pasos Previos: [Pasos Previos](#pasosprevios)
- Ejercicio 1: [Ejercicio 1](#ej1)
- Ejercicio 2: [Ejercicio 2](#ej2)
- Ejercicio 3. [Ejercicio 3](#ej3)
- Ejercicio 4: [Ejercicio 4](#ej4)
- Ejercicio 5: [Ejercicio 5](#ej5)
- Ejercicio 6: [Ejercicio 6](#ej6)
- Ejercicio 7: [Ejercicio 7](#ej7)
- Ejercicio 8: [Ejercicio 8](#ej8)
- Ejercicio 9: [Ejercicio 9](#ej9)

</br>

## Pasos Previos  <a name="pasosprevios"></a>

Para hacer estos ejercicios es necesario haber hecho antes los ejercicios sobre historial de cambios o bien hacer un clon del repositorio remoto https://github.com/jpexposito/libro mediante la siguiente secuencia de comandos.

</br>

### Procedimiento

- Primero clono el repositorio con __git clone__

- A continuación entro en la carpeta llamada __libro__

- Finalmente listo el contenido de la carpeta de forma de tallada

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2$ git clone https://github.com/jpexposito/libro.git 

Clonando en 'libro'...
remote: Enumerating objects: 21, done.
remote: Counting objects: 100% (21/21), done.
remote: Compressing objects: 100% (12/12), done.
remote: Total 21 (delta 2), reused 13 (delta 0), pack-reused 0
Recibiendo objetos: 100% (21/21), listo.
Resolviendo deltas: 100% (2/2), listo.

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2$ cd libro
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ ls -la

total 28
drwxrwxr-x 6 dam dam 4096 oct  6 15:44 .
drwxrwxr-x 3 dam dam 4096 oct  6 15:44 ..
drwxrwxr-x 8 dam dam 4096 oct  6 15:44 .git
drwxrwxr-x 2 dam dam 4096 oct  6 15:44 img
drwxrwxr-x 2 dam dam 4096 oct  6 15:44 prueba2
-rw-rw-r-- 1 dam dam   66 oct  6 15:44 README.md
drwxrwxr-x 2 dam dam 4096 oct  6 15:44 test
```
</details>

</br>

## Ejercicio 1 <a name="ej1"></a>

Sigue los pasos

</br>

### Procedimiento 

- Muestro el historial de cambios del repositorio

- Creo la carpeta __capítulos__ y creo el fichero __capitulo1.txt__ dentro de ella, añadiendole un texto

- Añado los cambios a la __zona de intercambio temporal__

- Hago un __commit__ de los cambios con el mensaje _Añadido capítulo 1_

- Volver a mostrar el __historial de cambios__ del repositorio.

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git log
commit 5f063ee13632a7e956c3719c83466aa6b1891db7 (HEAD -> main)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:43:26 2023 +0100

    Añadido capítulo 3

commit 017de95b09ed6149999b349a8a786cd85c72d154
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:36:14 2023 +0100

    Añadido capítulo 2

commit 95cb474f77db69e86ce0b6eff8dd78d39680b487
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:33:25 2023 +0100

    Añadido capítulo 1

commit 19fc3df31a5a5c7249fdf454d972fe42350caf28
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:14:50 2023 +0100

    Añadido capítulo 1

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ mkdir capitulos
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ cd capitulos
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > capitulo1.txt

Git es un sistema de control de versiones ideado por Linus Torvalds.

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git log
commit d51680482fcdc04b1a25332ea76fd795147ba874 (HEAD -> main)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 17:53:50 2023 +0100

    Añadido capítulo 1

commit 5f063ee13632a7e956c3719c83466aa6b1891db7
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:43:26 2023 +0100

    Añadido capítulo 3

commit 017de95b09ed6149999b349a8a786cd85c72d154
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:36:14 2023 +0100

    Añadido capítulo 2

commit 95cb474f77db69e86ce0b6eff8dd78d39680b487
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:33:25 2023 +0100

    Añadido capítulo 1
```

</details>

</br>

## Ejercicio 2  <a name="ej2"></a>

Seguir las indicaciones

</br>

### Proceso

</br>

- Creo el archivo __capitulo2.txt__ en la carpeta _capítulos_ y le añado un texto

- Añado los cambios a la __zona de intercambio temporal__

- Hacer un __commit__ de los cambios con el mensaje _Añadido capítulo 2_

- Mostrar las diferencias entre la última versión y dos versiones anteriores

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > capitulo2.txt

El flujo de trabajo básico con Git consiste en:
1- Hacer cambios en el repositorio.
2- Añadir los cambios a la zona de intercambio temporal.
3- Hacer un commit de los cambios.

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git add .
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -m "Añadido capítulo 2"
[main 7a106ff] Añadido capítulo 2
 1 file changed, 4 insertions(+)
 create mode 100644 capitulos/capitulo2.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git diff HEAD~2..HEAD

diff --git a/capitulo1.txt b/capitulo1.txt
deleted file mode 100644
index 7431f9e..0000000
--- a/capitulo1.txt
+++ /dev/null
@@ -1 +0,0 @@
-Git es un sistema de control de versiones ideado por Linus Torvalds.
diff --git a/capitulos/capitulo2.txt b/capitulos/capitulo2.txt
index d0c9829..0070310 100644
--- a/capitulos/capitulo2.txt
+++ b/capitulos/capitulo2.txt
@@ -1 +1,4 @@
-El flujo de trabajo básico con Git consiste en: 1- Hacer cambios en el repositorio. 2- Añadir los cambios a la zona de intercambio temporal. 3- Hacer un commit de los cambios.
+El flujo de trabajo básico con Git consiste en:
+1- Hacer cambios en el repositorio.
+2- Añadir los cambios a la zona de intercambio temporal.
+3- Hacer un commit de los cambios.
diff --git a/capitulos/capitulo3.txt b/capitulos/capitulo3.txt
deleted file mode 100644
index 6e501ab..0000000
--- a/capitulos/capitulo3.txt
```
</details>

</br>

## Ejercicio 3 <a name="ej3"></a>

Seguir las indicaciones

</br>

### Proceso

- Creo el archivo _capitulo3.txt_ en la carpeta __capítulos__ y le añado el texto indicado.

- Añado los cambios a la __zona de intercambio temporal__

- Hago un __commit__ de los cambios con el mensaje _Añadido capítulo 3_

- Muestro las diferencias entre la primera y la última versión del repositorio

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > capitulo3.txt

Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git add .
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -m "Añadido capítulo 3"

[main 4f6b5a4] Añadido capítulo 3
 1 file changed, 1 insertion(+)
 create mode 100644 capitulos/capitulo3.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git log

commit 4f6b5a40fec73fd120b9d738a6d56f1dad93621e (HEAD -> main)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 18:00:01 2023 +0100

    Añadido capítulo 3

commit 7a106ffd77ec33414743c04bb6c7d59f53b02c63
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 17:56:35 2023 +0100

    Añadido capítulo 2

commit d51680482fcdc04b1a25332ea76fd795147ba874
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 17:53:50 2023 +0100

    Añadido capítulo 1

commit 5f063ee13632a7e956c3719c83466aa6b1891db7
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Fri Oct 6 16:43:26 2023 +0100

    Añadido capítulo 3

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git diff d51680482fcdc04b1a25332ea76fd795147ba874..HEAD

diff --git a/capitulos/capitulo2.txt b/capitulos/capitulo2.txt
new file mode 100644
index 0000000..0070310
--- /dev/null
+++ b/capitulos/capitulo2.txt
@@ -0,0 +1,4 @@
+El flujo de trabajo básico con Git consiste en:
+1- Hacer cambios en el repositorio.
+2- Añadir los cambios a la zona de intercambio temporal.
+3- Hacer un commit de los cambios.
diff --git a/capitulos/capitulo3.txt b/capitulos/capitulo3.txt
new file mode 100644
index 0000000..6e501ab
--- /dev/null
+++ b/capitulos/capitulo3.txt
@@ -0,0 +1 @@
+Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
```

</details>

</br>

## Ejercicio 4 <a name="ej4"></a>

Seguir las indicaciones

</br>

### Proceso

- Crea el fichero _índice.txt_ y añado el texto indicado

- Añadir los cambios a la __zona de intercambio temporal__

- Hacer un __commit__ de los cambios con el mensaje _Indice de los capitulos, con conceptos avanzados de git_

- Mostrar quién ha hecho __cambios__ sobre el fichero _indice.txt_

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > indice.txt

Indice de los cápitulos, con conceptos avanzados de git

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git add .
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -m "Indice de los capitulos, con conceptos avanzados de git"

[main 22ad584] Indice de los capitulos, con conceptos avanzados de git
 1 file changed, 1 insertion(+)
 create mode 100644 capitulos/indice.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git annotate indice.txt

22ad5846        (PeterMartEsc   2023-10-06 18:05:40 +0100       1)Indice de los cápitulos, con conceptos avanzados de git
```
</details>

</br>

## Ejercicio 5  <a name="ej5"></a>

Seguir las indicaciones 

</br>

### Procesos

- Creo una nueva __rama__ llamada _bibliografía_ 

- Muestro las ramas del __repositorio__

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git branch bibliografia
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git branch -av

  bibliografia        22ad584 Indice de los capitulos, con conceptos avanzados de git
* main                22ad584 [adelante 8] Indice de los capitulos, con conceptos avanzados de git
  remotes/origin/1    3ea9800 se crea la carpeta img #1
  remotes/origin/HEAD -> origin/main
  remotes/origin/main 1016a8a se añade la segunda carpeta
```
</details>

## Ejercicio 6  <a name="ej6"></a>

Seguir más indicaciones 

</br>

### Procesos

- Creo el fichero __capitulos/capitulo4.txt__ y añado el texto indicado.

- Añado los cambios a la __zona de intercambio temporal__

- Hacer un __commit__ con el mensaje _Añadido capítulo 4_

- Mostrar la __historia__ del repositorio incluyendo todas las __ramas__

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > capitulos/capitulo4.txt

bash: capitulos/capitulo4.txt: No existe el archivo o el directorio

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cd ..
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ cat > capitulos/capitulo4.txt

En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git add .
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git commit -m "Añadido capítulo 4"

[main 279626a] Añadido capítulo 4
 1 file changed, 1 insertion(+)
 create mode 100644 capitulos/capitulo4.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git log --graph --all --oneline

* 279626a (HEAD -> main) Añadido capítulo 4
* 22ad584 (bibliografia) Indice de los capitulos, con conceptos avanzados de git
* 4f6b5a4 Añadido capítulo 3
* 7a106ff Añadido capítulo 2
* d516804 Añadido capítulo 1
* 5f063ee Añadido capítulo 3
* 017de95 Añadido capítulo 2
* 95cb474 Añadido capítulo 1
* 19fc3df Añadido capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit
```
</details>

## Ejercicio 7  <a name="ej7"></a>

Seguir las indicaciones 

</br>

### Procesos

- Cambio a la rama _bibliografía_

- Creo el fichero _bibliografia.txt_ y agrego la referencia indicada

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git checkout bibliografia

Cambiado a rama 'bibliografia'

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ cat > bibliografia.txt

- Chacon, S. and Straub, B. Pro Git. Apress.

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git add .
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git commit -m "Añadida primera referencia bibliográfica"

[bibliografia 3f2b8bd] Añadida primera referencia bibliográfica
 1 file changed, 1 insertion(+)
 create mode 100644 bibliografia.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro$ git log --graph --all --oneline

* 3f2b8bd (HEAD -> bibliografia) Añadida primera referencia bibliográfica
| * 279626a (main) Añadido capítulo 4
|/  
* 22ad584 Indice de los capitulos, con conceptos avanzados de git
* 4f6b5a4 Añadido capítulo 3
* 7a106ff Añadido capítulo 2
* d516804 Añadido capítulo 1
* 5f063ee Añadido capítulo 3
* 017de95 Añadido capítulo 2
* 95cb474 Añadido capítulo 1
* 19fc3df Añadido capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit
```
</details>

</br>

## Ejercicio 8 <a name="ej8"></a>

Seguir las indicaciones

</br>

### Procesos

- Fusiono la rama _bibliografía_ con la __rama main__

- Muestro la historia del repositorio incluyendo todas las __ramas__

- Elimino la rama _bibliografía_

- Mostrar de nuevo la __historia del repositorio__ incluyendo todas las __ramas__

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git checkout main

A	bibliografia.txt

Ya en 'main'

Tu rama está adelantada a 'origin/main' por 9 commits.

  (usa "git push" para publicar tus commits locales)

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git merge bibliografia

Los cambios locales de los siguientes archivos serán sobreescritos por merge:

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git log --graph --all --onelineph --all --oneline

* 3f2b8bd (bibliografia) Añadida primera referencia bibliográfica
| * 279626a (HEAD -> main) Añadido capítulo 4
|/  
* 22ad584 Indice de los capitulos, con conceptos avanzados de git
* 4f6b5a4 Añadido capítulo 3
* 7a106ff Añadido capítulo 2
* d516804 Añadido capítulo 1
* 5f063ee Añadido capítulo 3
* 017de95 Añadido capítulo 2
* 95cb474 Añadido capítulo 1
* 19fc3df Añadido capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git branch -D bibliografia

Eliminada la rama bibliografia (era 3f2b8bd).

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git log --graph --all --oneline

* 279626a (HEAD -> main) Añadido capítulo 4
* 22ad584 Indice de los capitulos, con conceptos avanzados de git
* 4f6b5a4 Añadido capítulo 3
* 7a106ff Añadido capítulo 2
* d516804 Añadido capítulo 1
* 5f063ee Añadido capítulo 3
* 017de95 Añadido capítulo 2
* 95cb474 Añadido capítulo 1
* 19fc3df Añadido capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit
```
</details>

</br>

## Ejercicio 9

Seguir las indicaciones

</br>

### Procesos

- Crear la rama bibliografía

- Cambiar a la rama bibliografía

- Cambiar el fichero bibliografia.txt para que contenga las refereincias indicadas

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git branch bibliografia
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git checkout bibliografia
A	bibliografia.txt
Cambiado a rama 'bibliografia'
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > bibliografia.txt
- Scott Chacon and Ben Straub. Pro Git. Apress.
- Ryan Hodson. Ry's Git Tutorial. Smashwords (2014)
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -a -m "Añadida nueva referencia bibliográfica"
[bibliografia 5f66c24] Añadida nueva referencia bibliográfica
 1 file changed, 1 insertion(+)
 create mode 100644 bibliografia.txt
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git checkout main
Cambiado a rama 'main'
Tu rama está adelantada a 'origin/main' por 9 commits.
  (usa "git push" para publicar tus commits locales)
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ cat > bibliografia.txt
- Chacon, S. and Straub, B. Pro Git. Apress.
- Loeliger, J. and McCullough, M. Version control with Git. O'Reilly.
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -a -m "Añadida nueva referencia bibliográfica"
En la rama main
Tu rama está adelantada a 'origin/main' por 9 commits.
  (usa "git push" para publicar tus commits locales)

Archivos sin seguimiento:
  (usa "git add <archivo>..." para incluirlo a lo que se será confirmado)
	bibliografia.txt

no hay nada agregado al commit pero hay archivos sin seguimiento presentes (usa "git add" para hacerles seguimiento)
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git merge bibliografia
Actualizando 279626a..5f66c24
Fast-forward
 bibliografia.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 bibliografia.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -a -m "Solucionado conflicto bibliografía"
En la rama main
Tu rama está adelantada a 'origin/main' por 10 commits.
  (usa "git push" para publicar tus commits locales)

Archivos sin seguimiento:
  (usa "git add <archivo>..." para incluirlo a lo que se será confirmado)
	bibliografia.txt

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ nano bibliografia
dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git commit -a -m "Solucionado conflicto bibliografía"

En la rama main
Tu rama está adelantada a 'origin/main' por 10 commits.
  (usa "git push" para publicar tus commits locales)

Archivos sin seguimiento:
  (usa "git add <archivo>..." para incluirlo a lo que se será confirmado)
	bibliografia
	bibliografia.txt

no hay nada agregado al commit pero hay archivos sin seguimiento presentes (usa "git add" para hacerles seguimiento)

dam@a108pc04:~/PeterMartEsc/repositorio-profe-tarea2/libro/capitulos$ git log --graph --all --oneline

* 5f66c24 (HEAD -> main, bibliografia) Añadida nueva referencia bibliográfica
* 279626a Añadido capítulo 4
* 22ad584 Indice de los capitulos, con conceptos avanzados de git
* 4f6b5a4 Añadido capítulo 3
* 7a106ff Añadido capítulo 2
* d516804 Añadido capítulo 1
* 5f063ee Añadido capítulo 3
* 017de95 Añadido capítulo 2
* 95cb474 Añadido capítulo 1
* 19fc3df Añadido capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit
```
</details>

</div>