package Bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

    Tester() {
    }

    public void test() {

        BankAccount Test = new BankAccount("TestPerson");
        int atm1 = 400, atm2 = 250;
        ATM Test1 = new ATM(Test, true, 1, atm1);
        ATM Test2 = new ATM(Test, false, 2, atm2);
        ATM Test3 = new ATM(Test, false, 3, atm2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(Test1);
        service.execute(Test2);
        service.execute(Test3);
        service.shutdown();
    }
}