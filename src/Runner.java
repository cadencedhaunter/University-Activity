
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Runner {
    public static void main(final String[] args) {
        try {
            Connection connection;
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:c:\\dev\\sqlite\\comexpenses.db");
            final Statement statement = connection.createStatement();
            System.out.println("'Add' - add new resource");
            System.out.println("'Show' - show all resources");
            System.out.println("'Exit' - show all resources");
            final Scanner sc = new Scanner(System.in);
            String mes;
            switch (sc.next()) {
                case "Add":
                    System.out.println("Resource:");
                    final String forRes = sc.next();
                    System.out.println("Month:");
                    final String forMonth = sc.next();
                    System.out.println("Year:");
                    final String forYear = sc.next();
                    System.out.println("Money:");
                    final String forMoney = sc.next();
                    mes = "INSERT INTO util (Res,Month,Year,Money) " + "VALUES ('" + forRes + "', '"
                            + forMonth + "', '" + forYear + "', '" + forMoney + "')";
                    statement.executeUpdate(mes);
                    System.out.println("Resource was added");
                    break;
                case "Show":
                    mes = "Select Res,Month,Year,Money " + "From util " + "ORDER BY Year ";
                    final ResultSet rs = statement.executeQuery(mes);
                    String forOutPut = "";
                    while (rs.next()) {
                        forOutPut += "Resource - " + rs.getString("Res") + "; Month - "
                                + rs.getString("Month") + "; Year - " + rs.getString("Year")
                                + "; Money - " + rs.getString("Money") + "\n";
                    }
                    System.out.println(forOutPut);
                    rs.close();
                    break;
                case "Exit":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Incorrect value");
            }
            statement.close();
        } catch (final ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (final SQLException e) {
            System.out.println("SQLException");
        }
    }
}
