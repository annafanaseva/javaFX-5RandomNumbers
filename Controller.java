package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.util.*;

import java.util.ArrayList;

public class Controller {
    public TextField input;
    public TextField input2;
    public Label result;
    public Label error;
    @FXML
    private Button button;

    public ArrayList<String> getPositiveDvoDigitsEvenNum(int min, int max) {
        ArrayList<String> digits = new ArrayList<String>();
        for (int i = min; i <= max; i++){
            if ((i >= 10) && (i <= 100) && (i % 2 == 0)) {
                digits.add(Integer.toString(i));
                error.setText(" ");
            } else {
                error.setText("Некорректный диапазон!");
            }
        }
        return digits;
    }

    @FXML
    public void onClickMethod(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if ((input.getText().length() == 0) || (input2.getText().length() == 0)) {
                    result.setText("Значение не может быть пустым!!!!");
                } else {
                    int value1 = Integer.parseInt(input.getText());
                    int value2 = Integer.parseInt(input2.getText());
                    for(int i = 0; i < 5; i++) {
                        result.setText("Подходящие числа: " + (value1 + (int)(Math.random()*((value2 - value1) + 1))) + " " +
                                (value1 + (int)(Math.random()*((value2 - value1) + 1))) + " " +
                                (value1 + (int)(Math.random()*((value2 - value1) + 1))) + " " +
                                (value1 + (int)(Math.random()*((value2 - value1) + 1))) + " " +
                                (value1 + (int)(Math.random()*((value2 - value1) + 1))));
                    }
                }



            }
        });
    }

}