//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner;

class Biodata {
    String nama;
    String hobi;
    int umur;

    Biodata (String nama, String hobi, int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    public static int test(){
        return 100;
    }

    // public
    // private
    public static void coba(int a){
        if (a == 7){
            System.out.println("oke");
        }
    }

    void menyapa(){
        System.out.println("Halo saya " + nama );
    }
}

public class Main {
    public static void calc(int a, int b, String op){
        if(op.equals("+")){
            System.out.print(a+b);
        }else if(op.equals("-")){
            System.out.print(a-b);
        }else if(op.equals("x")){
            System.out.print(a*b);
        }else if(op.equals(":")){
            System.out.print(a/b);
        }else if(op.equals("%")){
            System.out.print(a%b);
        }else {
            System.out.print("input Tidak Valid!");
        }
    }

    public static void main(String[] args) {
        Biodata dataSaya = new Biodata("risa", "nonton", 31);

        dataSaya.menyapa();
        System.out.println(dataSaya.hobi);
        System.out.println(dataSaya.test());

        /*
        * Buatkan kalkulator yang bisa menerima input
        * int a
        * int b
        * char operator
        * while
        * lanjuy? y t
        * terimakasih
        * */

        // DRY (dont reapet ur self)

//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        while (kondisi) {
//            System.out.print("Masukkan a: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan b: ");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan Operator: ");
//            String op = scanner.nextLine();
//
//            calc(a, b, op);
//
//            System.out.print("\nlanjut?");
//            String tanya = scanner.nextLine();
//            if(tanya.equals("ya")){
//                kondisi = true;
//            }else {
//                kondisi = false;
//            }
//        }
//
//        scanner.close();
//
//        System.out.println("Halo, " + nama + "!");
//        if(nama.equals("risa")){
//            System.out.println("Apa kabar!");
//        }else  {
//            System.out.println("Kenalan yuk!");
//        }
//

//        String nama = "Rivendi Al isa nussy";
//
//        System.out.println(nama);
//        System.out.println("Nama saya " + nama);

//        int a = 24;
//        int b = 16;
//
//        int kurang = a - b;
//        int kali = a * b;
//        int bagi = a / b;
//
//        System.out.println(a + b);
//        System.out.println(a % b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);

        // Operator Logka atau, dan, & bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true  && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(true && !(true || false));
//
//        boolean makan = true;
//        boolean minum = false;
//
//        boolean aturan = makan || minum;
//        System.out.println(makan && minum);
//        System.out.println(aturan);

//        < > == <= >=
//        int a = 31;
//        int b = 31;
//
//        System.out.println(a <= b);

//        int saldo = 2000;
//        int tarik = 1900;
//
//        if (tarik > 1000 && tarik <= saldo)
//        {
//            System.out.println("Saldo berhasil ditarik, tapi kena pajak 25%");
//        }else if(tarik <= saldo){
//            System.out.println("Saldo berhasil ditarik");
//        }else {
//            System.out.println("Saldo Anda kurang");
//        }

//        int cek = 1;
//        while (cek <= 10){
//            System.out.println("looping");
//
//            cek = cek + 1;
//        }

//        for (int i = 1; i <= 10; i++){
//            System.out.println("looping " + i);
//        }

    }
}