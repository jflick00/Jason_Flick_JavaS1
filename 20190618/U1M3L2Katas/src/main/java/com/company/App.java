package com.company;

import java.util.*;

public class App {

    public void printKeys(Map<String, String> brand) {
        Set<String> myKeys = brand.keySet();
        for ( String key: myKeys ) {
            System.out.println(key);
        }
    }

    public void printValues(Map<String, String> year) {
        Collection<String> myValues = year.values();
        for(String value: myValues) {
            System.out.println(value);
        }
    }

    public void printKeysAndValues(Map<String, String> car) {
        for(Map.Entry<String, String> entry: car.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Integer> mapFun(Map<String, Integer> car) {
        Map<String, Integer> cars = new HashMap<>();

        cars.put("Toyota Camry", 2012);
        cars.put("Chevy Camaro", 1969);
        cars.put("Hyundai Genesis", 2015);
        cars.put("Jeep Wrangler", 2003);
        cars.put("Honda Civic", 2018);
        cars.put("Toyota Supra", 1995);
        cars.put("Pontiac GTO", 1964);

        cars.put("Ford Explorer", 2012);
        cars.put("Smart Fortwo", 2013);

        cars.remove("Jeep Wrangler");

        return cars;
    }


}
