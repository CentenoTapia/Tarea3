package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        MenuBar menuBar = new MenuBar();

        
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        
        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem abrirItem = new MenuItem("Abrir");
        MenuItem guardarItem = new MenuItem("Guardar");
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        MenuItem salirItem = new MenuItem("Salir");

        
        nuevoItem.setOnAction(e -> System.out.println("Nuevo archivo"));
        abrirItem.setOnAction(e -> System.out.println("Abrir archivo"));
        guardarItem.setOnAction(e -> System.out.println("Guardar archivo"));
        salirItem.setOnAction(e -> {
            System.out.println("Salir de la aplicación");
            primaryStage.close();
        });

        
        menuArchivo.getItems().addAll(nuevoItem, abrirItem, guardarItem, separator1, salirItem);

        
        MenuItem cortarItem = new MenuItem("Cortar");
        MenuItem copiarItem = new MenuItem("Copiar");
        MenuItem pegarItem = new MenuItem("Pegar");

        
        cortarItem.setOnAction(e -> System.out.println("Cortar"));
        copiarItem.setOnAction(e -> System.out.println("Copiar"));
        pegarItem.setOnAction(e -> System.out.println("Pegar"));

        
        menuEditar.getItems().addAll(cortarItem, copiarItem, pegarItem);

        
        MenuItem acercaDeItem = new MenuItem("Acerca de");

        
        acercaDeItem.setOnAction(e -> System.out.println("Acerca de esta aplicación"));

       
        menuAyuda.getItems().addAll(acercaDeItem);

        
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

       
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        
        Scene scene = new Scene(root, 400, 300);

        
        primaryStage.setTitle("Ejemplo de Menu en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
