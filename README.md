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
- ### Log Format
Menggunakan parameter saat melakukan logging biasanya akan membuat string concat untuk membuat pesan logging nya, namun SLF4j sudah menyediakan log format, menggunakan beberapa method overloading.

| Method | Keterangan                          |
|-------|:-----------------------------------:|
| level(String) | Melakukan logging berisi string |
| level(String, Object....) | Melakukan logging dengan parameter, gunakan {} sebagai parameter nya                               |
| level(String, Throwable)  | Melakukan logging dengan menambahkan stack trace error                               |
