
package datadiri;


public class DataDiri {

    
    public static void main(String[] args) {
        //Output method main
        System.out.println("Selamat datang : ");
        //Pemberian objek untuk pemanggilan dengan objek "oke"
        method ok=new method();
        //Pemanggilan method nonvoid
        System.out.println(ok.awal());
        //Pemanggilan method void
        ok.diri();
        //Pemanggilan method nonvoid
        System.out.println(ok.akhir());
    }
    
}
