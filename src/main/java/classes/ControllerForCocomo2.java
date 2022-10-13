package classes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static java.lang.Math.pow;

public class ControllerForCocomo2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Calculate;
    @FXML
    private ChoiceBox<String> ACAPchoiceBox;
    @FXML
    private ChoiceBox<String> AEXPchoiceBox;
    @FXML
    private ChoiceBox<String> CPLXchoiceBox;
    @FXML
    private ChoiceBox<String> DATAchoiceBox;
    @FXML
    private ChoiceBox<String> DOCUchoiceBox;
    @FXML
    private ChoiceBox<String> LTEXchoiceBox;
    @FXML
    private ChoiceBox<String> PCAPchoiceBox;
    @FXML
    private ChoiceBox<String> PCONchoiceBox;
    @FXML
    private ChoiceBox<String> PEXPchoiceBox;
    @FXML
    private ChoiceBox<String> PVOLchoiceBox;
    @FXML
    private ChoiceBox<String> RELYchoiceBox;
    @FXML
    private ChoiceBox<String> RUSEchoiceBox;
    @FXML
    private ChoiceBox<String> SCEDchoiceBox;
    @FXML
    private ChoiceBox<String> SITEchoiceBox;
    @FXML
    private ChoiceBox<String> STORchoiceBox;
    @FXML
    private ChoiceBox<String> TIMEchoiceBox;
    @FXML
    private ChoiceBox<String> TOOLchoiceBox;
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private TextField NumForCalcul;

    @FXML
    private Button goToCocomo1Button;

    @FXML
    private Text txtP;

    @FXML
    private Text txtPM;

    @FXML
    private Text txtSS;

    @FXML
    private Text txtTM;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        doCalcul(Integer.parseInt(NumForCalcul.getText()));
    }

    @FXML
    void goToCocomo1ButtonPressed(ActionEvent event) {

    }
    public void getStringsForChoiseBox(ActionEvent event){String myChoiseBoxStrings = choiceBox.getValue();}
    public void getStringsForACAPChoiseBox(ActionEvent event){String myChoiseBoxStrings = ACAPchoiceBox.getValue();}
    public void getStringsForAEXPChoiseBox(ActionEvent event){String myChoiseBoxStrings = AEXPchoiceBox.getValue();}
    public void getStringsForPCAPChoiseBox(ActionEvent event){String myChoiseBoxStrings = PCAPchoiceBox.getValue();}
    public void getStringsForPCONChoiseBox(ActionEvent event){String myChoiseBoxStrings = PCONchoiceBox.getValue();}
    public void getStringsForPEXPChoiseBox(ActionEvent event){String myChoiseBoxStrings = PEXPchoiceBox.getValue();}
    public void getStringsForLTEXChoiseBox(ActionEvent event){String myChoiseBoxStrings = LTEXchoiceBox.getValue();}
    public void getStringsForRELYChoiseBox(ActionEvent event){String myChoiseBoxStrings = RELYchoiceBox.getValue();}
    public void getStringsForDATAChoiseBox(ActionEvent event){String myChoiseBoxStrings = DATAchoiceBox.getValue();}
    public void getStringsForCPLXChoiseBox(ActionEvent event){String myChoiseBoxStrings = CPLXchoiceBox.getValue();}
    public void getStringsForRUSEChoiseBox(ActionEvent event){String myChoiseBoxStrings = RUSEchoiceBox.getValue();}
    public void getStringsForDOCUChoiseBox(ActionEvent event){String myChoiseBoxStrings = DOCUchoiceBox.getValue();}
    public void getStringsForTIMEChoiseBox(ActionEvent event){String myChoiseBoxStrings = TIMEchoiceBox.getValue();}
    public void getStringsForSTORChoiseBox(ActionEvent event){String myChoiseBoxStrings = STORchoiceBox.getValue();}
    public void getStringsForPVOLChoiseBox(ActionEvent event){String myChoiseBoxStrings = PVOLchoiceBox.getValue();}
    public void getStringsForTOOLChoiseBox(ActionEvent event){String myChoiseBoxStrings = TOOLchoiceBox.getValue();}
    public void getStringsForSITEChoiseBox(ActionEvent event){String myChoiseBoxStrings = SITEchoiceBox.getValue();}
    public void getStringsForSCEDChoiseBox(ActionEvent event){String myChoiseBoxStrings = SCEDchoiceBox.getValue();}

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

    // PM = EAF * A* (SIZE)^E
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

    @FXML
    void initialize() {
        String[] choiseBoxStrings1 = {"Органічний", "Напіврозділений", "Вбудований"};
        choiceBox.getItems().addAll(choiseBoxStrings1);
        choiceBox.setValue("Органічний");
        choiceBox.setOnAction(this::getStringsForChoiseBox);

        String[] choiseBoxStrings2 = {"Very Low", "Low", "Nominal", "High",  "Very High",  "Extra High"};
        ACAPchoiceBox.getItems().addAll(choiseBoxStrings2); ACAPchoiceBox.setValue("Nominal");
        AEXPchoiceBox.getItems().addAll(choiseBoxStrings2); AEXPchoiceBox.setValue("Nominal");
        PCAPchoiceBox.getItems().addAll(choiseBoxStrings2); PCAPchoiceBox.setValue("Nominal");
        PCONchoiceBox.getItems().addAll(choiseBoxStrings2); PCONchoiceBox.setValue("Nominal");
        PEXPchoiceBox.getItems().addAll(choiseBoxStrings2); PEXPchoiceBox.setValue("Nominal");
        LTEXchoiceBox.getItems().addAll(choiseBoxStrings2); LTEXchoiceBox.setValue("Nominal");
        RELYchoiceBox.getItems().addAll(choiseBoxStrings2); RELYchoiceBox.setValue("Nominal");
        DATAchoiceBox.getItems().addAll(choiseBoxStrings2); DATAchoiceBox.setValue("Nominal");
        CPLXchoiceBox.getItems().addAll(choiseBoxStrings2); CPLXchoiceBox.setValue("Nominal");
        RUSEchoiceBox.getItems().addAll(choiseBoxStrings2); RUSEchoiceBox.setValue("Nominal");
        DOCUchoiceBox.getItems().addAll(choiseBoxStrings2); DOCUchoiceBox.setValue("Nominal");
        TIMEchoiceBox.getItems().addAll(choiseBoxStrings2); TIMEchoiceBox.setValue("Nominal");
        STORchoiceBox.getItems().addAll(choiseBoxStrings2); STORchoiceBox.setValue("Nominal");
        PVOLchoiceBox.getItems().addAll(choiseBoxStrings2); PVOLchoiceBox.setValue("Nominal");
        TOOLchoiceBox.getItems().addAll(choiseBoxStrings2); TOOLchoiceBox.setValue("Nominal");
        SITEchoiceBox.getItems().addAll(choiseBoxStrings2); SITEchoiceBox.setValue("Nominal");
        SCEDchoiceBox.getItems().addAll(choiseBoxStrings2); SCEDchoiceBox.setValue("Nominal");

        ACAPchoiceBox.setOnAction(this::getStringsForACAPChoiseBox);
        AEXPchoiceBox.setOnAction(this::getStringsForAEXPChoiseBox);
        PCAPchoiceBox.setOnAction(this::getStringsForPCAPChoiseBox);
        PCONchoiceBox.setOnAction(this::getStringsForPCONChoiseBox);
        PEXPchoiceBox.setOnAction(this::getStringsForPEXPChoiseBox);
        LTEXchoiceBox.setOnAction(this::getStringsForLTEXChoiseBox);
        RELYchoiceBox.setOnAction(this::getStringsForRELYChoiseBox);
        DATAchoiceBox.setOnAction(this::getStringsForDATAChoiseBox);
        CPLXchoiceBox.setOnAction(this::getStringsForCPLXChoiseBox);
        RUSEchoiceBox.setOnAction(this::getStringsForRUSEChoiseBox);
        DOCUchoiceBox.setOnAction(this::getStringsForDOCUChoiseBox);
        TIMEchoiceBox.setOnAction(this::getStringsForTIMEChoiseBox);
        STORchoiceBox.setOnAction(this::getStringsForSTORChoiseBox);
        PVOLchoiceBox.setOnAction(this::getStringsForPVOLChoiseBox);
        TOOLchoiceBox.setOnAction(this::getStringsForTOOLChoiseBox);
        SITEchoiceBox.setOnAction(this::getStringsForSITEChoiseBox);
        SCEDchoiceBox.setOnAction(this::getStringsForSCEDChoiseBox);



    }

}
