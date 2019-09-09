package id.natlus.js2;

import java.util.Scanner;

public class BarangTugas4Main1841720019Sultan {
    private static Scanner sScannerStr = new Scanner(System.in);
    private static Scanner sScannerInt = new Scanner(System.in);
    private static String sKode;
    private static String sNamaBarang;
    private static int sHargaDasar;
    private static float sDiskon;
    public static void main(String[] args) {
        char mContd;
        do {
            try {
                inputDataSultan();
                BarangTugas41841720019Sultan barang = new BarangTugas41841720019Sultan(sKode,
                        sNamaBarang, sHargaDasar, sDiskon);
                barang.tampilDataSultan();
                System.out.println();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.print("Apakah ingin mengulangi? (y/t): ");
            mContd = sScannerStr.nextLine().toLowerCase().charAt(0);
            System.out.println();
        }while (mContd == 'y');
    }
    private static void inputDataSultan() throws Exception{
        System.out.println("Input Data\n--------------------");
        System.out.print("Kode: ");
        sKode = sScannerStr.nextLine();
        System.out.print("Nama Barang: ");
        sNamaBarang = sScannerStr.nextLine();
        System.out.print("Harga Dasar (Rp): ");
        sHargaDasar = sScannerInt.nextInt();
        if (sHargaDasar <= 10){
            throw new Exception("Harga Dasar Tidak Valid");
        }
        System.out.print("Diskon (%): ");
        sDiskon = sScannerInt.nextFloat();
        if (sDiskon < 0){
            throw new Exception("Diskon tidak valid");
        }
        System.out.println("--------------------\nOUTPUT DATA\n--------------------");
    }
}
