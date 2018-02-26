package sample;


import java.sql.*;



public class DbConnector {

    private Connection loadDb(){

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;

    }




    public void ajouter(String productname, String price, String gain, String daten) {
        try {
            PreparedStatement pstm;
            Connection con = loadDb();
            pstm = con.prepareStatement("insert into products(productname, price, gain, datepurchase) values(?,?,?,?)");
            pstm.setString(1, productname);
            pstm.setString(2, price);
            pstm.setString(3, gain);
            pstm.setString(4, daten);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Bien ajouter..");
    }







}
