import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       // StackPane root = new StackPane();
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 800, 600));
        //primaryStage.show();
        Group root = new Group();
        Scene escena = new Scene(root);
        Stage stage = new Stage();
        
        stage.setScene(escena);
        stage.show();
    }
}