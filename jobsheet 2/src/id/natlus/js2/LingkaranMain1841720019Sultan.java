package id.natlus.js2;

import java.util.Scanner;

public class LingkaranMain1841720019Sultan {
    private static Scanner sScannerStr = new Scanner(System.in);
    private static Scanner sScannerInt = new Scanner(System.in);
    private static double sR;
    public static void main(String[] args) {
        char mContd;
        do {
            try {
                inputDataSultan();
                pilihanRumus(sR);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.print("Apakah ingin mengulangi? (y/t): ");
            mContd = sScannerStr.nextLine().toLowerCase().charAt(0);
            System.out.println();
        }while (mContd == 'y');
    }

    private static void inputDataSultan() throws Exception{
        System.out.println("Input r Lingkaran\n--------------------");
        System.out.print("r: ");
        sR = sScannerInt.nextDouble();
        if (sR <= 0){
            throw new Exception("Nilai r tidak valid");
        }
        System.out.println();
    }

    private static void pilihanRumus(double sR) throws Exception{
        int pilihan;
        System.out.println("Pilih output Rumus Lingkaran\n--------------------");
        System.out.print("1. Luas Lingkaran\n2. Keliling Lingkaran\n" +
                "3. Semua (Luas & Keliling Lingkaran)\n> ");
        pilihan = sScannerInt.nextInt();
        Lingkaran1841720019Sultan lingkaran = new Lingkaran1841720019Sultan(sR);
        System.out.println();
        switch (pilihan){
            case 1:
                System.out.println("Hasil Luas Lingkaran dari r= " + sR +
                        ", adalah: " + lingkaran.hitungLuasSultan());
                break;
            case 2:
                System.out.println("Hasil Keliling Lingkaran dari r= " + sR +
                        ", adalah: " + lingkaran.hitungKelilingSultan());
                break;
            case 3:
                System.out.println("Hasil Luas Lingkaran dari r= " + sR +
                        ", adalah: " + lingkaran.hitungLuasSultan());
                System.out.println("Hasil Keliling Lingkaran dari r= " + sR +
                        ", adalah: " + lingkaran.hitungKelilingSultan());
                break;
            default:
                throw new Exception("Input tidak Valid");
        }
        System.out.println();
    }
}
