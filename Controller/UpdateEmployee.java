package Controller;

import java.util.Scanner;

import Model.Database;
import Model.Operation;

public class UpdateEmployee implements Operation {

    private int userID;
    public UpdateEmployee(int userID) {
        this.userID = userID;
    }

    @Override
    public void oper(Database database, Scanner scanner) {
        System.out.println("Enter User ID (-1 to show all employees): ");
        userID = scanner.nextInt();
        while (userID<0){
            new ShowAllEmployees().oper(database, scanner);
            System.out.println("Enter User ID (-1 to show all employees): ");
            userID = scanner.nextInt();
        }
    }

}
