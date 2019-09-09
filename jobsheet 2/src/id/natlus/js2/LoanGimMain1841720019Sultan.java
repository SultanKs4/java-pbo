package id.natlus.js2;

import java.util.Scanner;

public class LoanGimMain1841720019Sultan {
    private static Scanner sScannerStr = new Scanner(System.in);
    private static Scanner sScannerInt = new Scanner(System.in);
    private static int sId;
    private static String sNama;
    private static String sJudulGame;
    private static double sDurasiSewa;
    private static double sHargaSewa;

    public static void main(String[] args){
        char mContd;
        do {
            try {
                inputDataSultan();
                LoanGim1841720019Sultan data = new LoanGim1841720019Sultan(sId, sNama,
                        sJudulGame, sDurasiSewa, sHargaSewa);
                data.dataTransaksiSultan();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.print("Apakah ingin mengulangi? (y/t): ");
            mContd = sScannerStr.nextLine().toLowerCase().charAt(0);
            System.out.println();
        } while (mContd == 'y');
    }

    private static void inputDataSultan() throws Exception{
        System.out.println("INPUT DATA\n--------------------");
        System.out.print("ID: ");
        sId = sScannerInt.nextInt();
        if (sId < 1){
            throw new Exception("ID tidak valid");
        }
        System.out.print("Nama: ");
        sNama = sScannerStr.nextLine();
        System.out.print("Judul Game: ");
        sJudulGame = sScannerStr.nextLine();
        System.out.print("Lama Sewa (Hari): ");
        sDurasiSewa = sScannerInt.nextDouble();
        if (sDurasiSewa <= 0){
            throw new Exception("Durasi tidak valid (minimal 1 hari)");
        }
        System.out.print("Harga Sewa (Per Hari): ");
        sHargaSewa = sScannerInt.nextDouble();
        if (sHargaSewa <= 999){
            throw new Exception("Harga Sewa tidak valid");
        }
        System.out.println("--------------------\nOUTPUT DATA");
    }
}
