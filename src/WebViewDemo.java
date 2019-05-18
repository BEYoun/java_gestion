
 
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class WebViewDemo extends Application {
 
    @Override
	    public void start(final Stage stage) {
 
        
        
 
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
 
        
        try {
            File file = new File("C:/test/a.html");
            URL url = file.toURI().toURL();
            // file:/C:/test/a.html
            System.out.println("Local URL: " + url.toString());
            webEngine.load(url.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);
        root.getChildren().add(browser);
 
        Scene scene = new Scene(root);
 
        stage.setTitle("JavaFX WebView (o7planning.org)");
        stage.setScene(scene);
        stage.setWidth(450);
        stage.setHeight(300);
 
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}