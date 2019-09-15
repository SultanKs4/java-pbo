package id.natlus.js3;

public class Motor1841720019Sultan{
    /*Percobaan 1
    * public int kecepatan = 0;
    * public boolean kontakOn = false*/

//    Percobaan 2
    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void nyalakanMesinSultan(){
        mKontakOn = true;
    }

    public void matikanMesinSultan(){
        if (mKecepatan == 0){
            mKontakOn = false;
        } else {
            System.out.println("Mematikan mesin harus berhenti!\n");
        }
    }

    public void tambahKecepatanSultan(){
        if (mKontakOn) {
            maxSpeedSultan();
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    private void maxSpeedSultan(){
        if (mKecepatan < 100){
            mKecepatan += 5;
        } else {
            System.out.println("Kecepatan sudah maksimal\n");
        }
    }

    public void kurangiKecepatanSultan(){
        if (mKontakOn) {
            minSpeedSultan();
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }

    private void minSpeedSultan(){
        if (mKecepatan > 0){
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan sudah 0\n");
        }
    }

    public void printStatusSultan(){
        if (mKontakOn){
            System.out.println("Kontak on");
        } else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + mKecepatan + "\n");
    }
}
