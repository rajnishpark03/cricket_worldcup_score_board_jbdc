import java.sql.*;
import java.util.*;

public class Main {
    private static final String url="jdbc:mysql://127.0.0.1:3306/cricket";
    private static final String userid="root";
    private static final String password="Anjurajnish12@";

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection( url, userid, password );
            Statement st=connection.createStatement();
            boolean flag=true;
            while (flag){
                System.out.println("Enter the choice: ");
                System.out.println("1. View The Score Table");
                System.out.println("2. Insert the new record");
                System.out.println("3. Update the record ");
                System.out.println("4. Delete the record");
                System.out.println("5. Exit");
                int choice =sc.nextInt();

                switch (choice){
                    case 1:
                        String sql ="select * from scoretable;";
                        ResultSet rs = st.executeQuery(sql);

                        System.out.println("ID\t | NAME\t | RUNS\t | BALLS\t");
                        System.out.println("-------------------------------------");

                        while (rs.next()){
                            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+ rs.getInt(3)+"\t"+ rs.getInt(4));

                        }
                        break;

                    case 2:
                        System.out.println("Enter the id :");
                        int id= sc.nextInt();
                        System.out.println("Enter the name of the player: ");
                        String str= sc.next();
                        System.out.println("Enter the runs scored: ");
                        int runs= sc.nextInt();
                        System.out.println("In How Many Balls: ");
                        int balls =sc.nextInt();

                        String updateQuery= "INSERT into scoretable VALUE("+id+",    '"+str+"',    "+runs+",   "+balls+");";
                        int rows = st.executeUpdate(updateQuery);
                        System.out.println(rows+"rows inserted");
                        System.out.println("-------------------------------------");
                        break;

                    case 3:
                        System.out.println("Enter the id of the player: ");
                         id= sc.nextInt();
                        System.out.println("Enter new Balls  ");
                         runs = sc.nextInt();
                        System.out.println("New Runs ? ");
                         balls = sc.nextInt();
                         updateQuery = "UPDATE scoretable set balls = "+balls+" , runs = "+runs+"   WHERE id = "+id+" ; " ;

                         rows=st.executeUpdate(updateQuery);
                        System.out.println(rows+"rows updated");
                        System.out.println("-------------------------------------");

                        break;

                    case 4:
                        System.out.println("Enter The id of the player: ");
                        id= sc.nextInt();
                        String deleteQuery = "DELETE from scoretable where id ="+id+"; ";
                        rows= st.executeUpdate(deleteQuery);
                        System.out.println(rows+"rows updated");
                        System.out.println("-------------------------------------");
                        break;

                    default:
                        flag = false;
                        break;


                }




            }



        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }



    }
}