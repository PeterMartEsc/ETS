<div aling="justify">

<div style="text-align: center; "> 

# Manipulación Avanzada en Git (Trabajo con Tags y Ramas)

</div>

</br>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Pasos Previos:     [Creación del repositorio](#crep)

- Ejercicio Inicial: [Ignorar Archivos](#igar)

- Ejercicio 1:       [Comandos 1](#com1)

- Ejercicio 2:       [Comandos 2](#com2)

- Ejercicio 4:       [Merge](#merg)

- Ejercicio 5:       [Listar Cambios](#listcam)

</br>

## Creación del Repositorio <a name="crep"></a>

</br>

Crear un repositorio en vuestro GitHub llamado my-proyecto-millonario.

</br>

#### Procedimiento

</br>

- Cree el repositorio desde git hub y el resto de pasos con el README.md no fueron necesarios ya que creé el archivo junto al repositorio

- Traje el repositorio a local con __git clone < enlace del repositorio >__

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
dam@a108pc04:~/PeterMartEsc$ git clone https://github.com/PeterMartEsc/my-proyecto-millonario.git

Clonando en 'my-proyecto-millonario'...
Username for 'https://github.com': PeterMartEsc
Password for 'https://PeterMartEsc@github.com': 
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Recibiendo objetos: 100% (3/3), listo.
 
dam@a108pc04:~/PeterMartEsc$ ls

BASE_DE_DATOS  FOL                 MaquinaVirtualCopSegur  PROGRAMACION
ETS            LENGUAJE_DE_MARCAS  my-proyecto-millonario

dam@a108pc04:~/PeterMartEsc$ cd my-proyecto-millonario
dam@a108pc04:~/PeterMartEsc/my-proyecto-millonario$ ls

README.md
```
</details>

</br>

## Ignorar Archivos <a name="igar"></a>

</br>

#### Procedimiento 

- Creo en el repositorio local un fichero llamado privado.txt 

- Creo en el repositorio local una carpeta llamada privada

- Le digo a git por comandos que ignore la carpeta y fichero creados

</br>

<details>

  <summary> Contenido de mi terminal: </summary>

  </br>

```code
```
</details>

</br>

## Comandos 1 

</br>

### Añadir fichero 1.txt

</br>

### Crear el tag v0.1

</br>

### Subir el tag v0.1

</br>

## Comandos 2 

</br>

### Crear una rama v0.2

</br>