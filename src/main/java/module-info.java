module com.example.ritpogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ritpogram to javafx.fxml;
    exports com.example.ritpogram;
}