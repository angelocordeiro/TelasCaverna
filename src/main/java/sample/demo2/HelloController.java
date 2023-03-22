package sample.demo2;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class HelloController implements Initializable {

    @FXML
    private TableView<Membro> tbVMembros;
    @FXML
    private TableColumn<Membro, String> tcNome;
    @FXML
    private TableColumn<Membro, String> tcTelefone;
    @FXML
    private TableColumn<Membro, String> tcCpf;
    @FXML
    private TableColumn<Membro, String> tcAcao;
    @FXML
    private Button btnAdd;

    private ObservableList<Membro> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    @FXML
    public void handleButtonClick(){
        HelloApplication.innerstage.setScene(HelloApplication.addnew.getScene());
        HelloApplication.getInnerstage().show();
    }

}
