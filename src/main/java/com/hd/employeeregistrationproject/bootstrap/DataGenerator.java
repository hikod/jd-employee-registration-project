package com.hd.employeeregistrationproject.bootstrap;

import com.hd.employeeregistrationproject.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployee(){
        return employeeList;
    }
    public static List<String> getAllStates(){

        return Arrays.asList(
                "Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Idaho",
                "Illinois",
                "Indiana",
                "Iowa",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Maine",
                "Maryland",
                "Massachusetts",
                "Michigan",
                "Minnesota",
                "Mississippi",
                "Missouri",
                "Montana",
                "Nebraska",
                "Nevada",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "New York",
                "North Carolina",
                "North Dakota",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Vermont",
                "Virginia",
                "Washington",
                "West Virginia",
                "Wisconsin",
                "Wyoming");
    }

}
