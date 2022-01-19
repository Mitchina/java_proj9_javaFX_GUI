module com.example.java_proj9_javafx_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_proj9_javafx_gui to javafx.fxml;
    exports com.example.java_proj9_javafx_gui;
}