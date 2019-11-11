package id.natlus.js10.tugas;

public class WalkingZombie1841720019Sultan extends Zombie1841720019Sultan {
    public WalkingZombie1841720019Sultan(int mHealt, int mLevel) {
        super.mHealth = mHealt;
        super.mLevel = mLevel;
    }

    @Override
    public void healSultan() {
        switch (super.mLevel) {
            case 1:
                mHealth += mHealth * 20 / 100;
                break;
            case 2:
                mHealth += mHealth * 30 / 100;
                break;
            case 3:
                mHealth += mHealth * 40 / 100;
                break;
            default:
                System.out.println("Lvl Error!");
                break;
        }
    }

    @Override
    public void destroyedSultan() {
        super.mHealth -= (super.mHealth * 20 / 100);
    }

    @Override
    public String getZombieInfoSultan() {
        return "Walking Zombie Data =\nHealth = " + super.mHealth + "\nLevel = " + super.mLevel + "\n";
    }
}
