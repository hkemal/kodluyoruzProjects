package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_3_Thread_Sleep.lecture_8_2_Runnable_Interface;

public class Counter implements Runnable {

    public String name;
    private Integer id;

    private boolean isRun = true;

    public Counter(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.name + " sayacı başladı.");
        int i = 0;
        while (isRun) {
            System.out.println(this.name + " : " + ++i);
            if (this.id == 1) {
                try {
                    Thread.sleep(100L * this.id);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void stop() {
        this.isRun = false;
    }
}
