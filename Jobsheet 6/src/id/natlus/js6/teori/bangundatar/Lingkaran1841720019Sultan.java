package id.natlus.js6.teori.bangundatar;

public class Lingkaran1841720019Sultan extends BangunDatar1841720019Sultan {
    public float r;

    public Lingkaran1841720019Sultan() {
    }

    public Lingkaran1841720019Sultan(float r) {
        this.r = r;
    }

    @Override
    public float luasSultan() {
        return (float) (Math.PI * Math.pow(this.r, 2));
    }

    @Override
    public float kelilingSultan() {
        return (float) (2 * Math.PI * this.r);
    }
}
