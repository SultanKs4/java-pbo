package id.natlus.uts;

public class BlenderPortable1841720019Sultan extends Blender1841720019Sultan {
    Warna warna;
    double harga;
    double diskon;

    public BlenderPortable1841720019Sultan() {
    }

    public BlenderPortable1841720019Sultan(Warna warna) {
        this.warna = warna;
        printAwal();
    }

    @Override
    protected void printAwal() {
        System.out.println("========================");
        System.out.println("Warna BlenderPortable1841720019Sultan adalah " + warna);
    }


    public void setHargaSultan(double hrg) {
        this.harga = hrg;
    }

    public void hitungDiskonSultan(double diskon) {
        harga = harga - (harga * (diskon / 100));
        System.out.printf("Jadi harga BlenderPortableSultan1841720019 = Rp. %,.2f \ndengan warna %s", harga, warna);
    }
}
