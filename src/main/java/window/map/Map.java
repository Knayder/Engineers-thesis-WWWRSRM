package window.map;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map extends Canvas {
    private double width;
    private double height;
    public Map(double width, double height) {
        super(width, height);
        
        this.width = width;
        this.height = height;
        

        GraphicsContext gc = this.getGraphicsContext2D();
        gc.clearRect(0, 0, width, height);
        gc.setFill(Color.BLUE);
        gc.fillRect(75,75,100,100);

        gc.setStroke(Color.SANDYBROWN);
        gc.setLineWidth(3);

        gc.strokeLine(0, 0, width, height);

    }
}
