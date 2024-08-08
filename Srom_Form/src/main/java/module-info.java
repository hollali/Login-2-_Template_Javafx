module com.example.srom_form {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.srom_form to javafx.fxml;
    exports com.example.srom_form;
}