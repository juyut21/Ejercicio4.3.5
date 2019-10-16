/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventoTeclado;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class EventoTeclado extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Pane root = new Pane();
        Text a = new Text(20, 20, "A");
        root.getChildren().add(a);
        a.setFocusTraversable(true);
        
        a.setOnKeyPressed((KeyEvent e) -> {
            switch(e.getCode())
            {
                case DOWN:
                
                    a.setLayoutY(a.getLayoutY()+ 10);
                    break;
                    
                case UP:
                    
                    a.setLayoutY(a.getLayoutY()- 10);
                    break;
                    
                case RIGHT:
                    
                    a.setLayoutX(a.getLayoutX()+ 10);
                    break;
                
                    
                case LEFT:
                    a.setLayoutX(a.getLayoutX()- 10);
                    break;
                
            }
        });
        
    
        
       
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
