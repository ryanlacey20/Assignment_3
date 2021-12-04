
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

        Button submitButton = new Button("Register");
        grid.add(submitButton, 1, 2);

        final Text toShow = new Text();
        grid.add(toShow, 1, 3);

        submitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                Controller.emailAuthenticator(String.valueOf(emailTextField));
            }
        });
        stage.show();
    }



}


