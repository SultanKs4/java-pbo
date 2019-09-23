package id.natlus.js3;

import java.util.Scanner;

public class TestKoperasi1841720019Sultan {
    private static Scanner sScStr = new Scanner(System.in);
    private static Scanner sScInt = new Scanner(System.in);
    private static String sKTP;
    private static String sNama;
    private static int sLimit;
    private static AnggotaKoperasi1841720019Sultan user;

    public static void main(String[] args) {
        instanceObject();
        user = new AnggotaKoperasi1841720019Sultan(sKTP, sNama, sLimit);

        char mContd;
        do {
            menu();
            System.out.print("Apakah ingin kembali ke menu? (y/t): ");
            mContd = sScStr.nextLine().toLowerCase().charAt(0);
            System.out.println();
        } while (mContd == 'y');
    }

    private static void instanceObject() {
        System.out.print("-----Credentials-----\nKTP: ");
        sKTP = sScStr.nextLine();
        System.out.print("Nama: ");
        sNama = sScStr.nextLine();
        System.out.print("Limit Pinjam: ");
        sLimit = sScInt.nextInt();
        System.out.println("------------------\n");
    }

    private static void menu() {
        System.out.println("-------Menu-------\n1. Print Profile\n2. Pinjam\n3. Angsur");
        System.out.print("Pilihan: ");
        int choice = sScInt.nextInt();
        System.out.println("-------------------\n");
        switch (choice) {
            case 1:
                System.out.println("-------Profile-------");
                System.out.println("No. KTP: " + user.getmNomerKTP() + "\nNama: " + user.getmNamaSultan());
                System.out.println("Limit Pinjam: " + user.getmLimitPinjamSultan());
                System.out.println("Sisa Limit Pinjam: " + user.getmSisaLimitPinjamSultan());
                System.out.println("Jumlah Pinjam: " + user.getmJumlahPinjamSultan());
                System.out.println("---------------------");
                break;
            case 2:
                System.out.println("-------Pinjam-------");
                System.out.println("Sisa Limit Pinjam: " + user.getmSisaLimitPinjamSultan());
                System.out.print("Pinjam: ");
                int pinjam = sScInt.nextInt();
                user.pinjamSultan(pinjam);
                System.out.println("Total Pinjam: " + user.getmJumlahPinjamSultan());
                System.out.println("Sisa Limit Pinjam: " + user.getmSisaLimitPinjamSultan());
                System.out.println("---------------------");
                break;
            case 3:
                System.out.println("-------Angsur-------");
                System.out.println("Total Pinjam: " + user.getmJumlahPinjamSultan());
                System.out.print("Angsur (min 10% Total Pinjam): ");
                int angsur = sScInt.nextInt();
                user.angsurSultan(angsur);
                System.out.println("Total Pinjam: " + user.getmJumlahPinjamSultan());
                System.out.println("Sisa Limit Pinjam: " + user.getmSisaLimitPinjamSultan());
                System.out.println("---------------------");
                break;
            default:
                System.out.println("Input tidak valid");
        }
        System.out.println();
    }

    private void tugas4dan5Sultan() {
        //      Tugas 4
        /*
        System.out.println("\nMeminjam uang 10.000.000");
        donny.pinjamSultan(10000000);

        System.out.println("\nMeminjam uang 4.000.000");
        donny.pinjamSultan(4000000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());

        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsurSultan(1000000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());

        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsurSultan(299999);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());*/
        //      Tugas 5
        /*
        System.out.println("\nMeminjam uang 5.000.000");
        donny.pinjamSultan(5000000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());

        System.out.println("\nMembayar angsuran 400.000");
        donny.angsurSultan(400000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());

        System.out.println("\nMembayar angsuran 500.000");
        donny.angsurSultan(500000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());

        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsurSultan(1000000);
        System.out.println("Jumlah pinjam saat ini: " + donny.getmJumlahPinjamSultan());*/
    }
}