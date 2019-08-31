package id.natlus.js1;

public class MotorSport18417200191841720019Sultan extends Motor1841720019Sultan {
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
