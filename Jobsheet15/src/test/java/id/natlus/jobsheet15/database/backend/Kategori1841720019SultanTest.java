package id.natlus.jobsheet15.database.backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Kategori1841720019SultanTest extends TestCase {
    Kategori1841720019Sultan instance;

    public Kategori1841720019SultanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720019Sultan("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", instance.getmNamaSultan());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getmNamaSultan());
    }

    /**
     * Test of saveSultan method, of class Kategori1841720019Sultan.
     */
    @Test
    public void testSaveSultan() {
        System.out.println("save test");
        instance.saveSultan();
        ArrayList<Kategori1841720019Sultan> expResult = instance.getByNamaAndKeteranganSultan(instance.getmNamaSultan(), instance.getmKeteranganSultan());
        assertTrue(expResult.size() > 0);
//        Assert.fail("The test case is a prototype.");
    }

    /**
     * Test of searchSultan method, of class Kategori1841720019Sultan.
     */
    @Test
    public void testSearchSultan() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720019Sultan> result = instance.searchSultan(keyword);
        ArrayList<Kategori1841720019Sultan> expResult = instance.getByNamaAndKeteranganSultan(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
