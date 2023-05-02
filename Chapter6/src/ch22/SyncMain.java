package ch22;

class Bank {
    private int money = 10000;

    // synchronized 키워드 사용
    public void saveMoney(int save) {
        int m = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + save);
    }

    public void minusMoney(int minus) {
        int m = getMoney();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {
    public void run() {
        synchronized (SyncMain.myBank) {
            System.out.println("start save");
            SyncMain.myBank.saveMoney(30000);
            System.out.println("SaveMoney(30000) " + SyncMain.myBank.getMoney());
        }
    }
}

class ParkWife extends Thread {
    public void run() {
        synchronized (SyncMain.myBank) {
            System.out.println("start minus");
            SyncMain.myBank.minusMoney(5000);
            System.out.println("minusMoney(10000) " + SyncMain.myBank.getMoney());
        }
    }
}

public class SyncMain {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ParkWife pw = new ParkWife();
        pw.start();
    }
}
