module co.edu.uniquindio.universidad {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.universidad to javafx.fxml;
    exports co.edu.uniquindio.universidad;
}