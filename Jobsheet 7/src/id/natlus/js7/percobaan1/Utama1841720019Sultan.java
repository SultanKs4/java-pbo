package id.natlus.js7.percobaan1;

public class Utama1841720019Sultan {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager dan Staff");
        Manager1841720019Sultan[] man = new Manager1841720019Sultan[2];
        Staff1841720019Sultan[] staff1 = new Staff1841720019Sultan[2];
        Staff1841720019Sultan[] staff2 = new Staff1841720019Sultan[3];

        man[0] = new Manager1841720019Sultan();
        man[0].setmNamaSultan("Tedjo");
        man[0].setmNipSultan("101");
        man[0].setmGolonganSultan("1");
        man[0].setmTunjanganSultan(5000000);
        man[0].setmBagianSultan("Administrasi");

        man[1] = new Manager1841720019Sultan();
        man[1].setmNamaSultan("Atika");
        man[1].setmNipSultan("102");
        man[1].setmGolonganSultan("1");
        man[1].setmTunjanganSultan(2500000);
        man[1].setmBagianSultan("Pemasaran");

        staff1[0] = new Staff1841720019Sultan();
        staff1[0].setmNamaSultan("Usman");
        staff1[0].setmNipSultan("0003");
        staff1[0].setmGolonganSultan("2");
        staff1[0].setmLemburSultan(10);
        staff1[0].setmGajiLemburSultan(10000);

        staff1[1] = new Staff1841720019Sultan();
        staff1[1].setmNamaSultan("Anugrah");
        staff1[1].setmNipSultan("0005");
        staff1[1].setmGolonganSultan("2");
        staff1[1].setmLemburSultan(10);
        staff1[1].setmGajiLemburSultan(55000);
        man[0].setStaffSultan(staff1);

        staff2[0] = new Staff1841720019Sultan();
        staff2[0].setmNamaSultan("Hendra");
        staff2[0].setmNipSultan("0004");
        staff2[0].setmGolonganSultan("3");
        staff2[0].setmLemburSultan(15);
        staff2[0].setmGajiLemburSultan(5500);

        staff2[1] = new Staff1841720019Sultan();
        staff2[1].setmNamaSultan("Arie");
        staff2[1].setmNipSultan("0006");
        staff2[1].setmGolonganSultan("4");
        staff2[1].setmLemburSultan(5);
        staff2[1].setmGajiLemburSultan(100000);

        staff2[2] = new Staff1841720019Sultan();
        staff2[2].setmNamaSultan("Mentari");
        staff2[2].setmNipSultan("0007");
        staff2[2].setmGolonganSultan("2");
        staff2[2].setmLemburSultan(6);
        staff2[2].setmGajiLemburSultan(20000);
        man[1].setStaffSultan(staff2);

        man[0].lihatInfoSultan();
        man[1].lihatInfoSultan();
    }
}
