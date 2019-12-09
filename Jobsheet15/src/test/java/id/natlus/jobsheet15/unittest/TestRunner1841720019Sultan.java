package id.natlus.jobsheet15.unittest;

import id.natlus.jobsheet15.database.backend.Anggota1841720019SultanTest;
import id.natlus.jobsheet15.database.backend.Kategori1841720019SultanTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720019Sultan {
    public static void main(String[] args) {
        Result mResult = JUnitCore.runClasses(MessageProcessor1841720019SultanTest.class);
        showMessageResultSultan(mResult, MessageProcessor1841720019SultanTest.class.getSimpleName());

        mResult = JUnitCore.runClasses(Kategori1841720019SultanTest.class);
        showMessageResultSultan(mResult, Kategori1841720019SultanTest.class.getSimpleName());

        mResult = JUnitCore.runClasses(Anggota1841720019SultanTest.class);
        showMessageResultSultan(mResult, Anggota1841720019SultanTest.class.getSimpleName());
    }

    private static void showMessageResultSultan(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
