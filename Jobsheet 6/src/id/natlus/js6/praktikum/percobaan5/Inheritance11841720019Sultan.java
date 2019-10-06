package id.natlus.js6.praktikum.percobaan5;

public class Inheritance11841720019Sultan {
    public static void main(String[] args) {
        Manager1841720019Sultan M = new Manager1841720019Sultan();
        M.setmNamaSultan("Vivin");
        M.setmAlamatSultan("Jl. Vinolia");
        M.setmUmurSultan(25);
        M.setmJkSultan("Perempuan");
        M.setmGajiSultan(3000000);
        M.setmTunjanganSultan(1000000);
        M.tampilDataManagerSultan();

        Staff1841720019Sultan S = new Staff1841720019Sultan();
        S.setmNamaSultan("Lestari");
        S.setmAlamatSultan("Malang");
        S.setmUmurSultan(25);
        S.setmJkSultan("Perempuan");
        S.setmGajiSultan(2000000);
        S.setmLemburSultan(500000);
        S.setmPotonganSultan(250000);
        S.tampilDataStaffSultan();
    }
}
