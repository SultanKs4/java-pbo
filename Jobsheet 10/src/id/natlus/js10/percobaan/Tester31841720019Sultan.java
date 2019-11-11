package id.natlus.js10.percobaan;

public class Tester31841720019Sultan {
    public static void main(String[] args) {
        PermanentEmployee1841720019Sultan pEmp = new PermanentEmployee1841720019Sultan("Dedik", 500);
        InternshipEmployee1841720019Sultan iEmp = new InternshipEmployee1841720019Sultan("Sunarto", 5);
        ElectricityBill1841720019Sultan eBill = new ElectricityBill1841720019Sultan(5, "A-1");
        Employee1841720019Sultan e[] = {pEmp, iEmp};
        IPayable1841720019Sultan p[] = {pEmp, eBill};
        Employee1841720019Sultan e2[] = {pEmp, iEmp, eBill};
    }
}
