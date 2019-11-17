package id.natlus.percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList1841720019Sultan {
    public static void main(String[] args) {
        List<Object> mListCounty = new ArrayList<>();
        mListCounty.add("Indonesia");
        mListCounty.add("Malaysia");
        mListCounty.add("German");

//        System.out.println(mListCounty);
//        System.out.format("List index 0 = %s\n", mListCounty.get(0));
//        System.out.format("List index 2 = %s\n", mListCounty.get(2));
        System.out.println("Country List");
        Iterator mIterator = mListCounty.iterator();
        while (mIterator.hasNext()) {
            Object element = mIterator.next();
            System.out.format("%s ", element);
        }
    }
}
