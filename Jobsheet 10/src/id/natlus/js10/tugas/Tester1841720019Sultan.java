package id.natlus.js10.tugas;

public class Tester1841720019Sultan {
    public static void main(String[] args) {
        WalkingZombie1841720019Sultan wz = new WalkingZombie1841720019Sultan(100, 1);
        JumpingZombie1841720019Sultan jz = new JumpingZombie1841720019Sultan(100, 2);
        Barrier1841720019Sultan b = new Barrier1841720019Sultan(100);
        Plant1841720019Sultan p = new Plant1841720019Sultan();
        System.out.println(wz.getZombieInfoSultan());
        System.out.println(jz.getZombieInfoSultan());
        System.out.println(b.getBarrierInfoSultan());
        System.out.println("-------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroySultan(wz);
            p.doDestroySultan(jz);
            p.doDestroySultan(b);
        }
        System.out.println(wz.getZombieInfoSultan());
        System.out.println(jz.getZombieInfoSultan());
        System.out.println(b.getBarrierInfoSultan());
    }
}
