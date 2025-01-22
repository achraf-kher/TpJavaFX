import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger la vue FXML
        Parent root = FXMLLoader.load(getClass().getResource("/product-view.fxml"));
        // Configurer la scène
        Scene scene = new Scene(root, 400, 300);

        // Configurer la fenêtre
        primaryStage.setTitle("Gestion des produits");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}