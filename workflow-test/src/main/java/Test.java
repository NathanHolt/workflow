public class Test {


    public static void main(String[] args) throws InterruptedException {
        RunnyBoi test1 = new RunnyBoi(1);
        RunnyBoi test2 = new RunnyBoi(2);

        test1.start();
        test2.start();

        try {
            test1.sleep(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("number 1");


        long counter = 1;
        for (int i = 0; i < 100 * 9999999; i++) {
            counter = counter + counter;
        }

        System.out.println(test1.num);
        System.out.println(test2.num);

    }
}

class RunnyBoi extends Thread {
    public int num = 5;

    public RunnyBoi(int i) {
        num = i;
    }

    public void run() {
        System.out.println("number 2 " + num);

        long counter = 1;
        for (int i = 0; i < 100 * 9999999; i++) {
            counter = counter + counter;
        }

        System.out.println("number 3 " + num);

        num = num * 25;
    }
}