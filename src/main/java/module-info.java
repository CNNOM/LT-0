module com.example.progect_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progect_1 to javafx.fxml;
    exports com.example.progect_1;
}