module com.brainware.jbanking {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.brainware.jbanking to javafx.fxml;
    exports com.brainware.jbanking;
}
