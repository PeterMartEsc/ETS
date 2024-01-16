<div aling="justify">

<div style="text-align: center; "> 

# Realizar la Instalación de Java en el SO

</div>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Primer Paso: [Como Instalar Java](#java)

- Segundo Paso: [Configurar Java](#config)

# Como Instalar Java <a name = "java"></a>

```code
petermartesc-dam@petermartescdam-VirtualBox:~$   sudo apt-get update
[sudo] contraseña para petermartesc-dam:             
Obj:1 http://archive.ubuntu.com/ubuntu jammy InRelease
Obj:2 http://packages.microsoft.com/repos/code stable InRelease                
Obj:3 http://archive.ubuntu.com/ubuntu jammy-updates InRelease                 
Obj:4 https://dl.google.com/linux/chrome/deb stable InRelease                  
Obj:5 http://archive.ubuntu.com/ubuntu jammy-backports InRelease               
Ign:6 http://packages.linuxmint.com victoria InRelease                         
Obj:7 http://security.ubuntu.com/ubuntu jammy-security InRelease
Obj:8 http://packages.linuxmint.com victoria Release
Leyendo lista de paquetes... Hecho
petermartesc-dam@petermartescdam-VirtualBox:~$   sudo apt-get install default-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
default-jdk ya está en su versión más reciente (2:1.11-72build2).
0 actualizados, 0 nuevos se instalarán, 0 para eliminar y 27 no actualizados.
petermartesc-dam@petermartescdam-VirtualBox:~$   java --version
Unrecognized option: --version
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
petermartesc-dam@petermartescdam-VirtualBox:~$ java --version
Unrecognized option: --version
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo apt install openjdk-11-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
openjdk-11-jdk ya está en su versión más reciente (11.0.20.1+1-0ubuntu1~22.04).
0 actualizados, 0 nuevos se instalarán, 0 para eliminar y 27 no actualizados.
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo apt install openjdk-13-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
E: No se ha podido localizar el paquete openjdk-13-jdk
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo apt install openjdk-8-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
openjdk-8-jdk ya está en su versión más reciente (8u382-ga-1~22.04.1).
0 actualizados, 0 nuevos se instalarán, 0 para eliminar y 27 no actualizados.
petermartesc-dam@petermartescdam-VirtualBox:~$   java --version
Unrecognized option: --version
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
petermartesc-dam@petermartescdam-VirtualBox:~$ java -version
openjdk version "1.8.0_382"
OpenJDK Runtime Environment (build 1.8.0_382-8u382-ga-1~22.04.1-b05)
OpenJDK 64-Bit Server VM (build 25.382-b05, mixed mode)
```
</br>

# Configuración de Java

```code
petermartesc-dam@petermartescdam-VirtualBox:~$  ls /usr/lib/jvm
default-java               java-11-openjdk-amd64     java-8-openjdk-amd64
java-1.11.0-openjdk-amd64  java-1.8.0-openjdk-amd64  openjdk-11
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo update-alternatives --config java
Existen 2 opciones para la alternativa java (que provee /usr/bin/java).

  Selección   Ruta                                            Prioridad  Estado
------------------------------------------------------------
  0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      modo automático
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      modo manual
* 2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      modo manual

Pulse <Intro> para mantener el valor por omisión [*] o pulse un número de selección: 2
```