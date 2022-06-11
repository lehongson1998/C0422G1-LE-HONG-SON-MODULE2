package ss4_object_in_java.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {

    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void startTime() {
        startTime = new Date();
    }

    public void stopTime() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        long i, sum = 0;
        StopWatch time = new StopWatch();
        time.startTime();
        System.out.println("Start time:" + time.getStartTime());
        for (i = 0; i < 100000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        time.stopTime();
        System.out.println("end Time:" + time.getEndTime());
        System.out.println("total time: " + time.getElapsedTime() + " millisecond");
    }
}
