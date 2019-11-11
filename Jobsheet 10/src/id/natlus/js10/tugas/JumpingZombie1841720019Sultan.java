package id.natlus.js10.tugas;

public class JumpingZombie1841720019Sultan extends Zombie1841720019Sultan {
    public JumpingZombie1841720019Sultan(int mHealth, int mLevel) {
        super.mHealth = mHealth;
        super.mLevel = mLevel;
    }

    @Override
    public void healSultan() {
        switch (super.mLevel) {
            case 1:
                mHealth += mHealth * 30 / 100;
                break;
            case 2:
                mHealth += mHealth * 40 / 100;
                break;
            case 3:
                mHealth += mHealth * 50 / 100;
                break;
            default:
                System.out.println("Lvl Error!");
                break;
        }
    }

    @Override
    public void destroyedSultan() {
        super.mHealth -= (super.mHealth * 10 / 100);
    }

    @Override
    public String getZombieInfoSultan() {
        return "Jumping Zombie Data =\nHealth = " + mHealth + "\nLevel = " + mLevel + "\n";
    }
}
