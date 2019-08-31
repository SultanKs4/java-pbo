package id.natlus.js1;

public class MotorMainSultan {
    public static void main(String[] args) {
        MotorSultan matic = new MotorSultan();
        MotorSportSultan sport = new MotorSportSultan();

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
