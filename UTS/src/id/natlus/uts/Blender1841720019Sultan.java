package id.natlus.uts;

public class Blender1841720019Sultan {
    int presensi;
    Warna warna;
    double diskon;
    int harga;

    public Blender1841720019Sultan() {
    }

    public Blender1841720019Sultan(int presensi, Warna warna) {
        this.presensi = presensi;
        this.warna = warna;
        printAwal();
    }

    protected void printAwal() {
        System.out.println("Objek saya: Objek Blender berwara " + warna);
        System.out.println("Nomor Presensi saya: " + presensi);
    }

    public double hitungDiskonSultan(double diskon, int harga) {
        this.diskon = diskon;
        return harga - (harga * (diskon / 100));
    }

    public double hitungDiskonSultan(String ejaan) {
        BlenderPortable1841720019Sultan bp = new BlenderPortable1841720019Sultan();
        bp.diskon = diskon;
        System.out.print("Hore! saya dapat diskon " + ejaan + " persen.\n\nAsik saya dapat lagi ");
        return diskon;
    }

}
