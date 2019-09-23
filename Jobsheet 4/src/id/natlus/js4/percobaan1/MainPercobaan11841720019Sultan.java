package id.natlus.js4.percobaan1;

public class MainPercobaan11841720019Sultan {
    public static void main(String[] args) {
//        Percobaan 1 sampai poin Q
        Processor1841720019Sultan p = new Processor1841720019Sultan("Intel i5", 3);
        Laptop1841720019Sultan L = new Laptop1841720019Sultan("Thinkpad", p);
        L.infoSultan();

//
        Processor1841720019Sultan p1 = new Processor1841720019Sultan();
        p1.setmMerkSultan("Intel i5");
        p1.setmCacheSultan(4);
        Laptop1841720019Sultan L1 = new Laptop1841720019Sultan();
        L1.setmMerkSultan("Thinkpad");
        L1.setProcSultan(p1);
        L1.infoSultan();
    }
}
