<div aling="justify">

<div style="text-align: center; "> 

# Manipulación Básica en Git

</div>

</br>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Paso 1: [Configuración](#paso1)
- Paso 2: [Creación de un repositorio](#paso2)
- Paso 3. [Comprobar el estado del repositorio](#paso3)
- Paso 4: [Realizando Commits](#paso4)
- Paso 5: [Historial](#paso5)

</br>

## Tarea: Configuración <a name="paso1"></a>

Configurar Git definiendo el nombre del usuario, el correo electrónico y activar el coloreado de la salida. Mostrar la configuración final.

</br>

### Mi terminal:

</br>

```code
Este paso no era necesario hacerlo, ya que lo realizamos al principio del curso
```
</br>

## Tarea: Creación de un repositorio <a name="paso2"></a>

Crear un repositorio nuevo con el nombre dpl y mostrar su contenido.

</br>

### Proceso

</br>

- Primero usé el comando de ls que lista el contenido del directorio actual. 

- Luego usé el comando mkdir dpl que crea un directorio llamado "dpl" en el directorio actual

- El comando cd dpl es para entrar en el directorio llamado "dpl"

- El comando de git init es para iniciar github en la carpeta

- Finalmente usé ls -la que lista el contenido del directorio de forma detallada

</br>

### Mi terminal:

</br>

```code
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1$ ls

Practica-clase-terminal-linux  README.md  Tareas

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1$ mkdir dpl
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1$ cd dpl
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git init

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
Inicializado repositorio Git vacío en /home/dam/PeterMartEsc/ETS/Unidad-1/dpl/.git/

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ ls -la

total 12
drwxrwxr-x 3 dam dam 4096 oct  4 15:03 .
drwxrwxr-x 5 dam dam 4096 oct  4 15:03 ..
drwxrwxr-x 7 dam dam 4096 oct  4 15:03 .git
```

</br>

## Tarea: Comprobar el estado del repositorio <a name="paso3"></a>

</br>

### Proceso

- El comando git status es para comprobar el estado de los commit 

- El comando cat > indice.txt crea un documento llamado "indice.txt" y te permite añadir texto por la terminal. A continuación pongo el texto.

- Compruebo de nuevo el estatus con git status

- Finalmente hago git add indice.txt para añadir el archivo así llamado y desppués de esto compruebo el estado.

</br>

### Mi terminal:

</br>

```code
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git status
En la rama master

No hay commits todavía

no hay nada para confirmar (crea/copia archivos y usa "git add" para hacerles seguimiento)

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ cat > indice.txt

Capítulo 1: Instalación de Git por el alumno Pedro Martín Escuela
Capítulo 2: Flujo de trabajo básico      

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git status

En la rama master

No hay commits todavía

Archivos sin seguimiento:
  (usa "git add <archivo>..." para incluirlo a lo que se será confirmado)
	indice.txt

no hay nada agregado al commit pero hay archivos sin seguimiento presentes (usa "git add" para hacerles seguimiento)

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git add indice.txt
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git status

En la rama master

No hay commits todavía

Cambios a ser confirmados:
  (usa "git rm --cached <archivo>..." para sacar del área de stage)
	nuevos archivos: indice.txt
```

</br>

## Tarea: Realizando Commits <a name="paso4"></a>

Realizar un commit de los últimos cambios con el mensaje Añadido índice de la asignatura DPL. y ver el estado del repositorio.

</br>

### Proceso

- Comento los cambios hechos y compruebo el estatus de nuevo

</br>

### Mi terminal:

</br>

``` code
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git commit -m "Añadido índice de la asignatura DPL."

[master (commit-raíz) 7d114f9] Añadido índice de la asignatura DPL.
 1 file changed, 2 insertions(+)
 create mode 100644 indice.txt

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git status

En la rama master
nada para hacer commit, el árbol de trabajo está limpio
```
</br>

## Tarea: Modificación de ficheros

</br>

### Procesos

- Cambio el texto y añado más

- Compruebo las diferencias de antes y después

- Compruebo de nuevo los cambios

</br>

### Mi terminal:

</br>

```code
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ cat > indice.txt

Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
Capítulo 2: Flujo de trabajo básico
Capítulo 3: Gestión de ramas
Capítulo 4: Repositorios remotos

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git diff

diff --git a/indice.txt b/indice.txt
index d4e5bff..c668696 100644
--- a/indice.txt
+++ b/indice.txt
@@ -1,2 +1,4 @@
-Capítulo 1: Instalación de Git por el alumno XXX
+Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
 Capítulo 2: Flujo de trabajo básico
+Capítulo 3: Gestión de ramas
+Capítulo 4: Repositorios remotos

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git add indice.txt
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git commit -m "Añadido los capitulos 3 y 4"

[master dd77232] Añadido los capitulos 3 y 4
 1 file changed, 3 insertions(+), 1 deletion(-)

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git show

commit dd772329ae8cd7cdf3ccfe49939ae985ffa04f52 (HEAD -> master)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 4 15:09:05 2023 +0100

    Añadido los capitulos 3 y 4

diff --git a/indice.txt b/indice.txt
index d4e5bff..c668696 100644
--- a/indice.txt
+++ b/indice.txt
@@ -1,2 +1,4 @@
-Capítulo 1: Instalación de Git por el alumno XXX
+Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
 Capítulo 2: Flujo de trabajo básico
+Capítulo 3: Gestión de ramas
+Capítulo 4: Repositorios remotos
```

</br>

## Tarea: Historial <a name="paso5"></a>

</br>

### Procesos

- Primero compruebo los cambios

- Luego cambio el nombre con el que están guardados los cambios

- Acabo revisando el estado del archivo después de renombrarlo


</br>

### Mi terminal:

</br>

```code
dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git show

commit dd772329ae8cd7cdf3ccfe49939ae985ffa04f52 (HEAD -> master)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 4 15:09:05 2023 +0100

    Añadido los capitulos 3 y 4

diff --git a/indice.txt b/indice.txt
index d4e5bff..c668696 100644
--- a/indice.txt
+++ b/indice.txt
@@ -1,2 +1,4 @@
-Capítulo 1: Instalación de Git por el alumno XXX
+Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
 Capítulo 2: Flujo de trabajo básico
+Capítulo 3: Gestión de ramas
+Capítulo 4: Repositorios remotos

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git commit --amend -m  "Añadido el capitulo sobre gestión de ramas al índice."

[master 94e97ef] Añadido el capitulo sobre gestión de ramas al índice.
 Date: Wed Oct 4 15:09:05 2023 +0100
 1 file changed, 3 insertions(+), 1 deletion(-)

dam@a108pc04:~/PeterMartEsc/ETS/Unidad-1/dpl$ git show

commit 94e97ef382121a1e1d19adcd44c84aa9d13a2d43 (HEAD -> master)
Author: PeterMartEsc <petermartesc@gmail.com>
Date:   Wed Oct 4 15:09:05 2023 +0100

    Añadido el capitulo sobre gestión de ramas al índice.

diff --git a/indice.txt b/indice.txt
index d4e5bff..c668696 100644
--- a/indice.txt
+++ b/indice.txt
@@ -1,2 +1,4 @@
-Capítulo 1: Instalación de Git por el alumno XXX
+Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
 Capítulo 2: Flujo de trabajo básico
+Capítulo 3: Gestión de ramas
+Capítulo 4: Repositorios remotos
```
</div>