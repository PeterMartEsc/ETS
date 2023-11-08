<div aling="justify">

<div style="text-align: center; "> 

# Instalación de Maven en el SO

</div>

Hecho por: __Pedro Martín Escuela__

## Índice:

- Primer Paso: [Instalación de Maven Apache](#mvn)

- Segundo Paso: [Instalar una Versión Concreta](#apmvn)

</br>

# Instalación de Maven Apache <a name="mvn"></a>

```code
petermartesc-dam@petermartescdam-VirtualBox:~$  sudo apt update
Obj:1 http://security.ubuntu.com/ubuntu jammy-security InRelease
Des:2 http://packages.microsoft.com/repos/code stable InRelease [3.569 B]      
Obj:3 https://dl.google.com/linux/chrome/deb stable InRelease                  
Obj:4 http://archive.ubuntu.com/ubuntu jammy InRelease                         
Ign:5 http://packages.linuxmint.com victoria InRelease                         
Obj:6 http://archive.ubuntu.com/ubuntu jammy-updates InRelease
Obj:7 http://archive.ubuntu.com/ubuntu jammy-backports InRelease
Obj:8 http://packages.linuxmint.com victoria Release  
Descargados 3.569 B en 1s (4.512 B/s)
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
Se pueden actualizar 27 paquetes. Ejecute «apt list --upgradable» para verlos.
petermartesc-dam@petermartescdam-VirtualBox:~$  sudo apt install maven
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
maven ya está en su versión más reciente (3.6.3-5).
0 actualizados, 0 nuevos se instalarán, 0 para eliminar y 27 no actualizados.
petermartesc-dam@petermartescdam-VirtualBox:~$  mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: es_ES, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-87-generic", arch: "amd64", family: "unix"
```

# Instalar Versión Concreta <a name = "apmvn"></a>

```code
petermartesc-dam@petermartescdam-VirtualBox:~$ wget https://www.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz -P /tmp
--2023-10-30 16:07:55--  https://www.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
Resolviendo www.apache.org (www.apache.org)... 151.101.2.132, 2a04:4e42::644
Conectando con www.apache.org (www.apache.org)[151.101.2.132]:443... conectado.
Petición HTTP enviada, esperando respuesta... 302 Found
Ubicación: https://downloads.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz [siguiente]
--2023-10-30 16:07:55--  https://downloads.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
Resolviendo downloads.apache.org (downloads.apache.org)... 135.181.214.104, 88.99.95.219, 2a01:4f9:3a:2c57::2, ...
Conectando con downloads.apache.org (downloads.apache.org)[135.181.214.104]:443... conectado.
Petición HTTP enviada, esperando respuesta... 404 Not Found
2023-10-30 16:07:56 ERROR 404: Not Found.

petermartesc-dam@petermartescdam-VirtualBox:~$ sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt
tar: /tmp/apache-maven-*.tar.gz: No se puede efectuar open: No existe el archivo o el directorio
tar: Error is not recoverable: exiting now
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo ln -s /opt/apache-maven-3.8.6 /opt/maven
petermartesc-dam@petermartescdam-VirtualBox:~$ sudo nano /etc/profile.d/maven.sh
petermartesc-dam@petermartescdam-VirtualBox:~$  sudo chmod +x /etc/profile.d/maven.sh
petermartesc-dam@petermartescdam-VirtualBox:~$  source /etc/profile.d/maven.sh
petermartesc-dam@petermartescdam-VirtualBox:~$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: es_ES, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-87-generic", arch: "amd64", family: "unix"
```