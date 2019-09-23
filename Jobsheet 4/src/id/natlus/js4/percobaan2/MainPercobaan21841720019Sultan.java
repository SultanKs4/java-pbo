package id.natlus.js4.percobaan2;

public class MainPercobaan21841720019Sultan {
    public static void main(String[] args) {
        Mobil1841720019Sultan m = new Mobil1841720019Sultan();
        m.setmMerkSultan("Avanza");
        m.setmBiayaSultan(350000);
        Sopir1841720019Sultan s = new Sopir1841720019Sultan();
        s.setmNamaSultan("John Doe");
        s.setmBiayaSultan(200000);
        Pelanggan1841720019Sultan p = new Pelanggan1841720019Sultan();
        p.setmNamaSultan("Jane Doe");
        p.setmMobilSultan(m);
        p.setmSopirSultan(s);
        p.setmHariSultan(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalSultan());
        System.out.println(p.getmMobilSultan().getmMerkSultan());
    }
}
