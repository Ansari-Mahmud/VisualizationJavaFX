module mahmud.com.np.datavisualization {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens mahmud.com.np.datavisualization to javafx.fxml;
    exports mahmud.com.np.datavisualization;
}