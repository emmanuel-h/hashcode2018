package hashcode;

public class Ride {
    private int startR;
    private int startC;
    private int stopR;
    private int stopC;
    private int start;
    private int finish;
    private Vehicle vehicle;

    public Ride(){

    }

    public Ride(int startR, int startC, int stopR, int stopC, int start, int finish) {
        this.startR = startR;
        this.startC = startC;
        this.stopR = stopR;
        this.stopC = stopC;
        this.start = start;
        this.finish = finish;
    }

    public Ride(int startR, int startC, int stopR, int stopC, int start, int finish, Vehicle vehicle) {
        this.startR = startR;
        this.startC = startC;
        this.stopR = stopR;
        this.stopC = stopC;
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public int getStartR() {
        return startR;
    }

    public void setStartR(int startR) {
        this.startR = startR;
    }

    public int getStartC() {
        return startC;
    }

    public void setStartC(int startC) {
        this.startC = startC;
    }

    public int getStopR() {
        return stopR;
    }

    public void setStopR(int stopR) {
        this.stopR = stopR;
    }

    public int getStopC() {
        return stopC;
    }

    public void setStopC(int stopC) {
        this.stopC = stopC;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
