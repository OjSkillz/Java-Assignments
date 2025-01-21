public class AirConditioner {
    private boolean isOn;
    private int currentTemperature; 
    private final int MAX_TEMPERATURE = 30;
    private final int MIN_TEMPERATURE = 16;

    public void turnAcOn() {
         isOn = true;
    }

    public void turnAcOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void raiseTemperature() {
        if (currentTemperature < MAX_TEMPERATURE && isOn)
            currentTemperature += 1;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void lowerTemperature() {
        if (isOn && currentTemperature > MIN_TEMPERATURE)
            currentTemperature -= 1;
    }
}
