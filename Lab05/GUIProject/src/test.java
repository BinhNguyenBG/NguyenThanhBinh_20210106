import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("This is an example of an information dialog!");

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}