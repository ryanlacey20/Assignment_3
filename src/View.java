
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class View {


    public static void start(Stage stage) throws Exception{
        stage.setTitle("Registration Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Scene registrationScene = new Scene(grid, 600, 400);
        stage.setScene(registrationScene);

        Text title = new Text("Sign Up Below");
        grid.add(title, 0, 0);

        Label emailLabel = new Label("E-mail");
        grid.add(emailLabel, 0 ,1);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 1);

        Label passwordLabel = new Label("Password");
        grid.add(passwordLabel, 0, 2);

        TextField passwordTextField = new TextField();
        grid.add(passwordTextField, 1, 2);

        Label passwordConfirmationLabel = new Label("Re-Enter Password");
        grid.add(passwordConfirmationLabel, 0, 3);

        TextField passwordConfirmationTextField = new TextField();
        grid.add(passwordConfirmationTextField, 1, 3);

        Button submitButton = new Button("Register");
        grid.add(submitButton, 1, 4);

        final Text successPrompt = new Text("Registration Successful!");
        final Text emailFail = new Text("Invalid email, please try again");
        final Text passwordFail = new Text("""
                            Invalid password, must be:
                            minimum 7 characters long,
                            contain at least 1 letter,
                            contain at least 1 number
                            and one of the following symbols '^&@!'""");
        final Text passwordMatchError = new Text("Error, passwords do not match");

        submitButton.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent e) {
                if (grid.getChildren().contains(emailFail)) {
                    grid.getChildren().remove(emailFail);
                } else if (grid.getChildren().contains(passwordFail)) {
                    grid.getChildren().remove(passwordFail);
                } else if (grid.getChildren().contains(passwordMatchError)) {
                    grid.getChildren().remove(passwordMatchError);
                } else if (grid.getChildren().contains(successPrompt)) {
                    grid.getChildren().remove(successPrompt);
                }
                if (!Controller.emailAuthenticator(emailTextField.getText())) {
                    grid.add(emailFail, 1, 5);
                } else if (!Objects.equals(passwordTextField.getText(), passwordConfirmationTextField.getText())) {
                    grid.add(passwordMatchError, 1, 5);
                } else if (!Controller.passwordAuthenticator(passwordTextField.getText())) {
                    grid.add(passwordFail, 1, 5);
                } else {
                    grid.getChildren();
                    grid.add(successPrompt, 1, 5);

                }
            }
        });
                stage.show();
}}



