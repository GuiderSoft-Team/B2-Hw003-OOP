# Homework 3 - Geometrik Şekiller

Bu proje için aşağıdaki sınıflar tasarlanacaktır.

1. Kare sınıfı
2. Daire sınıfı

## Kare Sınıfı

### Özellikler

1. kenar: int


### Metotlar

1. alanHesapla(): int--> kenar x kenar
2. cevreHesapla(): int--> 4 x kenar
3. kosegenUzunlugu():double--> kenar x Math.sqrt(2)


## Daire Sınıfı

### Özellikler

1. yaricap:int

### Metotlar

1. alanHesapla():double--> Math.PI x yaricap x yaricap
2. cevreHesapla():double--> 2 x Math.PI x yaricap


## Yapılacaklar

1. Her iki sınıf için 1 parametreli Constructor metodu oluşturulacaktır.
   Constructor Metot:
   a. public olmalı
   b. Dönüş tipi olmamalı
   c. Sınıfın ismiyle aynı olmalı
   d. parametresi atama yapılacak üye değişken ile aynı isim ve tipte olmalı
2. Her iki sınıftan birer adet nesne oluşturunuz.
   a. Karenin kenar uzunluğu da, dairenin yarıçap uzunlu da 7 olmalı
3. Her iki nesnenin alanlarının ve çevre uzunluklarının farklarının mutlak değerini "Math.abs()" ekrana yazdıran Java programı yazınız.

