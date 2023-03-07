package yanghang.li;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {
    String firstNumber = "";
    String secondNumber = "";
    String character = "";
    static boolean flag2 = false;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(2, 2, 2, 2));

        TextField textField = new TextField("");
        textField.setFont(new Font(35));
        pane.setTop(textField);

        // grid， lay up button
        GridPane pane2 = new GridPane();
        pane2.setAlignment(Pos.CENTER);
        pane2.setHgap(10);
        pane2.setVgap(10);

        String[] buttonNames = { "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "C", "0", "+", "-", "=" };
        Button[] b = new Button[buttonNames.length]; //Button array
        int col = 0, line = 0;      // column， line

        for (int i = 0; i < buttonNames.length; i++) {
            b[i] = new Button(buttonNames[i]);      //Create button
            pane2.add(b[i], col++, line);           //Add to grid panel

            b[i].setOnAction(e -> {
                String s = ((Button)(e.getSource())).getText(); //Take out the text of the button
                switch (s) {
                    case "*" :
                    case "/" :
                    case "+" :
                    case "-" :
                        if(firstNumber.equals("")) {
                            if(s.equals("*") || s.equals("/")) {
                                textField.setText("Please enter firstNumber!");
                            } else {
                                firstNumber += s;
                                textField.setText(firstNumber);
                            }
                        } else {
                            flag2 = false;
                            character = s;
                            textField.setText(firstNumber + s);
                            secondNumber = "";
                        }
                        break;
                    case "C" :
                        firstNumber = "";
                        secondNumber = "";
                        character = "";
                        textField.setText("");
                        break;
                    case "=" :
                        if(!firstNumber.equals("") && character.equals("") && secondNumber.equals("")) {
                            firstNumber = String.valueOf(Double.parseDouble(firstNumber));
                            textField.setText(firstNumber);
                            break;
                        }

                        // firstNumber != "" and character != "" and secondNumber != ""
                        if(!firstNumber.equals("") && !character.equals("") && !secondNumber.equals("")) {
                            double result = 0;
                            boolean flag = true;    // Judge whether the dividend is 0

                            switch (character) {
                                case "+":
                                    result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                                    break;
                                case "-":
                                    result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                                    break;
                                case "*":
                                    result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                                    break;
                                case "/":
                                    // If the dividend is 0
                                    if(Integer.parseInt(secondNumber) == 0) {
                                        flag = false;
                                    } else {
                                        result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                                    }
                                    break;
                            }

                            if(flag) {
                                // Convert the result to a string
                                firstNumber = String.valueOf(result);
                                character = "";
                                secondNumber = "";
                                textField.setText(firstNumber);
                                flag2 = true;
                            } else {
                                // initialization
                                firstNumber = "";
                                character = "";
                                secondNumber = "";
                                textField.setText("Input error!");
                            }
                        } else {
                            firstNumber = "";
                            character = "";
                            secondNumber = "";
                            textField.setText("Input error!");
                        }
                        break;
                    default:
                        if(flag2) {
                            firstNumber = "";
                            flag2 = false;
                        }
                        if(character.equals("")) {
                            firstNumber += s;
                            textField.setText(firstNumber);
                        }
                        else {
                            secondNumber += s;
                            textField.setText(firstNumber + character + secondNumber);
                        }
                }
            });

            // Only 3 in each row
            if (col > 3) {
                col = 0;
                line++;
            }
        }
        pane.setCenter(pane2);
        show(primaryStage, pane);

    }

    public void show(Stage primaryStage,BorderPane pane){
        Scene scene = new Scene(pane,300,400);
        primaryStage.setTitle("Yang Hang Li's Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}