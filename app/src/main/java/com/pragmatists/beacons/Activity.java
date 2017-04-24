package com.pragmatists.beacons;



public class Activity {
    public String name;
    public String timestamp;
    public String region;

    public Activity(String deviceName, String region, long timestamp) {
        name = deviceName;
        this.region = region;
        this.timestamp = String.valueOf(timestamp);
    }
}
