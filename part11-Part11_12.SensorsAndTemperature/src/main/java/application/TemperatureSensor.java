package application;

public class TemperatureSensor implements Sensor {
    private boolean on;

    public TemperatureSensor() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (!on) {
            throw new IllegalStateException();
        }

        return (int)(Math.random() * 61) - 30;
    }

}
