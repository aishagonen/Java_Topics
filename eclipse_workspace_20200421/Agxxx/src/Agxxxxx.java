
public class Agxxxxx {

	
/*  	NOTS:
  
  
  
  
  
  
  
  
  
  
  
  
  
  - import java.util.*;  butun classlari calistirir.
 	
  - kb.close(); :Scanner'i kapatir. Yaninda yana sari uyari gider. kodlarin sonuna koymak guvenlik icin iyi. 
		
  - System.err.println(); --> means 'error' and print out red which means error. sometimes we create a program and result will be error, so use it. 		

/************************
		
	boolean:		
		true || true = true
		true || false = true
		false || false = false
		true && true = true
		true && false = false
		false && false = false
		
/***********************
 
		int num1;
		int num2;
		int num3;
		
		System.out.println("Number 1: ");
		num1 = kb.nextInt();
		
		System.out.println("Number 2: ");
		num2 = kb.nextInt();
		
		System.out.println("Number 3: ");
		num3 = kb.nextInt();
		
		System.out.println("Average of 3 numbers is: "+ (num1+num2+num3)/3);

/* *************************************************************	
		
	For	Comments:
	 1. use "//"
	 2. use "/*" and Enter.
			/*
			 * 		
			 */
// 	 3. use "/**" and Enter. You can write author name or parameter comments etc. 
			/**
			 * 
			 */	

/************* 
 Semboller:		
		
		 \n  :bir sonraki satira geciyor. yoksa bitisik yazar.
		 \" \" : 'quotation mark'. stringin icinde double quote icinde bi sey yazamak istersen tirnak isretini boyle ekliyorsun.
		 \t  : bu stringin icinde tab yapar.
		 \\  : backslash
		
		 %f  :noktadan sonraki kismi yazar.'%.2f' noktadan sonraki iki basamagi yazar, etc.
		'-'  :olmazasa bosluk bastan birakilir.		
		 =  :means change the values, yani illa esittir demek degil. 		
		==  :means 'equal'.
		!=  :means 'not equal'.
		||  :means 'or'.
		&&  :means 'and'.
		%   :shows 'remain number'. (11 % 3) yazsan 2 yazar sonuc olarak.
		  
		sum = sayilarin toplami
		product = sayilarin carpimi
		
/************* 
 		Relational Operators:
		==
		>
		<
		>=	
		<=
		!
		!=

/*************
		double quotes: \" ..... \"
		System.out.println("this is \"quotes.\"");
	 
		backslash:  \\ 		
		System.out.println("this is backslash \\");	
	  
		tab:  \t
	  	System.out.println("this is a tab \t !");			

/************
		double a = 10 / 3.0;
		
		System.out.printf("%f\n", a);			    // '\n' kodun alt satira gecmesini saglar.yan yana yazmaz. '%f' sayiyi 'float' yani kusuratli yazar.
		
		System.out.printf("$$$ %-11.2f###\n", a);	// buradaki '-' boslugu sagdan birakir yani sola dayali yazar.
			
		System.out.printf("$$$%-11.2f###\n", a);	// sola dayali 11 karakter tutulur ve noktadan sonra sayinin sadece 2 karakter gosterir.	
		
		System.out.printf("$$$%-11.2f###\n", 122.22);
		
		System.out.printf("###%13s###\n", "Aisha G.");	// '%s' yazmalisin cunku Aisha G. is a string. saga dayali 13 karakteri tutarak stringi yazar. 
			
		System.out.printf("$$$%-11.d###\n", 12222); 	// sayi eger tam sayiysa 'f' yerine 'd' yazmalisin. 
		
		System.out.printf("$$$%11d###\n", 12222);
				
/**************************************************************		
		
		 a++ means add one to a.1'er 1'er arttir.
		 a+=2 means 2'ser 2'ser ekle. yani 0'dan baslayip cift sayilari gosterir.
		 a+=3
		 a-- means 1'er 1'er eksilt.
		 a-= means 2'ser 2'ser eksilt.
		 a = a+10 means 10'ar 10'ar arttirir. ama esitlikli yazman lazim.
		 a = a+10 ifadesi a+=10  aynidir. 
			
/**************************************************************

		Data Types:
	
	   boolean > 1 byte >> returns true or false.
		byte   > 1 byte  --> "byte" is between "-127 and 128". if you will give a value more than these numbers so don't use byte!
		short  > 2 bytes
		char   > 2 bytes >> sadece bir 
		int    > 4 bytes > integer
		float  > 4 bytes >> (float)12.45 or 12.45f olarak yazman lazim. use "f" end of the variable. float for small decimal numbers.
		long   > 8 bytes  >> use "l or L" end of the variable.
		double > 8 bytes >> d, but you don't  have to use. double for big decimal numbers.
		
	  * String > is not a data type. it is a class. non-primitive.

		"boolean" is mostly for "if()" statements.
		
/**************************************************************		
		
		char c1 = 'a';
		char c2 = '2';
		System.out.println(c1+c2);
		
		Every character in Java has a numeric value which is called ASCII code (value).

/**************************************************************	
	You can learn which number you can use or not for data types. Like:
		
		byte largestValue = Byte.MAX_VALUE;
		byte minValue = Byte.MIN_VALUE;
		
		System.out.println(largestValue); // outprint shows: 127. 
		System.out.println(minValue);  // outprint shows: 128. 
		
		short largestShort = Short.MAX_VALUE;
		System.out.println(largestShort);   // outprint shows: 32767.
		etc.
		
 /**************************************************************		
				
		Math class:
				
		int min = Math.min(34, 68);
		System.out.println(min);
		
		int max = Math.max(34, 68);
		System.out.println(max);
		
		float roundDown= Math.round(23.455);
		System.out.println(roundDown);
		
		float roundUp= Math.round(23.555);
		System.out.println(roundUp);
		
		double random= Math.random() *100D;
		System.out.println(random);
		
		double floor= Math.floor(7.501);
		System.out.println(floor);
				
		
/**************************************************************
		
 		Exponents:  
		
		int a = 2;
		System.out.println(Math.pow(a, 3)); // Math.pow(sayi, ussu olan sayi)
		System.out.println(Math.pow(2.3, 3.9));
		System.out.println((int)(Math.pow(a, 3))); // Eger noktali sayi istemiyorsan (int) ekle.
		
		double exponent = Math.pow(2, 3);
		System.out.println(exponent);
		
		int exponent = (int) Math.pow(2, 3);
		System.out.println(exponent);
				
 /**************************************************************		
		
		 Widening Casting:
		
		short age = 23;
		double myDouble = age;
		
		System.out.println(myDouble);  //sonucu double cinsinden gosterir.
		System.out.println(age);	  // sonucu short cinsinden gosterir. 
		
		System.out.println(myDouble+age);
		// double > short. ikisiyle islem yapsan double cinsinden gosterir.
		
/******************
 
		int n1=4;
		int n2=5;
		System.out.println((double)n1/n2); // sonucu double istiyorsan '(double)' yazmalisin.
		int sum = n1+n2;
		System.out.println(sum/2);
		double sum1=n1+n2;
		System.out.println(sum1/2);
		
		// Narrowing Castig:
		
		double k = 20.9;
		int ad = (int) 20.9;
		System.out.println(k);
		System.out.println(ad);
		
		System.out.println(k+ad);
		//double > int. ikisiyle islem yapsan double cinsinden gosterir.
		

 /**************************************************************		
	
		Increment and Decrement:   
		
		int i = 1;   
		int b = i++;    // post increment. java always read first value.
		System.out.println(i); // =2
		System.out.println(b); // =1 		burda once yazziyor, sonra arttiriyor. 
						arttirdiktan sonra islem yapmadigimiz icin goremiyoruz ama devam edersek 1 arttirmis bir b ile devam ederiz 
		int c = 1;
		int g = ++c;	// pre increment. once arttiriyor sonra yaziyor, 
		System.out.println(c); //=1
		System.out.println(g); //=2

		int f = 2;   
		int h = f--;    // post decrement.
		System.out.println(f); //=2
		System.out.println(h); //=2
		
		int y = 2;   
		int z = --y;    // pre decrement. java always read first value.
		System.out.println(y); //=2
		System.out.println(z); //=1

 /***************************************************************
		
		Shorthand: 
		int f=7; // 7+6
		f+=6;
		System.out.println(f);
		
		f*=6; 
		System.out.println(f); //7*6
		

 
*/		
		
}	