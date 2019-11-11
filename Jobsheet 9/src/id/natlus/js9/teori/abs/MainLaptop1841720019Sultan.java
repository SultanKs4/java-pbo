package id.natlus.js9.teori.abs;

public class MainLaptop1841720019Sultan {
    public static void main(String[] args) {
        LaptopWork1841720019Sultan lw = new LaptopWork1841720019Sultan();
        LaptopGaming1841720019Sultan lg = new LaptopGaming1841720019Sultan();

        lw.mStorage = 1024;
        lw.tipeLaptop();
        lw.processorSultan();
        lw.storageSultan();

        lg.hdd = 2048;
        lg.ssd = 1024;
        lg.tipeLaptop();
        lg.processorSultan();
        lg.storageSultan();
    }
}
