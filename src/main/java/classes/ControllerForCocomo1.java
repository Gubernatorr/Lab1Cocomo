package classes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Math.pow;

public class ControllerForCocomo1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Calculate;

    @FXML
    private Button goToCocomo2Button;

    @FXML
    private TextField NumForCalcul;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Text txtPM;

    @FXML
    private Text txtSS;

    @FXML
    private Text txtTM;

    @FXML
    private Text txtP;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        doCalcul(Integer.parseInt(NumForCalcul.getText()));
    }

    @FXML
    void goToCocomo2ButtonPressed(ActionEvent event) {
        openNewScene("/Fxmls/Cocomo2.fxml", goToCocomo2Button);
    }

    double orgA = 2.4, orgB = 1.05, orgC = 2.5, orgD = 0.38;
    double semA = 3.0, semB = 1.12, semC = 2.5, semD = 0.35;
    double embA = 3.6, embB = 1.20, embC = 2.5, embD = 0.31;

    public static double calculPM(double a, int kloc, double b){
        double PM = a * pow(kloc, b);
        return PM;
    }

    public static double calculTM(double PM, double c, double d){
        double TM = c * pow(PM, d);
        return TM;
    }

    public static double calculSS(double PM, double TM){
        double SS = PM / TM;
        return SS;
    }

    public static double calculP(int kloc, double PM){
        double P = kloc / PM;
        return P;
    }

    public void doCalcul(int num){
        int kloc = Integer.parseInt(NumForCalcul.getText());
        switch (choiceBox.getValue()){
            case "Органічний":
                double PM1 = calculPM(orgA, kloc, orgB); txtPM.setText(String.format("%.2f", PM1));
                double TM1 = calculTM(PM1, orgC, orgD); txtTM.setText(String.format("%.2f", TM1));
                double SS1 = PM1 / TM1; txtSS.setText(String.format("%.2f", SS1));
                double P1 = kloc / PM1; txtP.setText(String.format("%.2f", P1));
                break;
            case "Напіврозділений" :
                double PM2 = calculPM(semA, kloc, semB); txtPM.setText(String.format("%.2f", PM2));
                double TM2 = calculTM(PM2, semC, semD); txtTM.setText(String.format("%.2f", TM2));
                double SS2 = PM2 / TM2; txtSS.setText(String.format("%.2f", SS2));
                double P2 = kloc / PM2; txtP.setText(String.format("%.2f", P2));
                break;
            case "Вбудований" :
                double PM3 = calculPM(embA, kloc, embB); txtPM.setText(String.format("%.2f", PM3));
                double TM3 = calculTM(PM3, embC, embD); txtTM.setText(String.format("%.2f", TM3));
                double SS3 = PM3 / TM3; txtSS.setText(String.format("%.2f", SS3));
                double P3 = kloc / PM3; txtP.setText(String.format("%.2f", P3));
                break;


            default: System.out.println("nothing");
        }
    }
    public void getStringsForChoiseBox(ActionEvent event){
        String myChoiseBoxStrings = choiceBox.getValue();
    }

    @FXML
    void initialize() {
        String[] choiseBoxStrings = {"Органічний", "Напіврозділений", "Вбудований"};
        choiceBox.getItems().addAll(choiseBoxStrings);
        choiceBox.setValue("Органічний");
        choiceBox.setOnAction(this::getStringsForChoiseBox);
    }

    public void openNewScene(String window, Button button){
        button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
