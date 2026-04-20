module com.brainware.jbanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens com.brainware.jbanking to javafx.fxml;
    exports com.brainware.jbanking;
}
