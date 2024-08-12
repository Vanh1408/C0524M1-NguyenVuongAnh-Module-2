package xay_dung_lop_stop_watch;

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return this.startTime;
    }

    public long stop() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
