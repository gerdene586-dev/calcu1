module mn.gansvkh {
    requires javafx.controls;
    requires javafx.fxml;

    opens mn.gansvkh to javafx.fxml;
    exports mn.gansvkh;
}
