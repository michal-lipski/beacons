package com.pragmatists.beacons;


public class ActivityStore {
    public void save(String region, String deviceName, long timestamp) {
        Activity activity = new Activity(region, deviceName, timestamp);
        new SaveAsyncTask().execute(activity);
    }


}
