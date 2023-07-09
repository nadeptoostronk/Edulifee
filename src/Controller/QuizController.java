package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText("1. Apakah iklim sama dengan cuaca?");
            opt1.setText("Ya");
            opt2.setText("Tidak");
            opt3.setText("Bisa jadi");
            opt4.setText("Mungkin");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Berapa jumlah definisi cuaca?");
            opt1.setText("1");
            opt2.setText("2");
            opt3.setText("3");
            opt4.setText("4");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Konsep abstrak yang menyatakan kebiasaan cuaca, adalah pendapat dari?");
            opt1.setText("World Climate Conference");
            opt2.setText("Syahid Abdul Azis");
            opt3.setText("Gibbs");
            opt4.setText(" Glenn T. Trewartha");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Ilmu yang mempelajari seluk beluk tentang cuaca disebut..");
            opt1.setText("Iklimonologi");
            opt2.setText("Klimatologi");
            opt3.setText("Meteorologi");
            opt4.setText("Semua salah");
        }
        if (counter == 4) {//Question 5
            question.setText("5. Ilmu yang mempelajari seluk beluk tentang iklim disebut..");
            opt1.setText("Iklimonologi");
            opt2.setText("Klimatologi");
            opt3.setText("Meteorologi");
            opt4.setText("Semua salah");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Istilah perubahan iklim sering digunakan secara tertukar dengan istilah");
            opt1.setText("Pendinginan olahraga");
            opt2.setText("Pendinginan global");
            opt3.setText("Pemanasan olahraga");
            opt4.setText("Pemanasan global");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Apa saja yang termasuk parameter iklim?");
            opt1.setText("Presipitasi");
            opt2.setText("Kondisi awan");
            opt3.setText("Radiasi matahari");
            opt4.setText("Semua benar");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Berapa tahun tercatat adanya 12 tahun terpanas berdasarkan data temperatur permukaan global sejak tahun 1850?");
            opt1.setText("2006");
            opt2.setText("2007");
            opt3.setText("2008");
            opt4.setText("2005");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Yang bukan penyebab pemanasan global?");
            opt1.setText("Peningkatan intensitas badai tropis");
            opt2.setText("Perubahan pola presipitasi");
            opt3.setText("Salinitas air laut");
            opt4.setText("Semua salah");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Level dari pertanyaan ini?");
            opt1.setText("Sangat mudah");
            opt2.setText("Mudah");
            opt3.setText("Sedang");
            opt4.setText("Sulit");
        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("Tidak")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("3")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Glenn T. Trewartha")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Meteorologi")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Klimatologi")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Pemanasan global")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Semua benar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("2007")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Semua salah")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Sangat mudah")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}

