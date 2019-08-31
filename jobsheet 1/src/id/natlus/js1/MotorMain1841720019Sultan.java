package id.natlus.js1;

public class MotorMain1841720019Sultan {
    public static void main(String[] args) {
        Motor1841720019Sultan matic = new Motor1841720019Sultan();
        MotorSport18417200191841720019Sultan sport = new MotorSport18417200191841720019Sultan();

        matic.setmMerkSultan("Honda");
        matic.setmTipeSultan("Vario 150");
        matic.setmWarnaSultan("Merah");
        matic.setmBensinSultan(4);
        matic.setKecepatanUpSultan(40);
        matic.cetakSatusSultan();
        System.out.println();

        sport.setmMerkSultan("BMW");
        sport.setmTipeSultan("S1000RR");
        sport.setmWarnaSultan("Putih");
        sport.setmBensinSultan(15);
        sport.setKecepatanUpSultan(200);
        sport.setGearSultan(2);
        sport.cetakSatusSultan();
        System.out.println();
        sport.setKecepatanDownSultan(100);
        sport.setGearSultan(1);
        sport.setmBensinSultan(13);
        sport.cetakSatusSultan();
        System.out.println();
    }
}
