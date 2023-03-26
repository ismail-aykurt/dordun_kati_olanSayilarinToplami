import java.util.Scanner;

public class harmonikBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number,toplam=0;
        double value=0;
        System.out.print("sayı giriniz:");
        number=input.nextInt();
        for(int i=1;i<=number;i++) {
            value+=(1.0/i);//burda dikkat edilmesi gereken int/int=int bir değer döndürür ancak bir değeri double olarak tanımlarsak double değer döner



        }
        System.out.println("Girilen sayının harmonik değeri="+value);

    }
}
