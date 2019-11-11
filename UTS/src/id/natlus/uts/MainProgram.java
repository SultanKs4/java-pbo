package id.natlus.uts;

public class MainProgram {
    public static void main(String[] args) {
        Blender1841720019Sultan obj1 = new Blender1841720019Sultan(26, Warna.Hijau);
        BlenderPortable1841720019Sultan obj2 = new BlenderPortable1841720019Sultan(Warna.Biru);

        double hrg = obj1.hitungDiskonSultan(26, 50000);
        System.out.printf("Harga Final = Rp. %,.2f\n", hrg);
        obj2.setHargaSultan(hrg);

        hrg = obj1.hitungDiskonSultan("Dua Puluh Enam");
        hrg = hrg + 26;
        System.out.printf("Super Diskon %.0f", hrg);
        System.out.println("%");
        obj2.hitungDiskonSultan(hrg);
    }
}
