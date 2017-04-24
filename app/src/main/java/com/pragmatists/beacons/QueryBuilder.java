package com.pragmatists.beacons;

public class QueryBuilder {


    public String activitySaveUrl()
    {
        return "https://api.mongolab.com/api/1/databases/activity/collections/activity?apiKey=fAFYHFX-zzbdaproNOZHu4tvqLVTq8Lw";
    }


    public String createActivity(Activity activity)
    {
        return String
                .format("{\"document\" : {\"name\": \"%s\", " + "\"region\": \"%s\", \"timestamp\": \"%s\", }, \"safe\" : true}",
                        activity.name, activity.region, activity.timestamp);
    }

}