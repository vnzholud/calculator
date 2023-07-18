package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    String numbe1;
    String number2;
    String oper ="";
    Boolean clickOper = false;

    @FXML
    public TextField mainTextField;


    @FXML
    public void butClickUmn() {
        oper = "*";
       vvodA();

    }

    @FXML
    public void butClickSum() {
        oper = "+";
        vvodA();

    }

    @FXML
    public void Min() {
        oper = "-";
        vvodA();
    }

    @FXML
    public void butClickDel() {
        oper = "/";
        vvodA();
    }

    @FXML
    public void butClickAC() {
        mainTextField.setText(" ");
    }


    public void butClickRez() {
        Float a;
        Float b;


        vvodb();

        a = new Float(numbe1);
        b = new Float(number2);



        Calculation calculation = new Calculation(a, b, oper);


        mainTextField.appendText(calculation.operaton());

    }

    @FXML
    public void butClick9() {
        mainTextField.appendText("9");
    }

    @FXML
    public void butClick8() {
        mainTextField.appendText("8");
    }

    @FXML
    public void butClick7() {
        mainTextField.appendText("7");
    }

    @FXML
    public void butClick4() {
        mainTextField.appendText("4");
    }
    @FXML
    public void butClick5() {
        mainTextField.appendText("5");
    }
    @FXML
    public void butClick6() {
        mainTextField.appendText("6");
    }

    @FXML
    public void butClick1() {
        mainTextField.appendText("1");
    }
    @FXML
    public void butClick2() {
        mainTextField.appendText("2");
    }
    @FXML
    public void butClick3() {
        mainTextField.appendText("3");
    }

    @FXML
    public void butClick0() {
        mainTextField.appendText("0");
    }
    @FXML
    public void butClickZ() {
        mainTextField.appendText(".");
    }



    public void butClick() {
    }

    public void vvodA(){
        if(!clickOper){
            numbe1 = mainTextField.getText();
            mainTextField.setText(" ");
            clickOper = true;
 
        }
    }

    public void vvodb(){
        number2 = mainTextField.getText();
        mainTextField.setText(" ");
        clickOper = false;




    }

}
