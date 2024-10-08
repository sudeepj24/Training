package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class fileio {
    public static void main(String[] args) {
        String filePath = "D://Revature//Training//Day 05//employees.txt";
        HashMap<String, Employee> employeeMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Tokenize the line
                StringTokenizer tokenizer = new StringTokenizer(line, ":");
                if (tokenizer.countTokens() == 4) {
                    String employeeId = tokenizer.nextToken();
                    String firstName = tokenizer.nextToken();
                    String lastName = tokenizer.nextToken();
                    String role = tokenizer.nextToken();

                    // Create an Employee object
                    Employee employee = new Employee(employeeId, firstName, lastName, role);

                    // Store the object in the HashMap
                    employeeMap.put(employeeId, employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the HashMap content
        for (String key : employeeMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + employeeMap.get(key));
        }
    }
}
