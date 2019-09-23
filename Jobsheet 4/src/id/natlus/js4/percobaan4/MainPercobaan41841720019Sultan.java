package id.natlus.js4.percobaan4;

public class MainPercobaan41841720019Sultan {
    public static void main(String[] args) {
        Penumpang1841720019Sultan p = new Penumpang1841720019Sultan("12345", "Mr. Krab");
        Gerbong1841720019Sultan gerbong = new Gerbong1841720019Sultan("A", 10);
        gerbong.setPenumpangSultan(p, 1);

//        Pertanyaan 4
        Penumpang1841720019Sultan budi = new Penumpang1841720019Sultan("67890", "Budi");
        gerbong.setPenumpangSultan(budi, 1);

        System.out.println(gerbong.infoSultan());
    }
}
