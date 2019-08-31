package id.natlus.js1;

public class MotorSportSultan extends MotorSultan {
    private int mGear;

    public void setGearSultan(int gear) {
        this.mGear = gear;
    }

    @Override
    public void cetakSatusSultan() {
        super.cetakSatusSultan();
        System.out.println("Posisi Gear: " + mGear);
    }
}
