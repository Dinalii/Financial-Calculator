//Financial Calculator
package sample;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.application.Application;

//main class
public class Main extends Application {

    public static String numericInputs;
    @Override

    public void start(Stage primaryStageForTheCalculatorProgram) throws Exception {

        // background image and topic of the main window
        Image mainImageOfTheProgram = new Image("file:MainWindow.png");
        ImageView backgroundImageViewOfTheMainWindow = new ImageView(mainImageOfTheProgram);
        Label Topic = new Label("FINANCIAL CALCULATOR");
        Topic.setLayoutY(25);
        Topic.setLayoutX(170);
        Topic.setFont(Font.font("Times New Roman", FontWeight.BOLD, 42));

        // entry button for the fixedSavings calculator
        Button entryButtonOfFixedSavingsCalculator = new Button("Savings (Fixed)");

        entryButtonOfFixedSavingsCalculator.setLayoutX(320);
        entryButtonOfFixedSavingsCalculator.setLayoutY(150);
        entryButtonOfFixedSavingsCalculator.setPrefWidth(200);
        entryButtonOfFixedSavingsCalculator.setPrefHeight(40);

        // entry button for the mortgage calculator
        Button entryButtonOfMortgageCalculator = new Button("Mortgage");
        entryButtonOfMortgageCalculator.setLayoutX(320);
        entryButtonOfMortgageCalculator.setLayoutY(210);
        entryButtonOfMortgageCalculator.setPrefWidth(200);
        entryButtonOfMortgageCalculator.setPrefHeight(50);
        entryButtonOfMortgageCalculator.setPrefHeight(40);

        // entry button for the Savings interest calculator
        Button entryButtonOfSavingsCalculator = new Button("Savings ");
        entryButtonOfSavingsCalculator.setLayoutX(320);
        entryButtonOfSavingsCalculator.setLayoutY(270);
        entryButtonOfSavingsCalculator.setPrefWidth(200);
        entryButtonOfSavingsCalculator.setPrefHeight(40);

        // entry button for the auto loan calculator
        Button entryButtonOfAutoLoanCalculator = new Button("Auto Loan");
        entryButtonOfAutoLoanCalculator.setLayoutX(320);
        entryButtonOfAutoLoanCalculator.setLayoutY(330);
        entryButtonOfAutoLoanCalculator.setPrefWidth(200);
        entryButtonOfAutoLoanCalculator.setPrefHeight(40);


        // about button of the main window
        Button mainWindowHelpButton = new Button("HELP");
        mainWindowHelpButton.setLayoutX(650);
        mainWindowHelpButton.setLayoutY(550);
        mainWindowHelpButton.setPrefHeight(30);
        mainWindowHelpButton.setPrefWidth(80);

        // exit button of the main window
        Button mainWindowExitButton = new Button("EXIT");
        mainWindowExitButton.setLayoutX(750);
        mainWindowExitButton.setLayoutY(550);
        mainWindowExitButton.setPrefWidth(80);
        mainWindowExitButton.setPrefHeight(30);

        //back button
        Button btnSavingsBack = new Button("BACK");
        btnSavingsBack.setOnAction(eventE1 -> {
            Stage mainStage = (Stage) btnSavingsBack.getScene().getWindow();
            mainStage.close();

            primaryStageForTheCalculatorProgram.show();
        });



        mainWindowHelpButton.setOnAction(eventA1 -> {

            Stage helpViewStage = new Stage();
            Pane rootForHelpView = new Pane();

            // background image of help view
            Image imageOfFixedSavingCalculator = new Image("file:help.png");
            ImageView backgroundImageOfFixedSavings = new ImageView(imageOfFixedSavingCalculator);

            // labels of help view
            Label helpLine01 = new Label("Financial Calculator - 2020");
            helpLine01.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
            helpLine01.setLayoutY(10);
            helpLine01.setLayoutX(20);

            Label helpLine02 = new Label("A financial calculator is a multi-purpose software for financial calculations.");
            helpLine02.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            helpLine02.setLayoutY(40);
            helpLine02.setLayoutX(20);

            Label helpLine03 = new Label("Savings (Fixed) Calculator ");
            helpLine03.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            helpLine03.setLayoutY(90);
            helpLine03.setLayoutX(20);

            Label helpLine04 = new Label("Savings (Fixed) Calculator can use to calculate the Start principal, Annual Interest, Future Value, and time of \nFixed deposit.Give 03 user inputs and press the calculate button to get the answer.");
            helpLine04.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
            helpLine04.setLayoutY(110);
            helpLine04.setLayoutX(20);

            Label helpLine05 = new Label("Mortgage Calculator ");
            helpLine05.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            helpLine05.setLayoutY(160);
            helpLine05.setLayoutX(20);

            Label helpLine06 = new Label("Give all the inputs to the mortgage calculator and it will calculate the monthly payment. Do not keep empty text \nfields.");
            helpLine06.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
            helpLine06.setLayoutY(180);
            helpLine06.setLayoutX(20);

            Label helpLine07 = new Label("Savings Calculator ");
            helpLine07.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            helpLine07.setLayoutY(230);
            helpLine07.setLayoutX(20);

            Label helpLine08 = new Label("It gives both future value and payment one by one. give the necessary data and press the calculate button.");
            helpLine08.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
            helpLine08.setLayoutY(250);
            helpLine08.setLayoutX(20);

            Label helpLine09 = new Label("Auto Loan Calculator ");
            helpLine09.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            helpLine09.setLayoutY(280);
            helpLine09.setLayoutX(20);

            Label helpLine10 = new Label("Input all the data and it gives monthly payment as output answer.");
            helpLine10.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
            helpLine10.setLayoutY(300);
            helpLine10.setLayoutX(20);

            helpViewStage.setScene(new Scene(rootForHelpView, 750, 500));

            rootForHelpView.getChildren().add(backgroundImageOfFixedSavings);
            rootForHelpView.getChildren().add(helpLine01);
            rootForHelpView.getChildren().add(helpLine02);
            rootForHelpView.getChildren().add(helpLine03);
            rootForHelpView.getChildren().add(helpLine04);
            rootForHelpView.getChildren().add(helpLine05);
            rootForHelpView.getChildren().add(helpLine06);
            rootForHelpView.getChildren().add(helpLine07);
            rootForHelpView.getChildren().add(helpLine08);
            rootForHelpView.getChildren().add(helpLine09);
            rootForHelpView.getChildren().add(helpLine10);

            helpViewStage.setTitle("Help");
            helpViewStage.setResizable(false);
            helpViewStage.show();

        });

        // ---------------------------------------------------- Savings (Fixed) Calculator------------------------------------------------------------------------------//


        entryButtonOfFixedSavingsCalculator.setOnAction(eventA1 -> {
           //stage of fixed saving calculator
            Stage mainWindow = (Stage) entryButtonOfFixedSavingsCalculator.getScene().getWindow();
            mainWindow.close();

            Stage newfixedSavingStage = new Stage();

            Pane rootOfSavingsCalculator = new Pane();

            // background image of fixed saving calculator
            Image imageOfFixedSavingCalculator = new Image("file:two.png");
            ImageView backgroundImageOfFixedSavings = new ImageView(imageOfFixedSavingCalculator);

            // labels of fixed savings calculator
            Label topicOfFixedSavingsCalculator = new Label("Savings (Fixed) Calculator");
            topicOfFixedSavingsCalculator.setFont(Font.font("Times New Roman", FontWeight.BOLD, 42));
            topicOfFixedSavingsCalculator.setLayoutY(15);
            topicOfFixedSavingsCalculator.setLayoutX(200);

            Label labelOfFixedSavingsStartPrincipal = new Label("Start Principal");
            labelOfFixedSavingsStartPrincipal.setLayoutY(110);
            labelOfFixedSavingsStartPrincipal.setLayoutX(20);
            labelOfFixedSavingsStartPrincipal.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfFixedSavingsInterest = new Label("Annual Interest");
            labelOfFixedSavingsInterest.setLayoutY(160);
            labelOfFixedSavingsInterest.setLayoutX(20);
            labelOfFixedSavingsInterest.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfFixedSavingsFv = new Label("Future Value");
            labelOfFixedSavingsFv.setLayoutY(210);
            labelOfFixedSavingsFv.setLayoutX(20);
            labelOfFixedSavingsFv.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));


            Label labelOfFixedSavingsTime = new Label("Time (Years)");
            labelOfFixedSavingsTime.setLayoutY(260);
            labelOfFixedSavingsTime.setLayoutX(20);
            labelOfFixedSavingsTime.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));



            Label labelOfFixedSavingsOutputValue = new Label();
            labelOfFixedSavingsOutputValue.setLayoutY(370);
            labelOfFixedSavingsOutputValue.setLayoutX(150);
            labelOfFixedSavingsOutputValue.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));



            Label labelOfFixedSavingsOutputName = new Label();
            labelOfFixedSavingsOutputName.setLayoutY(370);
            labelOfFixedSavingsOutputName.setLayoutX(20);
            labelOfFixedSavingsOutputName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));


            // text fields of fixed savings
            TextField textFieldOfFixedSavingsStartingPrincipal = new TextField();
            textFieldOfFixedSavingsStartingPrincipal.setLayoutY(110);
            textFieldOfFixedSavingsStartingPrincipal.setLayoutX(160);
            textFieldOfFixedSavingsStartingPrincipal.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfFixedSavingsStartingPrincipal.setPrefHeight(10);
            textFieldOfFixedSavingsStartingPrincipal.setPrefWidth(200);

            TextField textFieldOfFixedSavingsAnnualInterest = new TextField();
            textFieldOfFixedSavingsAnnualInterest.setLayoutY(160);
            textFieldOfFixedSavingsAnnualInterest.setLayoutX(160);
            textFieldOfFixedSavingsAnnualInterest.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfFixedSavingsAnnualInterest.setPrefHeight(10);
            textFieldOfFixedSavingsAnnualInterest.setPrefWidth(200);

            TextField textFieldOfFixedSavingsFv = new TextField();
            textFieldOfFixedSavingsFv.setLayoutY(210);
            textFieldOfFixedSavingsFv.setLayoutX(160);
            textFieldOfFixedSavingsFv.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfFixedSavingsFv.setPrefHeight(10);
            textFieldOfFixedSavingsFv.setPrefWidth(200);

            TextField textFieldOfFixedSavingsTime = new TextField();
            textFieldOfFixedSavingsTime.setLayoutY(260);
            textFieldOfFixedSavingsTime.setLayoutX(160);
            textFieldOfFixedSavingsTime.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfFixedSavingsTime.setPrefHeight(10);
            textFieldOfFixedSavingsTime.setPrefWidth(200);

            Button CalculateButtonOfFixedSavings = new Button("Calculate");
            CalculateButtonOfFixedSavings.setLayoutX(220);
            CalculateButtonOfFixedSavings.setLayoutY(310);
            textFieldOfFixedSavingsTime.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            // calculation logic of fixed saving calculator
            CalculateButtonOfFixedSavings.setOnAction(eventA2 -> {

                String inputOfStartPrincipalOfFixedSavings = textFieldOfFixedSavingsStartingPrincipal.getText();
                String inputOfAnnualInterestOfFixedSavings = textFieldOfFixedSavingsAnnualInterest.getText();
                String inputOfFvOfFixedSavings = textFieldOfFixedSavingsFv.getText();
                String inputOfSTimeOfFixedSavings = textFieldOfFixedSavingsTime.getText();

                int countValueOfSpacesOfFixedSavings = 0;

                if (inputOfStartPrincipalOfFixedSavings.equals("")) {
                    countValueOfSpacesOfFixedSavings += 1;
                }
                if (inputOfAnnualInterestOfFixedSavings.equals("")) {
                    countValueOfSpacesOfFixedSavings += 1;
                }
                if (inputOfFvOfFixedSavings.equals("")) {
                    countValueOfSpacesOfFixedSavings += 1;
                }
                if (inputOfSTimeOfFixedSavings.equals("")) {
                    countValueOfSpacesOfFixedSavings += 1;
                }
                if (countValueOfSpacesOfFixedSavings > 1 || countValueOfSpacesOfFixedSavings == 4 || countValueOfSpacesOfFixedSavings == 0) {
                    labelOfFixedSavingsOutputName.setText("Error.Try Again.");
                    labelOfFixedSavingsOutputValue.setText("");

                } else if (inputOfStartPrincipalOfFixedSavings.equals("") && countValueOfSpacesOfFixedSavings == 1) {

                try {
                    double doubleValueOfInterestOfFixedSavings = Double.parseDouble(inputOfAnnualInterestOfFixedSavings);
                    double doubleValueOfFvOfFixedSavings = Double.parseDouble(inputOfFvOfFixedSavings);
                    double doubleValueOfTimeOfFixedSavings = Double.parseDouble(inputOfSTimeOfFixedSavings);

                    // equation for principal calculation
                    double powerOfEquationOfPrincipalOfFixedValue = doubleValueOfTimeOfFixedSavings * 12;
                    double finalValueOfPrincipalOfFixedValue = doubleValueOfFvOfFixedSavings / Math.pow(((1 + ((doubleValueOfInterestOfFixedSavings / 100) / (12)))), powerOfEquationOfPrincipalOfFixedValue);

                    double roundedFinalValueOfPrincipalOfFixedValue = Math.round(finalValueOfPrincipalOfFixedValue * 100.0) / 100.0;
                    String stringOfRoundedFinalValueOfPrincipalOfFixedValue = String.valueOf(roundedFinalValueOfPrincipalOfFixedValue);

                    labelOfFixedSavingsOutputValue.setText("    $ " + stringOfRoundedFinalValueOfPrincipalOfFixedValue);
                    labelOfFixedSavingsOutputName.setText("Principal Value is    ");
                    textFieldOfFixedSavingsStartingPrincipal.setText(stringOfRoundedFinalValueOfPrincipalOfFixedValue);

                }catch (NumberFormatException e){
                    labelOfFixedSavingsOutputName.setText("Enter an valid Integer");
                    labelOfFixedSavingsOutputValue.setText("");
                }}



                else if (inputOfFvOfFixedSavings.equals("") && countValueOfSpacesOfFixedSavings == 1) {
                    try{
                        double doubleValueOfPrincipalOfFixedSavings = Double.parseDouble(inputOfStartPrincipalOfFixedSavings);
                        double doubleValueOfInterestOfFixedSavings = Double.parseDouble(inputOfAnnualInterestOfFixedSavings);
                        double doubleValueOfTimeOfFixedSavings = Double.parseDouble(inputOfSTimeOfFixedSavings);

                    // equation for Fv
                    double powerOfntOfFutureValueOfFixedSavingsEquation = doubleValueOfTimeOfFixedSavings * 12;
                    double finalValueOfFvOfFixedValue = doubleValueOfPrincipalOfFixedSavings * ((Math.pow((1 + ((doubleValueOfInterestOfFixedSavings / 100) / (12))), powerOfntOfFutureValueOfFixedSavingsEquation)));

                    double roundedFinalValueOfFvOfFixedValue = Math.round(finalValueOfFvOfFixedValue * 100.0) / 100.0;
                    String stringOfRoundedFinalValueOfFvOfFixedValue = String.valueOf(roundedFinalValueOfFvOfFixedValue);

                    labelOfFixedSavingsOutputValue.setText("  $ " + stringOfRoundedFinalValueOfFvOfFixedValue);
                    labelOfFixedSavingsOutputName.setText("Future Value Is   ");
                    textFieldOfFixedSavingsFv.setText(stringOfRoundedFinalValueOfFvOfFixedValue);

                    }catch (NumberFormatException e){
                        labelOfFixedSavingsOutputName.setText("Enter an valid Integer");
                        labelOfFixedSavingsOutputValue.setText("");

                    }}

                     else if (inputOfAnnualInterestOfFixedSavings.equals("") && countValueOfSpacesOfFixedSavings == 1) {
                         try{
                             double doubleValueOfPrincipalOfFixedSavings = Double.parseDouble(inputOfStartPrincipalOfFixedSavings);

                             double doubleValueOfFvOfFixedSavings = Double.parseDouble(inputOfFvOfFixedSavings);

                             double doubleValueOfTimeOfFixedSavings = Double.parseDouble(inputOfSTimeOfFixedSavings);

                    // equation of interest
                    double powerOfntOfInterestEquationOfFixedSavings = 1 / (doubleValueOfTimeOfFixedSavings * 12);
                    double finalInterestOfFixedSavings = ((12) * (Math.pow((doubleValueOfFvOfFixedSavings / doubleValueOfPrincipalOfFixedSavings), powerOfntOfInterestEquationOfFixedSavings) - 1)) * 100;

                    double roundedFinalInterestOfFixedSavings = Math.round(finalInterestOfFixedSavings * 100.0) / 100.0;
                    String stringOfRoundedFinelInterestOfFixedSavings = String.valueOf(roundedFinalInterestOfFixedSavings);

                    labelOfFixedSavingsOutputValue.setText(stringOfRoundedFinelInterestOfFixedSavings + " %");
                    labelOfFixedSavingsOutputName.setText("Interest Rate is");
                    textFieldOfFixedSavingsAnnualInterest.setText(stringOfRoundedFinelInterestOfFixedSavings);

                         }catch (NumberFormatException e) {
                             labelOfFixedSavingsOutputName.setText("Enter an valid Integer");
                             labelOfFixedSavingsOutputValue.setText("");
                         }
                         } else if (inputOfSTimeOfFixedSavings.equals("") && countValueOfSpacesOfFixedSavings == 1) {
                         try{
                             double doubleValueOfPrincipalOfFixedSavings = Double.parseDouble(inputOfStartPrincipalOfFixedSavings);
                             double doubleValueOfInterestOfFixedSavings = Double.parseDouble(inputOfAnnualInterestOfFixedSavings);
                             double doubleValueOfFvOfFixedSavings = Double.parseDouble(inputOfFvOfFixedSavings);

                    // equation of time
                    double finalTimeOfFixedSavings = ((Math.log(doubleValueOfFvOfFixedSavings / doubleValueOfPrincipalOfFixedSavings)) / (12 * (Math.log(1 + ((doubleValueOfInterestOfFixedSavings / 100) / 12))))) / Math.log(2.71828);

                    double roundedFinalTimeOfFixedSavings = Math.round(finalTimeOfFixedSavings * 100.0) / 100.0;
                    String stringOfRoundedFinelTimeOfFixedSavings = String.valueOf(roundedFinalTimeOfFixedSavings);

                    labelOfFixedSavingsOutputValue.setText(stringOfRoundedFinelTimeOfFixedSavings + " Years");
                    labelOfFixedSavingsOutputName.setText("Time Period is");
                    textFieldOfFixedSavingsTime.setText(stringOfRoundedFinelTimeOfFixedSavings);
                         }catch (NumberFormatException e){
                             labelOfFixedSavingsOutputName.setText("Enter an valid Integer");
                             labelOfFixedSavingsOutputValue.setText("");
                             

                         }}
            });

            final Scene sceneOfFixedSavings = new Scene(rootOfSavingsCalculator, 850, 600);

            // keyboard of fixed savings
            Button KeyboardInput01 = new Button("0");
            KeyboardInput01.setLayoutX(330);
            KeyboardInput01.setLayoutY(495);
            KeyboardInput01.setPrefHeight(35);
            KeyboardInput01.setPrefWidth(35);
            KeyboardInput01.setFocusTraversable(false);

            KeyboardInput01.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput01.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput02 = new Button("1");
            KeyboardInput02.setLayoutX(430);
            KeyboardInput02.setLayoutY(495);
            KeyboardInput02.setPrefHeight(35);
            KeyboardInput02.setPrefWidth(35);
            KeyboardInput02.setFocusTraversable(false);

            KeyboardInput02.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput02.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput03 = new Button("2");
            KeyboardInput03.setLayoutX(480);
            KeyboardInput03.setLayoutY(495);
            KeyboardInput03.setPrefHeight(35);
            KeyboardInput03.setPrefWidth(35);
            KeyboardInput03.setFocusTraversable(false);

            KeyboardInput03.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput03.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput04 = new Button("3");
            KeyboardInput04.setLayoutX(530);
            KeyboardInput04.setLayoutY(495);
            KeyboardInput04.setPrefHeight(35);
            KeyboardInput04.setPrefWidth(35);
            KeyboardInput04.setFocusTraversable(false);

            KeyboardInput04.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput04.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput05 = new Button("4");
            KeyboardInput05.setLayoutX(580);
            KeyboardInput05.setLayoutY(495);
            KeyboardInput05.setPrefHeight(35);
            KeyboardInput05.setPrefWidth(35);
            KeyboardInput05.setFocusTraversable(false);

            KeyboardInput05.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput05.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput06 = new Button("5");
            KeyboardInput06.setLayoutX(380);
            KeyboardInput06.setLayoutY(540);
            KeyboardInput06.setPrefHeight(35);
            KeyboardInput06.setPrefWidth(35);
            KeyboardInput06.setFocusTraversable(false);

            KeyboardInput06.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput06.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput07 = new Button("6");
            KeyboardInput07.setLayoutX(430);
            KeyboardInput07.setLayoutY(540);
            KeyboardInput07.setPrefHeight(35);
            KeyboardInput07.setPrefWidth(35);
            KeyboardInput07.setFocusTraversable(false);

            KeyboardInput07.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput07.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput08 = new Button("7");
            KeyboardInput08.setLayoutX(480);
            KeyboardInput08.setLayoutY(540);
            KeyboardInput08.setPrefHeight(35);
            KeyboardInput08.setPrefWidth(35);
            KeyboardInput08.setFocusTraversable(false);

            KeyboardInput08.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput08.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput09 = new Button("8");
            KeyboardInput09.setLayoutX(530);
            KeyboardInput09.setLayoutY(540);
            KeyboardInput09.setPrefHeight(35);
            KeyboardInput09.setPrefWidth(35);
            KeyboardInput09.setFocusTraversable(false);

            KeyboardInput09.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput09.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput10 = new Button("9");
            KeyboardInput10.setLayoutX(580);
            KeyboardInput10.setLayoutY(540);
            KeyboardInput10.setPrefHeight(35);
            KeyboardInput10.setPrefWidth(35);
            KeyboardInput10.setFocusTraversable(false);

            KeyboardInput10.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput10.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput11 = new Button("C");
            KeyboardInput11.setLayoutX(230);
            KeyboardInput11.setLayoutY(495);
            KeyboardInput11.setPrefHeight(35);
            KeyboardInput11.setPrefWidth(35);
            KeyboardInput11.setFocusTraversable(false);

            KeyboardInput11.setOnAction(eventE -> {

                {
                    textFieldOfFixedSavingsAnnualInterest.setText("");
                    textFieldOfFixedSavingsFv.setText("");
                    textFieldOfFixedSavingsStartingPrincipal.setText("");
                    textFieldOfFixedSavingsTime.setText("");
                }
            });

            Button KeyboardInput12 = new Button(".");
            KeyboardInput12.setLayoutX(280);
            KeyboardInput12.setLayoutY(495);
            KeyboardInput12.setPrefHeight(35);
            KeyboardInput12.setPrefWidth(35);
            KeyboardInput12.setFocusTraversable(false);

            KeyboardInput12.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput12.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('.') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            Button KeyboardInput13 = new Button("Back");
            KeyboardInput13.setLayoutX(230);
            KeyboardInput13.setLayoutY(540);
            KeyboardInput13.setPrefHeight(35);
            KeyboardInput13.setPrefWidth(134);
            KeyboardInput13.setFocusTraversable(false);
            KeyboardInput13.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (((TextInputControl) nodeForKeyboard).getLength() > 0) {
                    ((TextInputControl) nodeForKeyboard).setText(((TextInputControl) nodeForKeyboard).getText(0,
                            ((TextInputControl) nodeForKeyboard).getText().length() - 1));

                }
            });

            Button KeyboardInput14 = new Button("-");
            KeyboardInput14.setLayoutX(380);
            KeyboardInput14.setLayoutY(495);
            KeyboardInput14.setPrefHeight(35);
            KeyboardInput14.setPrefWidth(35);
            KeyboardInput14.setFocusTraversable(false);

            KeyboardInput14.setOnAction(eventE -> {
                Node nodeForKeyboard = sceneOfFixedSavings.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput14.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('-') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            //back button
            btnSavingsBack.setLayoutX(02);
            btnSavingsBack.setLayoutY(02);
            btnSavingsBack.setPrefHeight(30);
            btnSavingsBack.setPrefWidth(80);

            // adding elements to the root
            rootOfSavingsCalculator.getChildren().addAll(backgroundImageOfFixedSavings);

            rootOfSavingsCalculator.getChildren().add(CalculateButtonOfFixedSavings);

            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsOutputName);

            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsOutputValue);

            rootOfSavingsCalculator.getChildren().add(topicOfFixedSavingsCalculator);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput01);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput02);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput03);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput04);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput05);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput06);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput07);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput08);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput09);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput10);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput11);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput12);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput13);

            rootOfSavingsCalculator.getChildren().add(KeyboardInput14);


            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsStartPrincipal);

            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsInterest);

            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsFv);

            rootOfSavingsCalculator.getChildren().add(labelOfFixedSavingsTime);

            rootOfSavingsCalculator.getChildren().add(textFieldOfFixedSavingsStartingPrincipal);

            rootOfSavingsCalculator.getChildren().add(textFieldOfFixedSavingsAnnualInterest);

            rootOfSavingsCalculator.getChildren().add(textFieldOfFixedSavingsFv);

            rootOfSavingsCalculator.getChildren().add(textFieldOfFixedSavingsTime);

            rootOfSavingsCalculator.getChildren().add(btnSavingsBack);

            newfixedSavingStage.setTitle("Savings (Fixed)");
            newfixedSavingStage.setScene(sceneOfFixedSavings);
            newfixedSavingStage.setResizable(false);
            newfixedSavingStage.show();
        });


        // ------------------------------- Savings Calculator--------------------------//

        entryButtonOfSavingsCalculator.setOnAction(event2 -> {

            Stage mainWindow = (Stage) entryButtonOfSavingsCalculator.getScene().getWindow();
            mainWindow.close();

            //stage os savings
            Stage newSavingStage = new Stage();

            Pane root = new Pane();
            Image imageOfSavings = new Image("file:four.png");
            ImageView backgroundImageOfSavings = new ImageView(imageOfSavings);

            Label topicOfSavingsCalculator = new Label("Savings Calculator");
            topicOfSavingsCalculator.setLayoutY(25);
            topicOfSavingsCalculator.setLayoutX(250);
            topicOfSavingsCalculator.setFont(Font.font("Times New Roman", FontWeight.BOLD, 42));

            //lebels of savings calculator
            Label labelOfSavingsPayment = new Label("Payment");
            labelOfSavingsPayment.setLayoutY(110);
            labelOfSavingsPayment.setLayoutX(20);
            labelOfSavingsPayment.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfSavingsInterest = new Label("Interest Rate");
            labelOfSavingsInterest.setLayoutY(160);
            labelOfSavingsInterest.setLayoutX(20);
            labelOfSavingsInterest.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfSavingsFv = new Label("Future Value");
            labelOfSavingsFv.setLayoutY(210);
            labelOfSavingsFv.setLayoutX(20);
            labelOfSavingsFv.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfSavingsTime = new Label("Time Period");
            labelOfSavingsTime.setLayoutY(260);
            labelOfSavingsTime.setLayoutX(20);
            labelOfSavingsTime.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfSavingsOutputName = new Label("");
            labelOfSavingsOutputName.setLayoutY(370);
            labelOfSavingsOutputName.setLayoutX(20);
            labelOfSavingsOutputName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelOfSavingsOutputValue = new Label("");
            labelOfSavingsOutputValue.setLayoutY(370);
            labelOfSavingsOutputValue.setLayoutX(150);
            labelOfSavingsOutputValue.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            // text fields of saving calculator
            TextField textFieldOfSavingsPayment = new TextField();
            textFieldOfSavingsPayment.setLayoutY(110);
            textFieldOfSavingsPayment.setLayoutX(150);
            textFieldOfSavingsPayment.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfSavingsPayment.setPrefHeight(10);
            textFieldOfSavingsPayment.setPrefWidth(200);


            TextField textFieldOfSavingsInterest = new TextField();
            textFieldOfSavingsInterest.setLayoutY(160);
            textFieldOfSavingsInterest.setLayoutX(150);
            textFieldOfSavingsInterest.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfSavingsInterest.setPrefHeight(10);
            textFieldOfSavingsInterest.setPrefWidth(200);


            TextField textFieldOfSavingsFv = new TextField();
            textFieldOfSavingsFv.setLayoutY(210);
            textFieldOfSavingsFv.setLayoutX(150);
            textFieldOfSavingsFv.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfSavingsFv.setPrefHeight(10);
            textFieldOfSavingsFv.setPrefWidth(200);

            TextField textFieldOfSavingsTime = new TextField();
            textFieldOfSavingsTime.setLayoutY(260);
            textFieldOfSavingsTime.setLayoutX(150);
            textFieldOfSavingsTime.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldOfSavingsTime.setPrefHeight(10);
            textFieldOfSavingsTime.setPrefWidth(200);

            //calculate button
            Button CalculateButtonOfSavings = new Button("Calculate");
            CalculateButtonOfSavings.setLayoutX(200);
            CalculateButtonOfSavings.setLayoutY(310);
            CalculateButtonOfSavings.setPrefHeight(40);
            CalculateButtonOfSavings.setPrefWidth(100);

            CalculateButtonOfSavings.setOnAction(event1 -> {

                // calculation logic of Savings calculator
                String inputOfPaymentOfSavings = textFieldOfSavingsPayment.getText();
                String inputOfInterestOfSavings = textFieldOfSavingsInterest.getText();
                String inputOfFvOfSavings = textFieldOfSavingsFv.getText();
                String inputOfTimeOfSavings = textFieldOfSavingsTime.getText();

                int countValueForSpaceOfSavings = 0;
                if (inputOfPaymentOfSavings.equals("")) {
                    countValueForSpaceOfSavings += 1;
                }

                if (inputOfInterestOfSavings.equals("")) {
                    countValueForSpaceOfSavings += 1;
                }
                if (inputOfFvOfSavings.equals("")) {
                    countValueForSpaceOfSavings += 1;
                }
                if (inputOfTimeOfSavings.equals("")) {
                    countValueForSpaceOfSavings += 1;
                }
                if (countValueForSpaceOfSavings > 1 || countValueForSpaceOfSavings == 4
                        || countValueForSpaceOfSavings == 0) {
                    labelOfSavingsOutputName.setText("ERROR");
                    labelOfSavingsOutputValue.setText("");
                } else if (inputOfFvOfSavings.equals("") && countValueForSpaceOfSavings == 1) {
                    try{

                        //equation of future value of savings
                        String str01ForPaymentSavings = inputOfPaymentOfSavings;
                        double finishinputOfPaymentOfSavings = Double.parseDouble(str01ForPaymentSavings);

                        String str02CForInterestRateSavings = inputOfInterestOfSavings;
                        double finishinputOfInterestOfSavings = Double.parseDouble(str02CForInterestRateSavings);

                        String str04ForTimePeriodSavings = inputOfTimeOfSavings;
                        double finishinputOfTimeOfSavings = Double.parseDouble(str04ForTimePeriodSavings);

                        double powerOfFutureValueOfSavingsEquation = finishinputOfTimeOfSavings * 12;
                        double finalValueOfFutureValue = (finishinputOfPaymentOfSavings * (Math.pow((1 + (finishinputOfInterestOfSavings / 100) / 12), powerOfFutureValueOfSavingsEquation) - 1)) / ((finishinputOfInterestOfSavings / 100) / 12);

                        double roundedFinalValueOfFutureValue = Math.round(finalValueOfFutureValue * 100.0) / 100.0;
                        String strOfRoundedFinalValueOfFutureValue = String.valueOf(roundedFinalValueOfFutureValue);

                        labelOfSavingsOutputName.setText("Future Value Is    ");
                        labelOfSavingsOutputValue.setText("  $ " +strOfRoundedFinalValueOfFutureValue);
                        textFieldOfSavingsFv.setText(strOfRoundedFinalValueOfFutureValue);

                    }catch (NumberFormatException e) {
                        labelOfSavingsOutputName.setText("Enter an valid Integer");

                    }
                }

                else if (inputOfPaymentOfSavings.equals("") && countValueForSpaceOfSavings == 1) {
                    try{

                        //equation of savings payment
                        String str02CForInterestRateSavings = inputOfInterestOfSavings;
                        double finishinputOfInterestOfSavings = Double.parseDouble(str02CForInterestRateSavings);

                        String str03ForFutureValueSavings = inputOfFvOfSavings;
                        double finishinputOfFvOfSavings = Double.parseDouble(str03ForFutureValueSavings);

                        String str04ForTimePeriodSavings = inputOfTimeOfSavings;
                        double finishinputOfTimeOfSavings = Double.parseDouble(str04ForTimePeriodSavings);

                        double powerOfFutureValueOfSavingsPaymentEquation = finishinputOfTimeOfSavings * 12;
                        double finalValueOfPayment = (finishinputOfFvOfSavings) / ((Math.pow(1 + ((finishinputOfInterestOfSavings / 100) / 12), powerOfFutureValueOfSavingsPaymentEquation) - 1) / ((finishinputOfInterestOfSavings / 100) / 12));
                        double roundedFinalValueOfPayment = Math.round(finalValueOfPayment * 100.0) / 100.0;

                        String strOfRoundedFinalValueOfPayment = String.valueOf(roundedFinalValueOfPayment);

                        textFieldOfSavingsPayment.setText(strOfRoundedFinalValueOfPayment);
                        labelOfSavingsOutputName.setText("Payment Is  ");
                        labelOfSavingsOutputValue.setText("$ " +strOfRoundedFinalValueOfPayment);

                    }catch (NumberFormatException e) {
                        labelOfSavingsOutputName.setText("Enter an valid Integer");
                        labelOfSavingsOutputValue.setText("");
                    }
                }

            });

            //back button
            btnSavingsBack.setLayoutX(02);
            btnSavingsBack.setLayoutY(02);
            btnSavingsBack.setPrefHeight(30);
            btnSavingsBack.setPrefWidth(80);


            final Scene scene = new Scene(root, 850, 600);

            // keyboard of savings calculator
            Button KeyboardInput01 = new Button("0");
            KeyboardInput01.setLayoutX(330);
            KeyboardInput01.setLayoutY(495);
            KeyboardInput01.setPrefHeight(35);
            KeyboardInput01.setPrefWidth(35);
            KeyboardInput01.setFocusTraversable(false);

            KeyboardInput01.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput01.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput02 = new Button("1");
            KeyboardInput02.setLayoutX(430);
            KeyboardInput02.setLayoutY(495);
            KeyboardInput02.setPrefHeight(35);
            KeyboardInput02.setPrefWidth(35);
            KeyboardInput02.setFocusTraversable(false);

            KeyboardInput02.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput02.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput03 = new Button("2");
            KeyboardInput03.setLayoutX(480);
            KeyboardInput03.setLayoutY(495);
            KeyboardInput03.setPrefHeight(35);
            KeyboardInput03.setPrefWidth(35);
            KeyboardInput03.setFocusTraversable(false);

            KeyboardInput03.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput03.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput04 = new Button("3");
            KeyboardInput04.setLayoutX(530);
            KeyboardInput04.setLayoutY(495);
            KeyboardInput04.setPrefHeight(35);
            KeyboardInput04.setPrefWidth(35);
            KeyboardInput04.setFocusTraversable(false);

            KeyboardInput04.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput04.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput05 = new Button("4");
            KeyboardInput05.setLayoutX(580);
            KeyboardInput05.setLayoutY(495);
            KeyboardInput05.setPrefHeight(35);
            KeyboardInput05.setPrefWidth(35);
            KeyboardInput05.setFocusTraversable(false);

            KeyboardInput05.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput05.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });
            // break
            Button KeyboardInput06 = new Button("5");
            KeyboardInput06.setLayoutX(380);
            KeyboardInput06.setLayoutY(540);
            KeyboardInput06.setPrefHeight(35);
            KeyboardInput06.setPrefWidth(35);
            KeyboardInput06.setFocusTraversable(false);

            KeyboardInput06.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput06.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput07 = new Button("6");
            KeyboardInput07.setLayoutX(430);
            KeyboardInput07.setLayoutY(540);
            KeyboardInput07.setPrefHeight(35);
            KeyboardInput07.setPrefWidth(35);
            KeyboardInput07.setFocusTraversable(false);

            KeyboardInput07.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput07.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput08 = new Button("7");
            KeyboardInput08.setLayoutX(480);
            KeyboardInput08.setLayoutY(540);
            KeyboardInput08.setPrefHeight(35);
            KeyboardInput08.setPrefWidth(35);
            KeyboardInput08.setFocusTraversable(false);

            KeyboardInput08.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput08.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput09 = new Button("8");
            KeyboardInput09.setLayoutX(530);
            KeyboardInput09.setLayoutY(540);
            KeyboardInput09.setPrefHeight(35);
            KeyboardInput09.setPrefWidth(35);
            KeyboardInput09.setFocusTraversable(false);

            KeyboardInput09.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput09.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput10 = new Button("9");
            KeyboardInput10.setLayoutX(580);
            KeyboardInput10.setLayoutY(540);
            KeyboardInput10.setPrefHeight(35);
            KeyboardInput10.setPrefWidth(35);
            KeyboardInput10.setFocusTraversable(false);

            KeyboardInput10.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput10.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput11 = new Button("C");
            KeyboardInput11.setLayoutX(230);
            KeyboardInput11.setLayoutY(495);
            KeyboardInput11.setPrefHeight(35);
            KeyboardInput11.setPrefWidth(35);
            KeyboardInput11.setFocusTraversable(false);

            KeyboardInput11.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                {
                    textFieldOfSavingsFv.setText("");
                    textFieldOfSavingsInterest.setText("");
                    textFieldOfSavingsPayment.setText("");
                    textFieldOfSavingsTime.setText("");
                }
            });

            Button KeyboardInput12 = new Button(".");
            KeyboardInput12.setLayoutX(280);
            KeyboardInput12.setLayoutY(495);
            KeyboardInput12.setPrefHeight(35);
            KeyboardInput12.setPrefWidth(35);
            KeyboardInput12.setFocusTraversable(false);

            KeyboardInput12.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput12.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('.') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            Button KeyboardInput13 = new Button("Back");
            KeyboardInput13.setLayoutX(230);
            KeyboardInput13.setLayoutY(540);
            KeyboardInput13.setPrefHeight(35);
            KeyboardInput13.setPrefWidth(134);
            KeyboardInput13.setFocusTraversable(false);
            KeyboardInput13.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (((TextInputControl) nodeForKeyboard).getLength() > 0) {
                    ((TextInputControl) nodeForKeyboard).setText(((TextInputControl) nodeForKeyboard).getText(0,
                            ((TextInputControl) nodeForKeyboard).getText().length() - 1));

                }
            });

            Button KeyboardInput14 = new Button("-");
            KeyboardInput14.setLayoutX(380);
            KeyboardInput14.setLayoutY(495);
            KeyboardInput14.setPrefHeight(35);
            KeyboardInput14.setPrefWidth(35);
            KeyboardInput14.setFocusTraversable(false);

            KeyboardInput14.setOnAction(eventE -> {
                Node nodeForKeyboard = scene.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput14.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('-') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            //adding elements to root
            root.getChildren().addAll(backgroundImageOfSavings);

            root.getChildren().add(CalculateButtonOfSavings);

            root.getChildren().add(KeyboardInput01);

            root.getChildren().add(KeyboardInput02);

            root.getChildren().add(KeyboardInput03);

            root.getChildren().add(KeyboardInput04);

            root.getChildren().add(KeyboardInput05);

            root.getChildren().add(KeyboardInput06);

            root.getChildren().add(KeyboardInput07);

            root.getChildren().add(KeyboardInput08);

            root.getChildren().add(KeyboardInput09);

            root.getChildren().add(KeyboardInput10);

            root.getChildren().add(KeyboardInput11);

            root.getChildren().add(KeyboardInput12);

            root.getChildren().add(KeyboardInput13);

            root.getChildren().add(KeyboardInput14);

            root.getChildren().add(btnSavingsBack);

            root.getChildren().add(textFieldOfSavingsPayment);

            root.getChildren().add(textFieldOfSavingsInterest);


            root.getChildren().add(textFieldOfSavingsFv);

            root.getChildren().add(textFieldOfSavingsTime);

            root.getChildren().add(labelOfSavingsPayment);

            root.getChildren().add(labelOfSavingsInterest);

            root.getChildren().add(labelOfSavingsFv);

            root.getChildren().add(labelOfSavingsTime);

            root.getChildren().add(labelOfSavingsOutputName);

            root.getChildren().add(labelOfSavingsOutputValue);

            root.getChildren().add(topicOfSavingsCalculator);

            newSavingStage.setTitle("Savings Calculator");
            newSavingStage.setScene(scene);
            newSavingStage.setResizable(false);
            newSavingStage.show();

        });
        // ------------------------------- Auto Loan Calculator--------------------------//

        entryButtonOfAutoLoanCalculator.setOnAction(event3 -> {

            Stage mainWindow = (Stage) entryButtonOfAutoLoanCalculator.getScene().getWindow();
            mainWindow.close();

            //stage of auto loan calculator
            Stage newAutoLoanWindow = new Stage();

            Pane root = new Pane();
            Image imageOfLoan = new Image("file:five.png");
            ImageView backgroundOfLoan = new ImageView(imageOfLoan);

            Label TopicAutoLoanTopic = new Label("Auto Loan Calculator");
            TopicAutoLoanTopic.setLayoutY(25);
            TopicAutoLoanTopic.setLayoutX(240);
            TopicAutoLoanTopic.setFont(Font.font("Segoe UI", FontWeight.BOLD, 42));


            //labels of Loan
            Label labelOfLoanPrice = new Label("Auto Price");
            labelOfLoanPrice.setLayoutY(110);
            labelOfLoanPrice.setLayoutX(20);
            labelOfLoanPrice.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));

            Label labelOfLoanPayment = new Label("Down Payment");
            labelOfLoanPayment.setLayoutY(160);
            labelOfLoanPayment.setLayoutX(20);
            labelOfLoanPayment.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));

            Label labelOfLoanTerm = new Label("Auto Term");
            labelOfLoanTerm.setLayoutY(210);
            labelOfLoanTerm.setLayoutX(20);
            labelOfLoanTerm.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));

            Label labelOfLoanRate = new Label("Interest Rate");
            labelOfLoanRate.setLayoutY(260);
            labelOfLoanRate.setLayoutX(20);
            labelOfLoanRate.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));

            Label labelOutputNameOfLoan = new Label("");
            labelOutputNameOfLoan.setLayoutY(370);
            labelOutputNameOfLoan.setLayoutX(200);
            labelOutputNameOfLoan.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));

            Label labelOutputValeOfLoan = new Label("");
            labelOutputValeOfLoan.setLayoutY(370);
            labelOutputValeOfLoan.setLayoutX(20);
            labelOutputValeOfLoan.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));

            //text fields of loan
            TextField textFieldLoanForPrice = new TextField();
            textFieldLoanForPrice.setLayoutY(110);
            textFieldLoanForPrice.setLayoutX(150);
            textFieldLoanForPrice.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));
            textFieldLoanForPrice.setPrefHeight(10);
            textFieldLoanForPrice.setPrefWidth(200);

            TextField textFieldLoanForPayment = new TextField();
            textFieldLoanForPayment.setLayoutY(160);
            textFieldLoanForPayment.setLayoutX(150);
            textFieldLoanForPayment.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));
            textFieldLoanForPayment.setPrefHeight(10);
            textFieldLoanForPayment.setPrefWidth(200);

            TextField textFieldLoanForTerm = new TextField();
            textFieldLoanForTerm.setLayoutY(210);
            textFieldLoanForTerm.setLayoutX(150);
            textFieldLoanForTerm.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));
            textFieldLoanForTerm.setPrefHeight(10);
            textFieldLoanForTerm.setPrefWidth(200);

            TextField textFieldLoanForRate = new TextField();
            textFieldLoanForRate.setLayoutY(260);
            textFieldLoanForRate.setLayoutX(150);
            textFieldLoanForRate.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 19));
            textFieldLoanForRate.setPrefHeight(10);
            textFieldLoanForRate.setPrefWidth(200);

            Button calculateButtonOfLoan = new Button("Calculate");
            calculateButtonOfLoan.setLayoutX(200);
            calculateButtonOfLoan.setLayoutY(310);
            calculateButtonOfLoan.setPrefHeight(40);
            calculateButtonOfLoan.setPrefWidth(100);

            calculateButtonOfLoan.setOnAction(event1 -> {

                //calculation of loan
                String valueForAutoPriceLoan = textFieldLoanForPrice.getText();
                String valueForDownPaymentLoan = textFieldLoanForPayment.getText();
                String valueForAutoTermLoan = textFieldLoanForTerm.getText();
                String valueForInterestRateLoan = textFieldLoanForRate.getText();
                int countValueForSpaceOfLoan = 0;
                if (valueForAutoPriceLoan.equals("")) {
                    countValueForSpaceOfLoan += 1;
                }
                if (valueForDownPaymentLoan.equals("")) {
                    countValueForSpaceOfLoan += 1;
                }
                if (valueForAutoTermLoan.equals("")) {
                    countValueForSpaceOfLoan += 1;
                }
                if (valueForInterestRateLoan.equals("")) {
                    countValueForSpaceOfLoan += 1;
                }
                if (countValueForSpaceOfLoan >= 1  ) {
                    labelOutputNameOfLoan.setText("");
                    labelOutputValeOfLoan.setText("ERROR");
                } else {
                    try{
                        double finishValueForAutoPriecLoan = Double.parseDouble(valueForAutoPriceLoan);

                        double finishValueForDownPaymentLoan = Double.parseDouble(valueForDownPaymentLoan);

                        double finishValueForAutoTermLoan = Double.parseDouble(valueForAutoTermLoan);

                        double finishValueForInterestRateLoan = Double.parseDouble(valueForInterestRateLoan);

                        //equation
                    double yearsToMonthOfLoan = 12 * finishValueForAutoTermLoan;
                    double finalValueForMonthlyPaymentLoan = (finishValueForAutoPriecLoan - finishValueForDownPaymentLoan) * ((finishValueForInterestRateLoan / 12) / 100) * Math.pow((((finishValueForInterestRateLoan / 12) / 100) + 1), yearsToMonthOfLoan) / (Math.pow((((finishValueForInterestRateLoan / 12) / 100) + 1), yearsToMonthOfLoan) - 1);

                    double roundOfFinalValueForMonthlyPaymentLoan = Math.round(finalValueForMonthlyPaymentLoan * 100.0) / 100.0;
                    String strOfRoundOfFinalValueForMonthlyPaymentLoan = String.valueOf(roundOfFinalValueForMonthlyPaymentLoan);

                       labelOutputValeOfLoan.setText("Monthly Payment Is");
                    labelOutputNameOfLoan.setText("$  " + strOfRoundOfFinalValueForMonthlyPaymentLoan);

                }catch (NumberFormatException e) {
                        labelOutputValeOfLoan.setText("Enter an valid Integer");
                    labelOutputNameOfLoan.setText("");
                }}
            });
            final Scene scene3 = new Scene(root, 850, 600);

            // keyboard of loan
            Button KeyboardInput01 = new Button("0");
            KeyboardInput01.setLayoutX(330);
            KeyboardInput01.setLayoutY(495);
            KeyboardInput01.setPrefHeight(35);
            KeyboardInput01.setPrefWidth(35);
            KeyboardInput01.setFocusTraversable(false);

            KeyboardInput01.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput01.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput02 = new Button("1");
            KeyboardInput02.setLayoutX(430);
            KeyboardInput02.setLayoutY(495);
            KeyboardInput02.setPrefHeight(35);
            KeyboardInput02.setPrefWidth(35);
            KeyboardInput02.setFocusTraversable(false);

            KeyboardInput02.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput02.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput03 = new Button("2");
            KeyboardInput03.setLayoutX(480);
            KeyboardInput03.setLayoutY(495);
            KeyboardInput03.setPrefHeight(35);
            KeyboardInput03.setPrefWidth(35);
            KeyboardInput03.setFocusTraversable(false);

            KeyboardInput03.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput03.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput04 = new Button("3");
            KeyboardInput04.setLayoutX(530);
            KeyboardInput04.setLayoutY(495);
            KeyboardInput04.setPrefHeight(35);
            KeyboardInput04.setPrefWidth(35);
            KeyboardInput04.setFocusTraversable(false);

            KeyboardInput04.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput04.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput05 = new Button("4");
            KeyboardInput05.setLayoutX(580);
            KeyboardInput05.setLayoutY(495);
            KeyboardInput05.setPrefHeight(35);
            KeyboardInput05.setPrefWidth(35);
            KeyboardInput05.setFocusTraversable(false);

            KeyboardInput05.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput05.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput06 = new Button("5");
            KeyboardInput06.setLayoutX(380);
            KeyboardInput06.setLayoutY(540);
            KeyboardInput06.setPrefHeight(35);
            KeyboardInput06.setPrefWidth(35);
            KeyboardInput06.setFocusTraversable(false);

            KeyboardInput06.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput06.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput07 = new Button("6");
            KeyboardInput07.setLayoutX(430);
            KeyboardInput07.setLayoutY(540);
            KeyboardInput07.setPrefHeight(35);
            KeyboardInput07.setPrefWidth(35);
            KeyboardInput07.setFocusTraversable(false);

            KeyboardInput07.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput07.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput08 = new Button("7");
            KeyboardInput08.setLayoutX(480);
            KeyboardInput08.setLayoutY(540);
            KeyboardInput08.setPrefHeight(35);
            KeyboardInput08.setPrefWidth(35);
            KeyboardInput08.setFocusTraversable(false);

            KeyboardInput08.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput08.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput09 = new Button("8");
            KeyboardInput09.setLayoutX(530);
            KeyboardInput09.setLayoutY(540);
            KeyboardInput09.setPrefHeight(35);
            KeyboardInput09.setPrefWidth(35);
            KeyboardInput09.setFocusTraversable(false);

            KeyboardInput09.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput09.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput10 = new Button("9");
            KeyboardInput10.setLayoutX(580);
            KeyboardInput10.setLayoutY(540);
            KeyboardInput10.setPrefHeight(35);
            KeyboardInput10.setPrefWidth(35);
            KeyboardInput10.setFocusTraversable(false);

            KeyboardInput10.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput10.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput11 = new Button("C");
            KeyboardInput11.setLayoutX(230);
            KeyboardInput11.setLayoutY(495);
            KeyboardInput11.setPrefHeight(35);
            KeyboardInput11.setPrefWidth(35);
            KeyboardInput11.setFocusTraversable(false);

            KeyboardInput11.setOnAction(eventE -> {

                {
                    textFieldLoanForPayment.setText("");
                    textFieldLoanForPrice.setText("");
                    textFieldLoanForRate.setText("");
                    textFieldLoanForTerm.setText("");
                }
            });

            Button KeyboardInput12 = new Button(".");
            KeyboardInput12.setLayoutX(280);
            KeyboardInput12.setLayoutY(495);
            KeyboardInput12.setPrefHeight(35);
            KeyboardInput12.setPrefWidth(35);
            KeyboardInput12.setFocusTraversable(false);

            KeyboardInput12.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput12.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('.') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            Button KeyboardInput13 = new Button("Back");
            KeyboardInput13.setLayoutX(230);
            KeyboardInput13.setLayoutY(540);
            KeyboardInput13.setPrefHeight(35);
            KeyboardInput13.setPrefWidth(134);
            KeyboardInput13.setFocusTraversable(false);
            KeyboardInput13.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (((TextInputControl) nodeForKeyboard).getLength() > 0) {
                    ((TextInputControl) nodeForKeyboard).setText(((TextInputControl) nodeForKeyboard).getText(0,
                            ((TextInputControl) nodeForKeyboard).getText().length() - 1));

                }
            });

            Button KeyboardInput14 = new Button("-");
            KeyboardInput14.setLayoutX(380);
            KeyboardInput14.setLayoutY(495);
            KeyboardInput14.setPrefHeight(35);
            KeyboardInput14.setPrefWidth(35);
            KeyboardInput14.setFocusTraversable(false);

            KeyboardInput14.setOnAction(eventE -> {
                Node nodeForKeyboard = scene3.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput14.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('-') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            //back button
            btnSavingsBack.setLayoutX(02);
            btnSavingsBack.setLayoutY(02);
            btnSavingsBack.setPrefHeight(30);
            btnSavingsBack.setPrefWidth(80);

            // adding elements to the root
            root.getChildren().addAll(backgroundOfLoan);

            root.getChildren().add(TopicAutoLoanTopic);

            root.getChildren().add(KeyboardInput01);

            root.getChildren().add(KeyboardInput02);

            root.getChildren().add(KeyboardInput03);

            root.getChildren().add(KeyboardInput04);


            root.getChildren().add(KeyboardInput05);

            root.getChildren().add(KeyboardInput06);

            root.getChildren().add(KeyboardInput07);

            root.getChildren().add(KeyboardInput08);

            root.getChildren().add(KeyboardInput09);

            root.getChildren().add(KeyboardInput10);

            root.getChildren().add(KeyboardInput11);

            root.getChildren().add(KeyboardInput12);

            root.getChildren().add(KeyboardInput13);

            root.getChildren().add(KeyboardInput14);

            root.getChildren().add(calculateButtonOfLoan);

            root.getChildren().add(labelOutputNameOfLoan);

            root.getChildren().add(labelOutputValeOfLoan);

            root.getChildren().add(labelOfLoanPrice);

            root.getChildren().add(labelOfLoanPayment);

            root.getChildren().add(labelOfLoanTerm);

            root.getChildren().add(labelOfLoanRate);

            root.getChildren().add(textFieldLoanForPrice);

            root.getChildren().add(textFieldLoanForPayment);

            root.getChildren().add(textFieldLoanForTerm);

            root.getChildren().add(textFieldLoanForRate);

            root.getChildren().add(btnSavingsBack);

            newAutoLoanWindow.setTitle("Auto Loan Calculator");
            newAutoLoanWindow.setScene(scene3);
            newAutoLoanWindow.setResizable(false);
            newAutoLoanWindow.show();

        });

        // ------------------------------- Mortgage Calculator--------------------------//


        entryButtonOfMortgageCalculator.setOnAction(event4 -> {

            //stage of mortgage
            Stage mainWindow = (Stage) entryButtonOfMortgageCalculator.getScene().getWindow();
            mainWindow.close();

            Stage newMortgageWindow = new Stage();

            Pane root = new Pane();
            Image image3 = new Image("file:three.png");
            ImageView background3 = new ImageView(image3);

            //labels of mortgage calculator
            Label TopicMortgageCalculator = new Label("Mortgage Calculator");
            TopicMortgageCalculator.setLayoutY(25);
            TopicMortgageCalculator.setLayoutX(220);
            TopicMortgageCalculator.setFont(Font.font("Times New Roman", FontWeight.BOLD, 42));

            Label labelHomePriceMortgage = new Label("Home Price");
            labelHomePriceMortgage.setLayoutY(110);
            labelHomePriceMortgage.setLayoutX(20);
            labelHomePriceMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));


            Label labelPaymentMortgage = new Label("Down Payment");
            labelPaymentMortgage.setLayoutY(160);
            labelPaymentMortgage.setLayoutX(20);
            labelPaymentMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelTermMortgage = new Label("Mortgage Term");
            labelTermMortgage.setLayoutY(210);
            labelTermMortgage.setLayoutX(20);
            labelTermMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelInterestMortgage = new Label("Interest Rate");
            labelInterestMortgage.setLayoutY(260);
            labelInterestMortgage.setLayoutX(20);
            labelInterestMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelMortgageOutputName = new Label("");
            labelMortgageOutputName.setLayoutY(370);
            labelMortgageOutputName.setLayoutX(20);
            labelMortgageOutputName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            Label labelMortgageOutputValue = new Label("");
            labelMortgageOutputValue.setLayoutY(370);
            labelMortgageOutputValue.setLayoutX(200);
            labelMortgageOutputValue.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));

            //text fields of mortgage calculator
            TextField textFieldHomeMortgage = new TextField();
            textFieldHomeMortgage.setLayoutY(110);
            textFieldHomeMortgage.setLayoutX(160);
            textFieldHomeMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldHomeMortgage.setPrefHeight(10);
            textFieldHomeMortgage.setPrefWidth(200);

            TextField textFieldDownMortgage = new TextField();
            textFieldDownMortgage.setLayoutY(160);
            textFieldDownMortgage.setLayoutX(160);
            textFieldDownMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldDownMortgage.setPrefHeight(10);
            textFieldDownMortgage.setPrefWidth(200);

            TextField textFieldTermMortgage = new TextField();
            textFieldTermMortgage.setLayoutY(210);
            textFieldTermMortgage.setLayoutX(160);
            textFieldTermMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldTermMortgage.setPrefHeight(10);
            textFieldTermMortgage.setPrefWidth(200);

            TextField textFieldInterestMortgage = new TextField();
            textFieldInterestMortgage.setLayoutY(260);
            textFieldInterestMortgage.setLayoutX(160);
            textFieldInterestMortgage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 19));
            textFieldInterestMortgage.setPrefHeight(10);
            textFieldInterestMortgage.setPrefWidth(200);


            Button calculateButtonOfMortgage = new Button("Calculate");
            calculateButtonOfMortgage.setLayoutX(200);
            calculateButtonOfMortgage.setLayoutY(310);
            calculateButtonOfMortgage.setPrefHeight(40);
            calculateButtonOfMortgage.setPrefWidth(100);

            //logical calculation of mortgage calculator
            calculateButtonOfMortgage.setOnAction(event -> {

                String valueForHomePriceMortgage = textFieldHomeMortgage.getText();
                String valueForDownPaymentMortgage = textFieldDownMortgage.getText();
                String valueForMortgageTermMortgage = textFieldTermMortgage.getText();
                String valueForInterestRateMortgage = textFieldInterestMortgage.getText();
                int countValueForSpace = 0;
                if (valueForHomePriceMortgage.equals("")) {
                    countValueForSpace += 1;
                }
                if (valueForDownPaymentMortgage.equals("")) {
                    countValueForSpace += 1;
                }
                if (valueForDownPaymentMortgage.equals("")) {
                    countValueForSpace += 1;
                }
                if (valueForInterestRateMortgage.equals("")) {
                    countValueForSpace += 1;
                }
                if (countValueForSpace >= 1) {
                    labelMortgageOutputName.setText("ERROR");
                    labelMortgageOutputValue.setText("");
                } else {
                    try{

                        double finishValueForHomePriceMortgage = Double.parseDouble(valueForHomePriceMortgage);

                        double finishValueForDownPaymentMortgage = Double.parseDouble(valueForDownPaymentMortgage);

                        double finishValueForMortgageTermMortgage = Double.parseDouble(valueForMortgageTermMortgage);

                        double finishValueForInterestRateMortgage = Double.parseDouble(valueForInterestRateMortgage);

                        //equation
                    double yearsToMonth = 12 * finishValueForMortgageTermMortgage;
                    double finalValueForMonthlyPaymentMortgage = (finishValueForHomePriceMortgage - finishValueForDownPaymentMortgage) * ((finishValueForInterestRateMortgage / 12) / 100) * Math.pow((((finishValueForInterestRateMortgage / 12) / 100) + 1), yearsToMonth) / (Math.pow((((finishValueForInterestRateMortgage / 12) / 100) + 1), yearsToMonth) - 1);

                    double roundOfFinalValueForMonthlyPaymentMortgage = Math.round(finalValueForMonthlyPaymentMortgage * 100.0) / 100.0;
                    String strOfRoundOfFinalValueForMonthlyPaymentMortgage = String.valueOf(roundOfFinalValueForMonthlyPaymentMortgage);

                    labelMortgageOutputValue.setText("$  "+strOfRoundOfFinalValueForMonthlyPaymentMortgage);
                    labelMortgageOutputName.setText("Monthly Payment is");

                    }catch (NumberFormatException e) {
                        labelMortgageOutputName.setText("Enter an valid Integer");
                        labelMortgageOutputValue.setText("");
                    }

                }

            });

            final Scene scene4 = new Scene(root, 850, 600);

            // keyboard of mortgage calculator
            Button KeyboardInput01 = new Button("0");
            KeyboardInput01.setLayoutX(330);
            KeyboardInput01.setLayoutY(495);
            KeyboardInput01.setPrefHeight(35);
            KeyboardInput01.setPrefWidth(35);
            KeyboardInput01.setFocusTraversable(false);

            KeyboardInput01.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput01.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput02 = new Button("1");
            KeyboardInput02.setLayoutX(430);
            KeyboardInput02.setLayoutY(495);
            KeyboardInput02.setPrefHeight(35);
            KeyboardInput02.setPrefWidth(35);
            KeyboardInput02.setFocusTraversable(false);

            KeyboardInput02.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput02.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput03 = new Button("2");
            KeyboardInput03.setLayoutX(480);
            KeyboardInput03.setLayoutY(495);
            KeyboardInput03.setPrefHeight(35);
            KeyboardInput03.setPrefWidth(35);
            KeyboardInput03.setFocusTraversable(false);

            KeyboardInput03.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput03.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput04 = new Button("3");
            KeyboardInput04.setLayoutX(530);
            KeyboardInput04.setLayoutY(495);
            KeyboardInput04.setPrefHeight(35);
            KeyboardInput04.setPrefWidth(35);
            KeyboardInput04.setFocusTraversable(false);

            KeyboardInput04.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput04.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput05 = new Button("4");
            KeyboardInput05.setLayoutX(580);
            KeyboardInput05.setLayoutY(495);
            KeyboardInput05.setPrefHeight(35);
            KeyboardInput05.setPrefWidth(35);
            KeyboardInput05.setFocusTraversable(false);

            KeyboardInput05.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput05.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput06 = new Button("5");
            KeyboardInput06.setLayoutX(380);
            KeyboardInput06.setLayoutY(540);
            KeyboardInput06.setPrefHeight(35);
            KeyboardInput06.setPrefWidth(35);
            KeyboardInput06.setFocusTraversable(false);

            KeyboardInput06.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput06.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput07 = new Button("6");
            KeyboardInput07.setLayoutX(430);
            KeyboardInput07.setLayoutY(540);
            KeyboardInput07.setPrefHeight(35);
            KeyboardInput07.setPrefWidth(35);
            KeyboardInput07.setFocusTraversable(false);

            KeyboardInput07.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput07.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput08 = new Button("7");
            KeyboardInput08.setLayoutX(480);
            KeyboardInput08.setLayoutY(540);
            KeyboardInput08.setPrefHeight(35);
            KeyboardInput08.setPrefWidth(35);
            KeyboardInput08.setFocusTraversable(false);

            KeyboardInput08.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput08.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput09 = new Button("8");
            KeyboardInput09.setLayoutX(530);
            KeyboardInput09.setLayoutY(540);
            KeyboardInput09.setPrefHeight(35);
            KeyboardInput09.setPrefWidth(35);
            KeyboardInput09.setFocusTraversable(false);

            KeyboardInput09.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput09.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput10 = new Button("9");
            KeyboardInput10.setLayoutX(580);
            KeyboardInput10.setLayoutY(540);
            KeyboardInput10.setPrefHeight(35);
            KeyboardInput10.setPrefWidth(35);
            KeyboardInput10.setFocusTraversable(false);

            KeyboardInput10.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput10.getText();
                    ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                }
            });

            Button KeyboardInput11 = new Button("C");
            KeyboardInput11.setLayoutX(230);
            KeyboardInput11.setLayoutY(495);
            KeyboardInput11.setPrefHeight(35);
            KeyboardInput11.setPrefWidth(35);
            KeyboardInput11.setFocusTraversable(false);

            KeyboardInput11.setOnAction(eventE -> {

                {
                    textFieldDownMortgage.setText("");
                    textFieldHomeMortgage.setText("");
                    textFieldInterestMortgage.setText("");
                    textFieldTermMortgage.setText("");
                }
            });

            Button KeyboardInput12 = new Button(".");
            KeyboardInput12.setLayoutX(280);
            KeyboardInput12.setLayoutY(495);
            KeyboardInput12.setPrefHeight(35);
            KeyboardInput12.setPrefWidth(35);
            KeyboardInput12.setFocusTraversable(false);

            KeyboardInput12.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput12.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('.') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });

            Button KeyboardInput13 = new Button("Back");
            KeyboardInput13.setLayoutX(230);
            KeyboardInput13.setLayoutY(540);
            KeyboardInput13.setPrefHeight(35);
            KeyboardInput13.setPrefWidth(134);
            KeyboardInput13.setFocusTraversable(false);
            KeyboardInput13.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (((TextInputControl) nodeForKeyboard).getLength() > 0) {
                    ((TextInputControl) nodeForKeyboard).setText(((TextInputControl) nodeForKeyboard).getText(0,
                            ((TextInputControl) nodeForKeyboard).getText().length() - 1));

                }
            });

            Button KeyboardInput14 = new Button("-");
            KeyboardInput14.setLayoutX(380);
            KeyboardInput14.setLayoutY(495);
            KeyboardInput14.setPrefHeight(35);
            KeyboardInput14.setPrefWidth(35);
            KeyboardInput14.setFocusTraversable(false);

            KeyboardInput14.setOnAction(eventE -> {
                Node nodeForKeyboard = scene4.getFocusOwner();
                if (nodeForKeyboard instanceof TextInputControl) {
                    numericInputs = KeyboardInput14.getText();
                    String checkDecimal = ((TextInputControl) nodeForKeyboard).getText();
                    if (checkDecimal.indexOf('-') == -1) {
                        ((TextInputControl) nodeForKeyboard).replaceSelection(numericInputs);
                    } else {
                        ((TextInputControl) nodeForKeyboard).replaceSelection("");
                    }
                }
            });



            //back button
            btnSavingsBack.setLayoutX(02);
            btnSavingsBack.setLayoutY(02);
            btnSavingsBack.setPrefHeight(30);
            btnSavingsBack.setPrefWidth(80);


            //adding elements to the root
            root.getChildren().addAll(background3);

            root.getChildren().add(TopicMortgageCalculator);

            root.getChildren().add(KeyboardInput01);

            root.getChildren().add(KeyboardInput02);

            root.getChildren().add(KeyboardInput03);

            root.getChildren().add(KeyboardInput04);

            root.getChildren().add(KeyboardInput05);

            root.getChildren().add(KeyboardInput06);

            root.getChildren().add(KeyboardInput07);

            root.getChildren().add(KeyboardInput08);

            root.getChildren().add(KeyboardInput09);

            root.getChildren().add(KeyboardInput10);

            root.getChildren().add(KeyboardInput11);

            root.getChildren().add(KeyboardInput12);

            root.getChildren().add(KeyboardInput13);

            root.getChildren().add(KeyboardInput14);

            root.getChildren().add(labelHomePriceMortgage);

            root.getChildren().add(labelPaymentMortgage);

            root.getChildren().add(labelTermMortgage);

            root.getChildren().add(labelInterestMortgage);

            root.getChildren().add(labelMortgageOutputName);

            root.getChildren().add(labelMortgageOutputValue);

            root.getChildren().add(textFieldHomeMortgage);

            root.getChildren().add(textFieldDownMortgage);

            root.getChildren().add(textFieldTermMortgage);

            root.getChildren().add(textFieldInterestMortgage);

            root.getChildren().add(btnSavingsBack);

            root.getChildren().add(calculateButtonOfMortgage);

            newMortgageWindow.setTitle("Mortgage Calculator");
            newMortgageWindow.setScene(scene4);
            newMortgageWindow.setResizable(false);
            newMortgageWindow.show();
        });

        //exit main window
        mainWindowExitButton.setOnAction(event -> {
            Stage mainWindow = (Stage) mainWindowExitButton.getScene().getWindow();
            mainWindow.close();

        });


        //adding elements to the main window
        Pane root = new Pane();

        root.getChildren().addAll(backgroundImageViewOfTheMainWindow);

        root.getChildren().add(entryButtonOfSavingsCalculator);

        root.getChildren().add(entryButtonOfAutoLoanCalculator);

        root.getChildren().add(entryButtonOfMortgageCalculator);

        root.getStylesheets().add("mainStyleSheet.css");

        root.getChildren().add(mainWindowHelpButton);

        root.getChildren().add(mainWindowExitButton);

        root.getChildren().add(entryButtonOfFixedSavingsCalculator);

        root.getChildren().add(Topic);

        primaryStageForTheCalculatorProgram.setTitle("FINANCIAL CALCULATOR");

        primaryStageForTheCalculatorProgram.setScene(new Scene(root, 850, 600));

        primaryStageForTheCalculatorProgram.setResizable(false);

        primaryStageForTheCalculatorProgram.show();
    }
}
