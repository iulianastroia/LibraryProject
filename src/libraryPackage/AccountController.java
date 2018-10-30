package libraryPackage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

//CONTROLLER FOR accountFXML
public class AccountController implements Initializable {
    @FXML
    private TableView<Person> tableView;
//    @FXML
//    private TableColumn<Person, String> id;
//    @FXML
//    private TableColumn<Person, String> name;
//    @FXML
//    private TableColumn<Person, String> phone;
//    @FXML
//    private TableColumn<Person, String> email;

    public void updateAction() {
//        TODO EDIT PERSON INFO
    }

    //allows the user to double click the name in table and edit it
//    public void changeName(TableColumn.CellEditEvent editedCell) {
//        Person personSelected = (Person) tableView.getSelectionModel().getSelectedItem();
//        personSelected.setName(editedCell.getNewValue().toString());
//    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("Name");
        TableColumn phone = new TableColumn("Phone");
        TableColumn email = new TableColumn("E-mail");
        tableView.getColumns().addAll(id, name, email, phone);


        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("1", "John Brew", "john.brew@gmail.com", "0726487548"));


        id.setCellValueFactory(new PropertyValueFactory<Person, String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        email.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        phone.setCellValueFactory(new PropertyValueFactory<Person, String>("phone"));

        //sets table data
        tableView.setItems(data);
        tableView.setEditable(true);
        //Edit data in table
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        email.setCellFactory(TextFieldTableCell.forTableColumn());
        phone.setCellFactory(TextFieldTableCell.forTableColumn());
    }
}



