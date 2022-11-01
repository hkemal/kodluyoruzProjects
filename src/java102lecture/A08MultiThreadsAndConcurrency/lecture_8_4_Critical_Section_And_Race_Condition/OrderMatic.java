package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_4_Critical_Section_And_Race_Condition;

public class OrderMatic implements Runnable {

    private int orderNo;

    private final Object LOCK = new Object();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        increaseOrder();
        //synchronized (LOCK) {
            //this.orderNo++;
            //System.out.println(Thread.currentThread().getName() + " - OrderNo : " + this.orderNo);
        //}
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public synchronized void increaseOrder() {
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " - OrderNo : " + this.orderNo);
    }
}
