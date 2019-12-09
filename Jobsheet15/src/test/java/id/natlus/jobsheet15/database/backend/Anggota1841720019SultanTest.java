package id.natlus.jobsheet15.database.backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Anggota1841720019SultanTest extends TestCase {
    Anggota1841720019Sultan instance;

    public Anggota1841720019SultanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720019Sultan("Natlus", "Singosari", "911");
        System.out.format("Start Testing : %s \n", instance.getmNamaSultan());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getmNamaSultan());
    }

    /**
     * Test of saveSultan method, of class Anggota1841720019Sultan.
     */
    @Test
    public void testSaveSultan() {
        System.out.println("save test");
        instance.saveSultan();
        ArrayList<Anggota1841720019Sultan> expResult = instance.getByNamaAlamatAndTeleponSultan(instance.getmNamaSultan(), instance.getmAlamatSultan(), instance.getmTeleponSultan());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of searchSultan method, of class Anggota1841720019Sultan.
     */
    @Test
    public void testSearchSultan() {
        System.out.println("search test");
        String keyword = "Natlus";
        ArrayList<Anggota1841720019Sultan> result = instance.searchSultan(keyword);
        ArrayList<Anggota1841720019Sultan> expResult = instance.getByNamaAlamatAndTeleponSultan(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }

}
