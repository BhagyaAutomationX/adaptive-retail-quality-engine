package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseValidator {

    public static void validateCustomerRecords() {

        try {

            Connection retailDatabaseConnection =
                    DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "password");

            Statement databaseStatement =
                    retailDatabaseConnection
                    .createStatement();

            ResultSet customerRecords =
                    databaseStatement.executeQuery(
                    "select * from users");

            while(customerRecords.next()) {

                System.out.println(
                        customerRecords.getString(1));
            }

            retailDatabaseConnection.close();
        }

        catch(Exception exceptionObject) {

            System.out.println(exceptionObject);
        }
    }
}