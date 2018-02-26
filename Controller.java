package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ResourceBundle;



public class Controller {

    @FXML
    public TextField productnamefield;

    @FXML
    public Label daten;

    @FXML
    public TextField pricefield;

    @FXML
    public TextField gainfield;

    @FXML
    public TableView<product> view;

    @FXML
    public TableColumn<product,String> pnamecol;

    @FXML
    public TableColumn<product,String> pricecol;

    @FXML
    public TableColumn<product,String> gaincol;


    /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();*/


    @FXML
    public void addbutton() {

       /* product prod = new product();
         prod.setproductname(productnamefield.getText());
        prod.setprice(productnamefield.getText());
        prod.setgain(productnamefield.getText());
        view.getItems().add(prod);*/
        DbConnector db = new DbConnector();
       String pn =productnamefield.getText();
       String p= pricefield.getText();
       String g = gainfield.getText();
       String d=  pricefield.getText();
        db.ajouter(pn,p,g,d);

    }


   /* @Override
    public void initialize(URL location, ResourceBundle resources) {



        daten.setText(dateFormat.format(date));
        }*/
    }

