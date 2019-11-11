package id.natlus.js10.percobaan;

public class Tester41841720019Sultan {
    public static void main(String[] args) {
        Owner1841720019Sultan ow = new Owner1841720019Sultan();
        ElectricityBill1841720019Sultan eBill = new ElectricityBill1841720019Sultan(5, "R-1");
        ow.paySultan(eBill);
        System.out.println("---------------------------------");

        PermanentEmployee1841720019Sultan pEmp = new PermanentEmployee1841720019Sultan("Dedik", 500);
        ow.paySultan(pEmp);
        System.out.println("---------------------------------");

        InternshipEmployee1841720019Sultan iEmp = new InternshipEmployee1841720019Sultan("Sunarto", 5);
        ow.showMyEmployeSultan(pEmp);
        System.out.println("---------------------------------");
        ow.showMyEmployeSultan(iEmp);

        ow.paySultan(iEmp);
    }
}
