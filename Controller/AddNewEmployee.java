package Controller;

import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

import Model.Database;
import Model.Operation;

public class AddNewEmployee implements Operation {

    @Override
    public void oper(Database database, Scanner scanner) {
        System.out.println("Enter First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.println("Enter Email: ");
        String email = scanner.next();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter Birth Date: ");
        String birthDate = scanner.next();
        System.out.println("Enter Salary (double): ");
        double salary = scanner.nextDouble();
        System.out.println("Enter Department Id (-1 to show all departments): ");
        int departmentId = scanner.nextInt();
        while (departmentId == -1) {
            new ShowAllDepartments().oper(database, scanner);
            System.out.println("Enter Department Id (-1 to show all departments): ");
            departmentId = scanner.nextInt();
        }
        System.out.println("Enter Password ");
        String password = scanner.next();
        System.out.println("Confirm Password: ");
        String confirmPassword = scanner.next();
        while (!password.equals(confirmPassword)) {
            System.out.println("Enter Password ");
            password = scanner.next();
            System.out.println("Confirm Password: ");
            confirmPassword = scanner.next();
        }
        try {
            ResultSet result = database.getStatement()
                    .executeQuery("SELECT COUNT(*) FROM `EMPLOYEE`;");
            result.next();
            int ID = result.getInt("COUNT(*)");

            String insert = "INSERT INTO `EMPLOYEE`"
                    + "(`ID`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `BirthDate`, `Salary`, `Department`, `Password`) VALUES "
                    + "("+ID+",'"+firstName+"','"+lastName+"','"+email+"','"+
                    phoneNumber+"','"+birthDate+"',"+salary+","+departmentId+",'"+
                    password+"');";
            database.getStatement().execute(insert);
            System.out.println("Employee added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
