module com.mycompany.tabla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tabla to javafx.fxml;
    exports com.mycompany.tabla;
}
