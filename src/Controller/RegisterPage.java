package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.net.URL;
import java.util.ResourceBundle;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class RegisterPage implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button loginrButton;

    @FXML
    private TextField email;

    @FXML
    private TextField username;

    @FXML
    private TextField password;
    AllAccount akunsemua = new AllAccount();
    

    @FXML
    public void LoginPage(ActionEvent event) throws IOException{
         createAccount();

         xmlupdate();

        // Show account creation notification
        showNotification("Akun anda telah berhasil dibuat!");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

     private void createAccount() {

        Account tmp = new Account();

        tmp.setEmail(email.getText());


        tmp.setUsername(username.getText());
        tmp.setPassword(password.getText());
        akunsemua.getEdulifeAccounts().add(tmp);

        // Implement your account creation logic here
    }

     private void showNotification(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Register");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void updateusernow() {
    
        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.processAnnotations(Account.class);
        xstream.processAnnotations(AllAccount.class);
        xstream.ignoreUnknownElements();
        FileInputStream getFile = null;
        String readXML = "";
        try {
            getFile = new FileInputStream("src/Controller/account.xml");
            readXML = xmlToString(getFile);
        } catch (Exception e) {
            System.err.println("Perhatian:"  + e.getMessage());
        } finally {
            if (getFile != null) {
                try {
                    getFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        AllAccount datatmp = (AllAccount) xstream.fromXML(readXML);
        akunsemua = datatmp;
        
    
        
        
    }
    
    public static String xmlToString(FileInputStream xmlFile) {
       int isiFile;
       char myChar;
       String myString = "";
       try {
          while ((isiFile = xmlFile.read()) != -1) {
               myChar = (char) isiFile;
               myString = myString + myChar;
          }
       } catch (IOException e) {
          e.printStackTrace();
       }
       return myString;
    }
    
    @FXML
    private void xmlupdate() {
    
        XStream xstream = new XStream(new StaxDriver());
       xstream.processAnnotations(Account.class);
        xstream.processAnnotations(AllAccount.class);
    
       
        AllAccount datain = new AllAccount();
    
        datain = akunsemua;
    
    
    
    
        String xml = xstream.toXML(datain);
        FileOutputStream myFile = null;
        try {
            String folderPath = "src/Controller";
                String fileName = "account.xml";
                String filePath = folderPath + File.separator + fileName;
            myFile = new FileOutputStream(filePath);
            byte[] bytes = xml.getBytes("UTF-8");
            myFile.write(bytes);
        } catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } finally {
            if (myFile != null) {
                try {
                    myFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
       
    
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateusernow();
 
    }
}
