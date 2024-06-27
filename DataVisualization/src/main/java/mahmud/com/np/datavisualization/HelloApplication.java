package mahmud.com.np.datavisualization;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class HelloApplication extends Application {
    private static final Map<String, Long> coutriesAndPopulation = new HashMap<>() {
        {
            put("China", 152546L);
            put("India", 142548L);
            put("United States", 92222L);
            put("Indonesia", 20455L);
            put("Nepal", 255000L);
        }
    };

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        XYChart.Series series = new XYChart.Series();
        for (Map.Entry entry : coutriesAndPopulation.entrySet()) {
            series.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("x");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("y");
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.getData().add(series);
        Scene scene = new Scene(barChart,800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void draw() {
        launch(null);
    }
}