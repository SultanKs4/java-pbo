package id.natlus.js7.tugas.overloading;

public class Main1841720019Sultan {
    public static void main(String[] args) {
        Segitiga1841720019Sultan segitiga = new Segitiga1841720019Sultan();

        System.out.println("1. Sudut = 180 - sudutA: " + segitiga.totalSudutSultan(60));
        System.out.println("2. Sudut = 180 - (sudutA + sudutB): " + segitiga.totalSudutSultan(60, 70));
        System.out.println("3. Keliling = sisiA + sisiB + sisiC: " + segitiga.kelilingSultan(10, 20, 30));
        System.out.println("4. Ganti menjadi phytagoras = \u221A(sisiA\u00B2 + sisiB\u00B2): "
                + segitiga.kelilingSultan(4, 3));
    }
}
