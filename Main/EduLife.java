/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class EduLife extends Application {
// Anggota Kelompok CodeCrafter
// Syahid Abdul Azis (22523135)
// Muhammad Dzaky Adrian (22523049)
// Haidar Nadhif Zulfa Azkia (22523267)


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Controller/LoginPage.fxml"));
        
        Scene scene = new Scene(root);
        Image logoImage = new Image("/Image/edulifeLogo.png");
        
        stage.setScene(scene);
        stage.setTitle("EduLife");
        stage.getIcons().add(logoImage);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}