package id.natlus.js2;

public class TestBarang1841720019Sultan {
    public static void main(String[] args) {
        Barang1841720019Sultan brg1 = new Barang1841720019Sultan("Pensil", "ATK", 10);
        brg1.tampilBarangSultan();

//        menampilkan dan mengisi argumen untuk menambah stok barang
        System.out.println("Stok baru adalah " + brg1.tambahStokSultan(20));
    }
}
