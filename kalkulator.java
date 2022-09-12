import java.util.*;

public class kalkulator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        int num1, num2, operator, penjumlahan, pengurangan, pembagian, perkalian;

        System.out.println("Kalkulator Sederhana \n");
        System.out.println("Kode operator aritmatika:");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");

        
        System.out.println("Masukkan bilangan pertama: ");
        num1 = sc.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        num2 = sc.nextInt();

        System.out.println("Masukkan kode operator: ");
        operator = sc.nextInt();
        System.out.println("");

        
        penjumlahan = num1 + num2;
        pengurangan = num1 - num2;
        perkalian = num1 * num2;
        pembagian = num1 / num2;

        
        if (operator == 1) {
            System.out.println("Hasil: "+penjumlahan);
        }
        else if(operator == 2){
            System.out.println("Hasil: "+pengurangan);
        }
        else if(operator == 3){
            System.out.println("Hasil: "+perkalian);
        }
        else if(operator == 4){
            System.out.println("Hasil: "+pembagian);
        }
        else{
            System.out.println("Parameter salah");
        }
    }
}
