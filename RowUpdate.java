import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RowUpdate {

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://127.0.0.1:3306/practice", "root", "password");
             Statement statement = conn.createStatement()) {

//            int row = statement.executeUpdate(updateSalaryByName("Sharad", new BigDecimal(999.99)));
            // rows affected
//            System.out.println(row);
        	statement.executeUpdate("UPDATE EMPLOYEE SET SALARY='" + 1000 + "' WHERE NAME='" + "Sharad" + "'");

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    private static String updateSalaryByName(String name, BigDecimal salary) {
//
//        return "UPDATE EMPLOYEE SET SALARY='" + salary + "' WHERE NAME='" + name + "'";
//
//    }
}