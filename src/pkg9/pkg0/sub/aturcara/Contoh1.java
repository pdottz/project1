/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg0.sub.aturcara;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Contoh1 {
    
    public static void main(String [] args){
        namaAnda();
        soalan();
        ucapan();
    }
    
    static void soalan(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan satu nombor bulat:");
        int nombor=input.nextInt();
        
        if (nombor % 2 == 0){
            
            System.out.println(nombor + " adalah nombor genap.");
        
        }else{
            
            System.out.println(nombor + " adalah nombor ganjil.");
        }
    }
    
    static void ucapan(){
        System.out.println("Terima Kasih, sila cuba lagi");
    }
    
    static void namaAnda(){
        System.out.println("TENTUKAN NOMBOR GENAP/GANJIL");
        
        Scanner nama = new Scanner(System.in);
        
        System.out.print("Nama anda : ");
        String namaSendiri= nama.next();
        
        System.out.println("Terima Kasih : "+namaSendiri);
    }
    
    
}
