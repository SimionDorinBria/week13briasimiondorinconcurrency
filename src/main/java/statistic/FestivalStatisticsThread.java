package statistic;

import gate.FestivalGate;

public class FestivalStatisticsThread implements Runnable {
    private FestivalGate festivalGate;

    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    public void run() {
        while (true) {
            while (festivalGate.attendeeList != null) {
                festivalGate.printTicketsNumber();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}