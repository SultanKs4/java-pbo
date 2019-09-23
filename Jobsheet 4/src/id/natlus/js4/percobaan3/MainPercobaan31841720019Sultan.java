package id.natlus.js4.percobaan3;

public class MainPercobaan31841720019Sultan {
    public static void main(String[] args) {
        Pegawai1841720019Sultan masinis = new Pegawai1841720019Sultan("1234", "SpongeBob Squarepants");
        Pegawai1841720019Sultan asisten = new Pegawai1841720019Sultan("45767", "Patrick Star");
        KeretaApi1841720019Sultan keretaApi = new KeretaApi1841720019Sultan("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.infoSultan());
    }
}
