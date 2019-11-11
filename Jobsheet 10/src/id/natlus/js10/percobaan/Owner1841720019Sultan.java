package id.natlus.js10.percobaan;

public class Owner1841720019Sultan {
    public void paySultan(IPayable1841720019Sultan p) {
        System.out.println("Total Payment = " + p.getPaymentAmountSultan());
        if (p instanceof ElectricityBill1841720019Sultan) {
            ElectricityBill1841720019Sultan eb = (ElectricityBill1841720019Sultan) p;
            System.out.println(eb.getBillInfoSultan());
        } else if (p instanceof PermanentEmployee1841720019Sultan) {
            PermanentEmployee1841720019Sultan pe = (PermanentEmployee1841720019Sultan) p;
            pe.getEmployeeInfoSultan();
            System.out.println(pe.getEmployeeInfoSultan());
        }
    }

    public void showMyEmployeSultan(Employee1841720019Sultan e) {
        System.out.println(e.getEmployeeInfoSultan());
        if (e instanceof PermanentEmployee1841720019Sultan) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her");
        }
    }
}
