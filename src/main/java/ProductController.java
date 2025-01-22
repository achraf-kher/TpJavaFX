import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private ListView<Product> productListView;

    private List<Product> products = new ArrayList<>();

    // Méthode pour ajouter un produit
    @FXML
    private void handleAddProduct() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());

        Product product = new Product(name, price);
        products.add(product);

        // Mettre à jour la ListView
        productListView.getItems().setAll(products);

        // Réinitialiser les champs du formulaire
        nameField.clear();
        priceField.clear();
    }
}