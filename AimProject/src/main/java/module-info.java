module hust.soict.globalict.aim {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;


    opens hust.soict.globalict to javafx.fxml;
    exports hust.soict.globalict;
}