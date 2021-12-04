
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

public class View {


    public static void start(Stage stage) throws Exception{
        stage.setTitle("Registration Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);

        Text title = new Text("Sign Up Below");
        grid.add(title, 0, 0, 2, 1);

        Label emailLabel = new Label("E-mail");
        grid.add(emailLabel, 0 ,1);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 1);

        Label passwordLabel = new Label("Password");
        grid.add(passwordLabel, 0, 2);

        TextField passwordTextField = new TextField();
        grid.add(passwordTextField, 1, 2);

        Button submitButton = new Button("Register");
        grid.add(submitButton, 1, 3);

        final Text successPrompt = new Text("Registration Successful!");
        final Text emailFail = new Text("Invalid email, please try again");
        final Text passwordFail = new Text("""
                            Invalid password, must be:
                            minimum 7 characters long,
                            contain at least 1 letter,
                            contain at least 1 number
                            and one of the following symbols '^&@!'""");

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if (grid.getChildren().contains(emailFail)){
                    grid.getChildren().remove(emailFail);
                }
                else if(grid.getChildren().contains(passwordFail)) {
                    grid.getChildren().remove(passwordFail);
                }
                else if(grid.getChildren().contains(successPrompt)){
                    grid.getChildren().remove(successPrompt);
                }
                if (!Controller.emailAuthenticator(String.valueOf(emailTextField.getText()))) {
                    grid.add(emailFail, 1, 4);
                }
                else if (!Controller.passwordAuthenticator(String.valueOf(passwordTextField.getText()))) {
                    grid.add(passwordFail, 1, 4);
                }
                else{grid.getChildren();
                    grid.add(successPrompt,1,4);
            }
        }
    });
                stage.show();
}}



