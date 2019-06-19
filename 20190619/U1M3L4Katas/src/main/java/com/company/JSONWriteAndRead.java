package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JSONWriteAndRead {
    public static void main(String[] args) {
        PrintWriter writer = null;

        Car cars = new Car();
        cars.setYear(2012);
        cars.setMake("Toyota");
        cars.setModel("Camry");
        cars.setColor("Blue");

        Car cars2 = new Car();
        cars.setYear(2001);
        cars.setMake("Honda");
        cars.setModel("Civic");
        cars.setColor("Silver");

        Car cars3 = new Car();
        cars.setYear(2009);
        cars.setMake("Jeep");
        cars.setModel("Wrangler");
        cars.setColor("Rust");

        Car cars4 = new Car();
        cars.setYear(2018);
        cars.setMake("Tesla");
        cars.setModel("Roadster");
        cars.setColor("Black");

        Car cars5 = new Car();
        cars.setYear(1964);
        cars.setMake("Ford");
        cars.setModel("Mustang");
        cars.setColor("Red");

        List<Car> carsList = new ArrayList<>();

        carsList.add(cars);
        carsList.add(cars2);
        carsList.add(cars3);
        carsList.add(cars4);
        carsList.add(cars5);


        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonCarsList = mapper.writeValueAsString(carsList);

            System.out.println(jsonCarsList);

            writer = new PrintWriter(new FileWriter("carsList.json"));

            writer.println(jsonCarsList);

            carsList = mapper.readValue(new File("carsList.json"), new TypeReference<List<Car>>() {});

            for(Car car: carsList) {
                System.out.println("=================");
                System.out.println(car.getYear());
                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getColor());
            }

        } catch (JsonProcessingException e) {
            System.out.println("ERROR: Trouble converting object to JSON string" + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: Could not write to file: " + e.getMessage());
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());

        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }
}
