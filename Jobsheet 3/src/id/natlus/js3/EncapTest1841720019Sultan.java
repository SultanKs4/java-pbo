package id.natlus.js3;

public class EncapTest1841720019Sultan {
    public static void main(String[] args) {
        EncapDemo1841720019Sultan encap = new EncapDemo1841720019Sultan();
        encap.setmNameSultan("James");
        encap.setmAgeSultan(35);
        System.out.println("Name : " + encap.getmNameSultan());
        System.out.println("Age : " + encap.getmAgeSultan());

        encap.setmAgeSultan(15);
        System.out.println("Name : " + encap.getmNameSultan());
        System.out.println("Age : " + encap.getmAgeSultan());
    }
}
