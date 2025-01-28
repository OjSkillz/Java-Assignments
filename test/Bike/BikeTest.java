package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bike_exists_andIsOffTest() {
        Bike bike = new Bike();
        assertTrue(bike.isOff());
    }

    @Test
    public void bike_exists_andCanBeTurnedOnTest() {
        Bike bike = new Bike();
        assertTrue(bike.isOff());

        bike.ignite();
        assertFalse(bike.isOff());

    }

    @Test
    public void runningBike_canBeTurnedOffTest() {
        Bike bike = new Bike();
        bike.ignite();
        assertFalse(bike.isOff());

        bike.shutdown();
        assertTrue(bike.isOff());
    }

    @Test
    public void bikeIsOn_initialSpeedIsZero_BikeIsOnGearOneCheck() {
        Bike bike = new Bike();
        bike.ignite();
       assertEquals(0, bike.speed());
       assertEquals(1, bike.gear());
    }

   @Test
   public void bikeIsRunning_gearLevelIsOne_accelerationRaisesSpeedByOneTest(){
        Bike bike = new Bike();
        bike.ignite();
        bike.accelerate(15);
        assertEquals(16, bike.speed());

   }

   @Test
    public void bikeIsAccelerated_gearLevelChangesAutomaticallyTest() {
        Bike bike = new Bike();
        bike.ignite();
        assertEquals(1, bike.gear());

        bike.accelerate(21);
        assertEquals(2, bike.gear());

        bike.accelerate(45);
        assertEquals(4, bike.gear());
   }

   @Test
    public void bikeIsRunning_gearLevelIsTwo_accelerationRaisesSpeedByTwoTest() {
        Bike bike = new Bike();
        bike.ignite();

        bike.accelerate(25);
        assertEquals(27, bike.speed());
   }

   @Test
    public void bikeIsRunning_speedIsLoweredByGearValueOnDecelerationTest() {
        Bike bike = new Bike();
        bike.ignite();
        bike.accelerate(40);

        bike.decelerate();
        assertEquals(39, bike.speed());


   }

   @Test
    public void bikeIsRunning_gearChangesAutomaticallyOnDecelerationTest() {
        Bike bike = new Bike();
        bike.ignite();
        bike.accelerate(35);
        bike.decelerate();

        assertEquals(3, bike.gear());

        bike.decelerate();
        assertEquals(3, bike.gear());
   }

   @Test
   public void bikeIsOnGearOne_speedIsZero_bikeCannotBeDeceleratedTest() {
        Bike bike = new Bike();
        bike.ignite();
        bike.decelerate();

        assertEquals(0, bike.speed());
    }
}
