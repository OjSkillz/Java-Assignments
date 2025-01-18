public class AirConditioner {
    private boolean isOn = true;
    private int currentTemperature; 
    private final int MAX_TEMPERATURE = 30;
    private final int MIN_TEMPERATURE = 16;

    public boolean turnAcOn() {
        return isOn;
    }

    public boolean turnAcOff() {
        isOn = false;
        return false;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void raiseTemperature() {
        if (currentTemperature < MAX_TEMPERATURE)
            currentTemperature += 1;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void lowerTemperature() {
        if (currentTemperature > MIN_TEMPERATURE)
            currentTemperature -= 1;
    }
}
