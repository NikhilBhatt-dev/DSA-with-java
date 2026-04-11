package interfaces;

public class Car implements Engine, Break {

    @Override
    public void start() {
        System.out.println("I start the normal car");
        // Implementation for starting the engine
    }

    @Override
    public void stop() {
        System.out.println("I stop the normal car");
        // Implementation for stopping the engine
    }

    @Override
    public void acc() {
        System.out.println("I accelerate the normal car");
        // Implementation for accelerating the engine
    }

    @Override
    public void brake() {
        System.out.println("I apply the brake");

        // Implementation for applying the brake
    }
}
