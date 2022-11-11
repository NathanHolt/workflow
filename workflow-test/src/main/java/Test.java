public class Test {


    public static void main(String[] args) {
        RunnyBoi test = new RunnyBoi();

        test.start();

        System.out.println("number 1");

        System.out.println(RunnyBoi.num);

        long counter = 1;
        for (int i = 0; i < RunnyBoi.num * 9999999; i++) {
            counter = counter + counter;
        }

        System.out.println(RunnyBoi.num);
    }
}

class RunnyBoi extends Thread {
    static int num = 5;

    public void run() {
        System.out.println("number 2");

        long counter = 1;
        for (int i = 0; i < RunnyBoi.num * 9999999; i++) {
            counter = counter + counter;
        }

        System.out.println("number 3");

        num = num * 25;
    }
}