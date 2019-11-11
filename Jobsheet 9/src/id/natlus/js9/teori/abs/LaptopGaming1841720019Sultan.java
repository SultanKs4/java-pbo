package id.natlus.js9.teori.abs;

public class LaptopGaming1841720019Sultan extends Laptop1841720019Sultan {
    public int ssd;
    public int hdd;

    @Override
    public void tipeLaptop() {
        System.out.println("MSI Gaming GT75 Titan");
    }

    @Override
    public void processorSultan() {
        System.out.println("Processor Intel Core i9-9980HK @5.0 Ghz");
    }

    private int totalStorageSultan() {
        return this.ssd + this.hdd;
    }

    @Override
    public void storageSultan() {
        System.out.println("SSD : " + ssd + "\tHDD : " + hdd);
        System.out.println("Storage gabungan sebesar " + totalStorageSultan() + "GB\n");
    }
}
