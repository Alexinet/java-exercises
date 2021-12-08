package Bank;

public class BankAccount extends Person {
    private int money = 0;

    public BankAccount(String name) {
        super.name = name;
    }

    public synchronized void add(int sum, int thr) {
        {
            this.money += sum;
            System.out.println("Поток №" + thr + ": Успешное пополнение. Баланс: " + checkBalance());
        }
    }

    public synchronized void takeoff(int sum, int thr) {
        if (isEnough(sum)) {
            money -= sum;
            System.out.println("Поток №" + thr + ": Успешное снятие. Баланс: " + checkBalance());
        } else
            System.out.println("Поток №" + thr + ": Недостаточно средств. Баланс: " + checkBalance());
    }

    public boolean isEnough(int amount) {
        return money - amount >= 0;
    }

    public int checkBalance() {
        return money;
    }
}