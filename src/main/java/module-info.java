module com.example.sqlhelper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sqlhelper to javafx.fxml;
    exports com.example.sqlhelper;
}