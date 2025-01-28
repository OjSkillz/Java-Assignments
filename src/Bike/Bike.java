package Bike;

public class Bike {
    private boolean isOff = true;
    private int currentSpeed;
    private int gear = 1;

    public boolean isOff() {
        return isOff;
    }

    public void ignite() {
        isOff = false;
    }

    public void shutdown() {
        isOff = true;
    }

    public int speed() {
        return currentSpeed;
    }

    public int gear() {
        return gear;
    }


    public void accelerate(int currentSpeed) {
        if (currentSpeed > 20)
            gear = switchGear(currentSpeed);
        currentSpeed += gear;
        this.currentSpeed = currentSpeed;
    }

    private int switchGear(int currentSpeed) {
       if (currentSpeed > 20 && currentSpeed <= 30) gear = 2;
       else if (currentSpeed > 30 && currentSpeed <= 40) gear = 3;
       else if (currentSpeed > 40) gear = 4;
       return gear;
    }

    public void decelerate() {
        if (speed() == 0) return;
        if (currentSpeed > 21)
            gear = switchGear(currentSpeed);
        currentSpeed -= gear;

    }
}
