# Java Logging Framework Library
- [Simple Logging Facade for Java (SLF4J)](http://www.slf4j.org/)
- [Logback Project](http://logback.qos.ch)

- ##  Logger
Logger adalah class utama untuk melakukan logging, pada saat membuat Logger biasanya akan menyebutkan nama Logger nya, nama logger menggunakan nama class lokasi Logger tersebut, hal ini agar mudah ketika melihat hasil log dari mana hasil log tersebut
http://www.slf4j.org/apidocs/org/slf4j/Logger.html

untuk membuat Logger, tidak perlu membuat object manual menggunakan new, bisa memanfaatkan factory class LogerFactory
http://www.slf4j.org/apidocs/org/slf4j/LoggerFactory.html

- ## Level
Log memiliki banyak level, Level merupakan jenis informasi log, Level itu bertingkat. Semakin tinggi artinya informasi semakin penting, Level juga bisa disesuaikan dengan jenis error. Setiap level memiliki method di logger, sehingga bisa digunakan langsung levelnya di method.

- ### Tingkatan Level (Rendah ke Tinggi)
| Level | Keterangan                          |
|-------|:-----------------------------------:|
| trace | Untuk menambahkan informasi tracing |
| debug | Untuk menambahkan informasi debug                               |
| info  | Untuk menambahkan informasi                               |
| warn  | Untuk menambahkan peringatan                               |
| error | Untuk menambahkan error                               |
- ## Log Format
Menggunakan parameter saat melakukan logging biasanya akan membuat string concat untuk membuat pesan logging nya, namun SLF4j sudah menyediakan log format, menggunakan beberapa method overloading.

| Method | Keterangan                          |
|-------|:-----------------------------------:|
| level(String) | Melakukan logging berisi string |
| level(String, Object....) | Melakukan logging dengan parameter, gunakan {} sebagai parameter nya                               |
| level(String, Throwable)  | Melakukan logging dengan menambahkan stack trace error                               |

- ## Configuration
Secara default, menggunakan logback tidak dibutuhkan configuration. Namun kadang-kadang ingin menggunakan configuration, misalnya di laptop ingin menjalankan logging sampai ke level trace, namun ketika di production hanya membutuhkan di level warning agar tidak terlalu banyak log. Hal tersebut, perlu dilakukan dengan membuat file configuration. 
- logback.xml Logback akan membaca konfigurasi dari file ini yang terdapat di default package, artinya hanya butuh membuat file logback.xml pada default package.
- Level Configuration, secara default saat membuat file konfigurasi, logback akan membaca level yang harus dikeluarkan dari file logback. Jika tidak ada, maka otomatis tidak akan keluar. Oleh karena itu, hal pertama yang perlu dilakukan adalah, menambahkan logger level, untuk memberitahu level mana yang ingin dikeluarkan di log file.
http://logback.qos.ch/manual/configuration.html
- Logger Package, terkadang ingin membuat logging level berbeda-beda untuk package, misalnya untuk package framework, ingin digunakan warn, tapi untuk package aplikasi kita ingin gunakan info. Secara default, sebelumnya sudah dibuat root, root adalah default fallback semua package level ketika tidak dibutuhkan konfigurasi secara spesifik. Namun jika ingin juga bisa membuat logger level lebih dari satu, tinggal gunakan prefix package nya saja. Artinya semua package di dalamnya akan ikut ke logger level tersebut.

## Appender
Saat melakukan logging, bisa menentukan destinasi log file yang akan dibuat, atau dinamakan Appender. Logback sudah menyediakan banyak sekali appender, jadi sebenarnya tidak perlu membuat appender secara manual.
http://logback.qos.ch/manual/appenders.html
- Console Appender, Appender yang paling sederhana adalah Console. Dimana appender ini hanya meneruskan log event yang di kirim menggunakan logger ke dalam console atau System.out.
ConsoleAppender sangat cocok ketika applikasi yang dibuat dibungkus dalam docker atau kubernetes misalnya, karena cukup menampilkan di console dan secara automatis log bisa diambil oleh docker dan kubernetes.
- File Appender, merupakan appender yang mengirim log event ke file, sangat cocok ketika masih menggunakan VM untuk deploy aplikasi, jadi semua log event akan disimpan di file.
- RollingFileAppender
Terkadang saat menyimpan semua log event di file, lama-lama file tersebut akan terlalu besar. Logback menyediakan RollingFileAppender, yaitu appender yang menyimpan data nya di file, namun bisa dilakukan rolling, artinya per waktu tertentu akan dibuatkan file baru. Selain itu bisa juga set maksimal ukuran file nya sehingga ketika sudah mencapai batas maksimal, akan dibuatkan file baru lagi. Ini lebih direkomendasikan untuk digunakan dibandingkan menggunakan FileAppender.

- ## Layout
Layout adalah 
