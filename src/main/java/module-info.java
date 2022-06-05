module com.example.listcustom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listcustom to javafx.fxml;
    exports com.example.listcustom;
}