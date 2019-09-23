package id.natlus.js4.percobaan1;

public class Laptop1841720019Sultan {
    private String mMerk;
    private Processor1841720019Sultan proc;

    public Laptop1841720019Sultan() {
    }

    public Laptop1841720019Sultan(String mMerk, Processor1841720019Sultan proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }

    public String getmMerkSultan() {
        return mMerk;
    }

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720019Sultan getProcSultan() {
        return proc;
    }

    public void setProcSultan(Processor1841720019Sultan proc) {
        this.proc = proc;
    }

    public void infoSultan() {
        System.out.println("Merk Laptop = " + mMerk);
        proc.infoSultan();
    }
}
