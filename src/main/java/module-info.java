module com.brainware.jbanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires java.base;
    requires jbcrypt;

    opens com.brainware.jbanking to javafx.fxml;
    opens com.brainware.controller to javafx.fxml;
    exports com.brainware.jbanking;
}
