
package datadiri;

import java.util.Scanner;


public class method {
    //Deklarasi variabel
    String nama,alamat,jenis_kelamin,kewarganegaraan,status;
    String Awal = "inputkan beberapa data sebagai berikut";
    String Akhir ="Terima kasih sudah mengisi data diri anda";
    //Method nonvoid
    String awal(){
        return Awal;
    }
    //Method void
    void diri(){
        //Scanner dengan variabel input
        Scanner input=new Scanner(System.in);
        //Berbagai Perintah untuk menginputkan oleh user 
        System.out.println("Masukan nama anda : ");
        nama=input.nextLine();
        System.out.println("Masukan alamat anda : ");
        alamat=input.nextLine();
        System.out.println("Masukan jenis kelamin anda : ");
        jenis_kelamin=input.nextLine();
        System.out.println("Masukan kewarganegaraan anda : ");
        kewarganegaraan=input.nextLine();
        System.out.println("Masukan status anda : ");
        status=input.nextLine();
        
    }
    //Method nonvoid
    String akhir(){
        return Akhir;
    }
}
