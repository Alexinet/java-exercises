package Bank;

public class ATM implements Runnable {
    private BankAccount account;
    private boolean op;
    private int thr;
    int sum;

    ATM(BankAccount acc, boolean op, int thr, int sum) {
        this.account = acc;
        this.op = op;
        this.thr = thr;
        this.sum = sum;
    }

    @Override
    public synchronized void run() {
        Thread.currentThread().setName("Вход в поток N" + this.thr +
                "(" + (this.op ? "пополнение на " : "снятие ") + sum + ")");

        System.out.println(Thread.currentThread().getName());

        if (this.op) account.add(this.sum, this.thr);
        else
            account.takeoff(this.sum, this.thr);
    }
}