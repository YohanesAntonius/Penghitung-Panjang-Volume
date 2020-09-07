
package penghitungpanjangdanvolume;

import java.util.Scanner;

/**
 *
 * @author Yohanes Antonius
 */

public class Penghitungpanjangdanvolume {

    public static void main(String[] args) {
       System.out.println("Pilih Salah Satu:");
        System.out.println("1.Menghitung Luas Segitiga");
        System.out.println("2.Menghitung Luas Trapesium");
        System.out.println("3.Menghitung Keliling Lingkaran");
       System.out.println("Input di bawah ini !"); 
        Scanner Input = new Scanner (System.in);
        
        int angka = Input.nextInt();
        if (angka == 1){
            System.out.println ("Input alas,tinggi");
            double alas = Input.nextDouble();
            double tinggi = Input.nextDouble();
            double hasil = (alas*tinggi) / 2;
            System.out.println ("Hasil = "+ hasil);
           
            
        }else if (angka == 2){
            System.out.println("Input jumlah sisi sejajar,tinggi");
            double jumlahsisisejajar = Input.nextDouble();
            double tinggi = Input.nextDouble();
            double hasil = (jumlahsisisejajar*tinggi) / 2;
            System.out.println("Hasil = "+ hasil);
            
        }else if (angka == 3){
            System.out.println("Input phi,diameter");
            double phi = Input.nextDouble();
            double diameter = Input.nextDouble();
            double hasil = phi * diameter;
            System.out.println("Hasil = "+ hasil);
            
        }
        
        
    }
    
}
