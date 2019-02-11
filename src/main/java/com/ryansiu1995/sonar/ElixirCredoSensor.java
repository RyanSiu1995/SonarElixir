package com.ryansiu1995.sonar;

import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

public class ElixirCredoSensor implements Sensor {

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.onlyOnLanguage(ElixirLanguage.LANGUAGE_KEY).name("ElixirCredo").onlyOnFileType(Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        // TODO Use credo to do the analyze
    }
}
