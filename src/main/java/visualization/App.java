package visualization;

import window.Window;

import graph.OSM_Graph;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import osm.OSM_Parser;

/**
 * App class is the main class in the program
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        /*OSM_Graph osm_graph = OSM_Parser.CreateGraph("src\\main\\resources\\osm\\cracow.pbf");

        MapPane mapPane = new MapPane(osm_graph);
//        mapPane.drawNodes();
        mapPane.drawLines();

        Scene scene = new Scene(mapPane);
        stage.setScene(scene);
        stage.show();
        */

        Window window = new Window();

        stage.setScene(window.getScene());
        stage.show();
    }
}