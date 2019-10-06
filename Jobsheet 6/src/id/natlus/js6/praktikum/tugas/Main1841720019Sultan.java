package id.natlus.js6.praktikum.tugas;

public class Main1841720019Sultan {
    public static void main(String[] args) {
        Mac1841720019Sultan mac = new Mac1841720019Sultan("Apple", 2, 16,
                "Intel Core i9", "Li-Poly", "Apple T2 Chip");
        mac.tampilMacSultan();
        Windows1841720019Sultan win = new Windows1841720019Sultan("MSI", 4, 64,
                "Intel Core i9 9880H", "Li-Ion", "Display 240 Hz");
        win.tampilWindowsSultan();
        Pc1841720019Sultan pc = new Pc1841720019Sultan("DELL", 3, 32,
                "Intel Core i9 9900K", 24);
        pc.tampilPcSultan();
    }
}
