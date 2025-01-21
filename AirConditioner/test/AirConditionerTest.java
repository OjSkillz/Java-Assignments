import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void test() {
        AirConditioner airConditioner = new AirConditioner();
    }
    @Test
    public void testThatAirConditionerCanBeTurnedOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOff();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void testThatAcCanRaiseTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(20);
        airConditioner.raiseTemperature();
        assertEquals(21, airConditioner.getCurrentTemperature());

    }

    @Test
    public void testThatAcCanLowerTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(20);
        airConditioner.lowerTemperature();
        assertEquals(19, airConditioner.getCurrentTemperature());
    }

    @Test
    public void testThatAcTemperatureCannotGoBeyond30() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(30);
        airConditioner.raiseTemperature();
        assertEquals(30, airConditioner.getCurrentTemperature());
    }

    @Test
    public void testThatAcTemperatureCannotGoBelow16() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(16);
        airConditioner.lowerTemperature();
        assertEquals(16, airConditioner.getCurrentTemperature());
    }

    @Test
    public void testThatACTemperatureCannotBeRaisedWhenAcIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(20);
        airConditioner.turnAcOff();
        airConditioner.raiseTemperature();

        assertEquals(20, airConditioner.getCurrentTemperature());

    }

    @Test
    public void testThatTemperatureCannotBeLoweredWhenAcIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnAcOn();
        airConditioner.setCurrentTemperature(20);
        airConditioner.turnAcOff();
        airConditioner.lowerTemperature();

        assertEquals(20, airConditioner.getCurrentTemperature());
    }


}
