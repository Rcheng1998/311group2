/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 *
 * @author nit6l
 */
public class NavUIController implements Initializable {
    
    @FXML private ListView ticketList;
    @FXML private ListView categoryList;
    @FXML private Button leftTicketButton;
    @FXML private Button leftCategoryButton;
    @FXML private Button leftUsersButton;
    @FXML private Button leftRoadButton;
    @FXML private Button addCategoryButton;
    @FXML private Button editCategoryButton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML protected void leftTicketPressed(ActionEvent event) throws IOException
    {
        
    }
    public void leftCategoryPressed(ActionEvent event) throws IOException{
            URL url = new File("src/sprint1/CategoryUI.fxml").toURI().toURL();
            Stage categoryStage = new Stage();
            Parent categoryParent = FXMLLoader.load(url);
            Scene scene = new Scene(categoryParent, 850, 500);
            categoryStage.setTitle("Category");
            categoryStage.setScene(scene);
            categoryStage.show();  
            ticketList.getScene().getWindow().hide();
            System.out.println("Authenticated");
    }
    
    @FXML protected void leftUserPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void leftRoadPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void addCategoryPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void editCategoryPressed(ActionEvent event) throws IOException
    {
        
    }
}
