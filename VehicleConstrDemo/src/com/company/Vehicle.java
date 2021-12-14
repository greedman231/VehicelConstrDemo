package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed =ms;
        burnup = bu;
    }

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;

    }
}
