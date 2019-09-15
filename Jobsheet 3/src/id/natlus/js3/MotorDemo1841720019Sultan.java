package id.natlus.js3;

public class MotorDemo1841720019Sultan {
    public static void main(String[] args) {
        Motor1841720019Sultan motor = new Motor1841720019Sultan();
        /*Percobaan 1
         * motor.printStatusSultan();
         * motor.kecepatan = 50;
         * motor.printStatusSultan();
         * */

/*        Percobaan 2
        motor.printStatusSultan();
        motor.tambahKecepatanSultan();

        motor.nyalakanMesinSultan();
        motor.printStatusSultan();

        motor.tambahKecepatanSultan();
        motor.printStatusSultan();

        motor.tambahKecepatanSultan();
        motor.printStatusSultan();

        motor.tambahKecepatanSultan();
        motor.printStatusSultan();

        motor.matikanMesinSultan();
        motor.printStatusSultan();*/

//        Pertanyaan Percobaan
        motor.printStatusSultan();
        motor.nyalakanMesinSultan();

        for (int i = 0; i < 21; i++) {
            motor.tambahKecepatanSultan();
            motor.printStatusSultan();
        }

//        Penyempurnaan percobaan
        motor.matikanMesinSultan();

        for (int i = 0; i < 21; i++) {
            motor.kurangiKecepatanSultan();
            motor.printStatusSultan();
        }

        motor.matikanMesinSultan();
        motor.printStatusSultan();
    }
}
