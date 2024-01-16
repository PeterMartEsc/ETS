<div aling="justify">

<div style="text-align: center; "> 

# Instalación del IDE IntelliJ IDEA

</div>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Pasos Previos: [Prerrequisitos](#pre)

- Instalación: [Instalación Inteliji](#inst)

</br>

# Prerrequisitos <a name = "pre"></a>

```code
petermartesc-dam@petermartescdam-VirtualBox:~$ java -version
openjdk version "11.0.20.1" 2023-08-24
OpenJDK Runtime Environment (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
```

# Instalación Inteliji <a name = "inst"></a>

__Anotación:__ el comando especificado no me funcionaba por lo que utilicé los siguientes.

```code
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo snap install intellij-idea-community --classic
sudo: snap: orden no encontrada

petermartesc-dam@petermartescdam-VirtualBox:~$ cd Descargas
petermartesc-dam@petermartescdam-VirtualBox:~/Descargas$ ls
ideaIC-2023.2.4.tar.gz
petermartesc-dam@petermartescdam-VirtualBox:~/Descargas$ sudo tar -xzf ideaIC-2023.2.4.tar.gz -C /opt

petermartesc-dam@petermartescdam-VirtualBox:~/Descargas$ cd /opt
petermartesc-dam@petermartescdam-VirtualBox:/opt$ ls
google  idea-IC-232.10203.10  maven  VBoxGuestAdditions-6.1.38
petermartesc-dam@petermartescdam-VirtualBox:/opt$ cd /opt/idea-IC-232.10203.10

petermartesc-dam@petermartescdam-VirtualBox:/opt/idea-IC-232.10203.10$ ls
bin        Install-Linux-tar.txt  lib      LICENSE.txt  plugins
build.txt  jbr                    license  NOTICE.txt   product-info.json

petermartesc-dam@petermartescdam-VirtualBox:/opt/idea-IC-232.10203.10$ cd bin

petermartesc-dam@petermartescdam-VirtualBox:/opt/idea-IC-232.10203.10/bin$ ./idea.sh

CompileCommand: exclude com/intellij/openapi/vfs/impl/FilePartNodeRoot.trieDescend bool exclude = true
oct 31, 2023 3:06:33 P. M. java.util.prefs.FileSystemPreferences$1 run
INFORMACIÓN: Created user preferences directory.
2023-10-31 15:06:44,202 [  10459]   WARN - #c.i.c.ComponentStoreImpl - Duplicated scheme Light - old: Light, new Light
2023-10-31 15:06:44,222 [  10479]   WARN - java.util.prefs - Prefs file removed in background /home/petermartesc-dam/.java/.userPrefs/prefs.xml
```
