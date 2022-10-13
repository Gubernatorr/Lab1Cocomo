module java.classes {
    requires javafx.controls;
    requires javafx.fxml;

    opens classes to javafx.fxml;
    exports classes;
}