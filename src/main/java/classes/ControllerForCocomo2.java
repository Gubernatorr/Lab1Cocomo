package classes;

import java.lang.reflect.Array;
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
    private ChoiceBox<String> PRECchoiceBox;
    @FXML
    private ChoiceBox<String> FLEXchoiceBox;
    @FXML
    private ChoiceBox<String> RESLchoiceBox;
    @FXML
    private ChoiceBox<String> TEAMchoiceBox;
    @FXML
    private ChoiceBox<String> PMATchoiceBox;
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
    private Text txtPM1;
    @FXML
    private ChoiceBox<String> choiceBox;
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

    double[] ACAPvalues = {1.42, 1.29, 1.00, 0.85, 0.71, 1.00};
    double[] AEXPvalues = {1.22, 1.10, 1.00, 0.88, 0.81, 1.00};
    double[] PCAPvalues = {1.34, 1.15, 1.00, 0.88, 0.76, 1.00};
    double[] PCONvalues = {1.29, 1.12, 1.00, 0.90, 0.81, 1.00};
    double[] PEXPPvalues = {1.19, 1.09, 1.00, 0.91, 0.85, 1.00};
    double[] LTEXvalues = {1.20, 1.09, 1.00, 0.91, 0.84, 1.00};

    double[] RELYvalues = {0.84, 0.92, 1.00, 1.10, 1.26, 1.00};
    double[] DATAvalues = {1.00, 0.23, 1.00, 1.14, 1.28, 1.00};
    double[] CPLXvalues = {0.73, 0.87, 1.00, 1.17, 1.34, 1.74};
    double[] RUSEvalues = {1.00, 0.95, 1.00, 1.07, 1.15, 1.24};
    double[] DOCUvalues = {0.81, 1.91, 1.00, 1.11, 1.23, 1.00};

    double[] TIMEvalues = {1.00, 1.00, 1.00, 1.11, 1.29, 1.63};
    double[] STORvalues = {1.00, 1.00, 1.00, 1.05, 1.17, 1.46};
    double[] PVOLvalues = {1.00, 0.87, 1.00, 1.15, 1.30, 1.00};

    double[] TOOLvalues = {1.17, 1.09, 1.00, 0.90, 0.78, 1.00};
    double[] SITEvalues = {1.22, 1.09, 1.00, 0.93, 0.86, 0.80};
    double[] SCEDvalues = {1.43, 1.14, 1.00, 1.00, 1.00, 1.00};

    double[] PRECvalues = {6.20, 4.96, 3.72, 2.48, 1.24, 0.00};
    double[] FLEXvalues = {5.07, 4.05, 3.04, 2.03, 1.01, 0.00};
    double[] RESLvalues = {7.07, 5.65, 4.24, 2.83, 1.41, 0.00};
    double[] TEAMvalues = {5.48, 4.38, 3.29, 2.19, 1.10, 0.00};
    double[] PMATvalues = {7.80, 6.24, 4.68, 3.12, 1.56, 0.00};
    double orgA = 2.4, orgB = 1.05, orgC = 2.5, orgD = 0.38;
    double semA = 3.0, semB = 1.12, semC = 2.5, semD = 0.35;
    double embA = 3.6, embB = 1.20, embC = 2.5, embD = 0.31;

    public static double calculPM(double a, int kloc, double b){ double PM = a * pow(kloc, b); return PM;}
    public static double calculTM(double PM, double c, double d){ double TM = c * pow(PM, d); return TM;}
    public static double calculSS(double PM, double TM){double SS = PM / TM; return SS;}
    public static double calculP(int kloc, double PM){ double P = kloc / PM; return P;}

    public static double getNumOfLevels(ChoiceBox<String> choiceBox, double[] values){
        double num = 0.00;
        switch (choiceBox.getValue()){
            case "Very Low": num = values[0]; break;
            case "Low" :num = values[1]; break;
            case "Nominal" :num = values[2]; break;
            case "High" :num = values[3]; break;
            case "Very High" :num = values[4]; break;
            case "Extra High" :num = values[5]; break;
            default:
                System.out.println("No choice");
        }
        return num;
    }

    public double calculEAF(){
        double EAF = 0.00;

        double num1 = getNumOfLevels(ACAPchoiceBox, ACAPvalues);
        double num2 = getNumOfLevels(AEXPchoiceBox, AEXPvalues);
        double num3 = getNumOfLevels(PCAPchoiceBox, PCAPvalues);
        double num4 = getNumOfLevels(PCONchoiceBox, PCONvalues);
        double num5 = getNumOfLevels(PEXPchoiceBox, PEXPPvalues);
        double num6 = getNumOfLevels(LTEXchoiceBox, LTEXvalues);

        double num7 = getNumOfLevels(RELYchoiceBox, RELYvalues);
        double num8 = getNumOfLevels(DATAchoiceBox, DATAvalues);
        double num9 = getNumOfLevels(CPLXchoiceBox, CPLXvalues);
        double num10 = getNumOfLevels(RUSEchoiceBox, RUSEvalues);
        double num11 = getNumOfLevels(DOCUchoiceBox, DOCUvalues);

        double num12 = getNumOfLevels(TIMEchoiceBox, TIMEvalues);
        double num13 = getNumOfLevels(STORchoiceBox, STORvalues);
        double num14 = getNumOfLevels(PVOLchoiceBox, PVOLvalues);

        double num15 = getNumOfLevels(TOOLchoiceBox, TOOLvalues);
        double num16 = getNumOfLevels(SITEchoiceBox, SITEvalues);
        double num17 = getNumOfLevels(SCEDchoiceBox, SITEvalues);

        EAF = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10 * num11 * num12 * num13 * num14 * num15 * num16 * num17;

        return EAF;
    }

    public double calculE(){
        double num1 = getNumOfLevels(PRECchoiceBox, PRECvalues);
        double num2 = getNumOfLevels(FLEXchoiceBox, FLEXvalues);
        double num3 = getNumOfLevels(RESLchoiceBox, RESLvalues);
        double num4 = getNumOfLevels(TEAMchoiceBox, TEAMvalues);
        double num5 = getNumOfLevels(PMATchoiceBox, PMATvalues);

        double E = 0.91 + 0.01 * (num1 + num2 + num3 + num4 + num5);
        return E;
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

        double EAF = calculEAF();
        double E = calculE();
        double PM1 = EAF * 2.94 * pow(kloc, E);
        txtPM1.setText(String.format("%.2f", PM1));
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
        PRECchoiceBox.getItems().addAll(choiseBoxStrings2); PRECchoiceBox.setValue("Nominal");
        FLEXchoiceBox.getItems().addAll(choiseBoxStrings2); FLEXchoiceBox.setValue("Nominal");
        RESLchoiceBox.getItems().addAll(choiseBoxStrings2); RESLchoiceBox.setValue("Nominal");
        TEAMchoiceBox.getItems().addAll(choiseBoxStrings2); TEAMchoiceBox.setValue("Nominal");
        PMATchoiceBox.getItems().addAll(choiseBoxStrings2); PMATchoiceBox.setValue("Nominal");

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
        PRECchoiceBox.setOnAction(this::getStringsForSTORChoiseBox);
        FLEXchoiceBox.setOnAction(this::getStringsForPVOLChoiseBox);
        RESLchoiceBox.setOnAction(this::getStringsForTOOLChoiseBox);
        TEAMchoiceBox.setOnAction(this::getStringsForSITEChoiseBox);
        PMATchoiceBox.setOnAction(this::getStringsForSCEDChoiseBox);



    }

}
