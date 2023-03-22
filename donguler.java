//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

//www.patika.dev
import java.util.Scanner;

public class donguler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,total=0;
        do {
            System.out.print("sayı giriniz:");
            number=input.nextInt();
            if(number%2==1) {
                System.out.println("tek sayı girdiniz program burada sona ermiştir.");
                break;


            }else{
                if(number%2==0 && number%4==0) {
                    total+=number;

                }
            }

        }while(number>0);


        System.out.println("girilen sayılardan çift ve dördün katı  olan sayıların toplamı="+total+"dir");

    }

}
