package id.natlus.percobaan1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CobaHastSet1841720019Sultan {
    public static void main(String[] args) {
        Set<String> mSetCity = new HashSet<>();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");

        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();

        while (mIterator.hasNext()) {
            System.out.println(mIterator.next().toLowerCase());
        }

    }
}
