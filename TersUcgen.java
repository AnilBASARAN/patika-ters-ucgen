import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        String str1, str2;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz.   ");
        number = input.nextInt();

// düz üçgenin aksine i değerini kullanıcıdan aldığımız değer yapıp sayacı 1 er eksilterek terse çeviriyoruz.

        for(int i = number; i >= 1;i--){

            str1 = "";
            int temp1 = number-i;
            while (temp1>0){
                str1 += " ";
                temp1--;
            }

            str2 = "";
            int temp2 = 2*i-1;
            while (temp2>0){
                str2 += "*";
                temp2--;
            }
            System.out.println(str1+str2);
        }

    }
}