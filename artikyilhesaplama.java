import java.util.Scanner;

public class artikyilhesaplama {
    public static void main(String[] args) {
       // değişkenleri tanımlayalım
       int year;
       
       // import sınıfını tanımlayalım
       Scanner inp = new Scanner(System.in);

       //kullanıcıdan input alalım
       System.out.println("Yıl Giriniz !");
       year = inp.nextInt();

       //hesaplamaları yapalım
       if(year%100 == 0){
           if(year%400 == 0){
               System.out.println(year + " Artık Yıldır !");
           }else{
               System.out.println(year + " Artık Yıl Değildir !");
           }
       }else{
           if(year%4==0){
               System.out.println(year + " Artık Yıldır !");
           }else{
               System.out.println(year + " Artık Yıl Değildir !");
           }
       }


    }
    
}
