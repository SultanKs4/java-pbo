package id.natlus.js6.teori.bangundatar;

public class PersegiPanjang1841720019Sultan extends BangunDatar1841720019Sultan {
    public float panjang;
    public float lebar;

    public PersegiPanjang1841720019Sultan() {
    }

    public PersegiPanjang1841720019Sultan(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luasSultan() {
        return this.panjang * this.lebar;
    }

    @Override
    public float kelilingSultan() {
        return 2 * (this.panjang * this.lebar);
    }
}
