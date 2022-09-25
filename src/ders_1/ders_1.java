package ders_1;

public class ders_1 {

	public static void main(String[] args) {
	
	//COMMENT LINE
		System.out.println("hello Java");//ctrl+space tuşuyla yazabilceğimiz fonksiyonlar çıkar
	
		
	//CREATING VARIABLES
		
	/*type variableName = value;
    değişken adlandırmada camelCase yazım kullanılır
    adlandırma harfle başlamalı ve boşluk içermemeli
    */
	
	int myNum=12;
	int sayi;
	sayi=45;
	//type: int,String,char,boolean,float,double
	//String ifadeler "" içinde cahr ifadeler '' içinde gösterilir
	String myCar="doblo";
	char myChar='A';
	//final variables-->mevcut değişkenin değeri değştirilemez 
	
	int num=10;
	num=5;
	System.out.println(num);
	/*final int num=78;
	num=56; */
	
	String name="fatma";
	System.out.println("benim adım "+name);
	
	//TYPE CASTING
	
	int myİnt=3;
	double myDouble=myİnt;
	System.out.println(myİnt);      
	System.out.println(myDouble);
	
	
	
	
	double dolarDun=18.5;
    double dolarBugun=15.6;
 String okYonu="";//değeri duruma göre belirlenir empty
 if (dolarBugun>dolarDun) {
	okYonu="up.svg";
	System.out.println(okYonu);
	
	}else if(dolarBugun<dolarDun) {
		okYonu="down.svg";
		System.out.println(okYonu);
	}
 
 else {
	 okYonu="equal.svg";
		System.out.println(okYonu);
		
	} 

/*array:birden çok veri için ayrı ayrı değişken 
 * tanımlamak yerine bu verileri bir diziye atarız */
	
 String[] krediler= {"hızlı kredi","maaşın halkbanktan","mutlu emekli"};
	
	/*manuel olarak yazdığımız bu veriler gerçek bir projede bu veriler data based den gelir*/
	System.out.println(krediler[0]);
	System.out.println(krediler[1]);
	System.out.println(krediler[2]);
	
	/*gerçek bir projede karşımıza çıkan onlarca veriden arama yaptığımızda cıkan verileri 
    manuel olarak yazmayız yukarıdaki gibi dinamik sistemler ile yaparız yani döngüler ile */
	
	//for bir şeyi bir şarta göre tekrarla
	
	for (int i = 0; i < krediler.length; i++) {
	//lenght uygulandığında kredilerin uzunluğu demek(kaç elemandan olusuyor)
		System.out.println(krediler[i]);
	}
	
	}

}
