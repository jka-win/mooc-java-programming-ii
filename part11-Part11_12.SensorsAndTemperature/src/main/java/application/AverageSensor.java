package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(s -> s.isOn());
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        int value = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        readings.add(value);
        return value;
    }

}
