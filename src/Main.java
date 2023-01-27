import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*int number = 13;
        int counter = 0;

        for (int i=2 ; i<number ; i++){
            int remainder = number % i;
            if((remainder==0)){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("asal");
        }
        else {
            System.out.println("asal değil");
        }*/

        int number =3;
        boolean isPrime = true;

        if(number<2){
            System.out.println("geçersiz sayı");
            return;
        }
        if (number==2){
            System.out.println("en küçük asal sayi");
            return;
        }

        for(int i=2 ; i<number ; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("asal");
        }
        else{
            System.out.println("asal değil");
        }

}}