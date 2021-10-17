package buscarremplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazar extends Application {

	private Label buscarLabel, remplazarLabel, MayusculasLabel, BuscarHaciaAtrasLabel, ExpresionRegularLabel,
			ResaltarLabel,espacio1,espacio2;

	private TextField buscarTextField, remplazarTextField;

	private Button buscarButton, remplazarButton, RemplazarTodoButton, cerrarButton, ayudaButton;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarLabel = new Label("Buscar:");
		buscarLabel.setMinWidth(90);

		remplazarLabel = new Label("Remplazar con:");
		remplazarLabel.setMinWidth(90);
		
		espacio1=new Label(" ");
		espacio1.setMinWidth(90);
		
		espacio2= new Label("");
		espacio2.setMinWidth(90);

		MayusculasLabel = new Label("Mayúsculas y minúsculas");
		BuscarHaciaAtrasLabel = new Label("Buscar hacia atrás");
		ExpresionRegularLabel = new Label("Expresion regular");
		ResaltarLabel = new Label("Resaltar resultados");

		buscarTextField = new TextField();
		buscarTextField.setMinWidth(300);
		buscarTextField.setMaxWidth(300);
		remplazarTextField = new TextField();
		remplazarTextField.setMinWidth(300);
		remplazarTextField.setMaxWidth(300);

		buscarButton = new Button("Buscar");
		buscarButton.setMinWidth(110);
		remplazarButton = new Button("Reemplazar");
		remplazarButton.setMinWidth(110);
		RemplazarTodoButton = new Button("Reemplazar todo");
		RemplazarTodoButton.setMinWidth(110);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMinWidth(110);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMinWidth(110);

		CheckBox mayu = new CheckBox();
		mayu.setIndeterminate(false);

		CheckBox busc = new CheckBox();
		busc.setIndeterminate(false);

		CheckBox expr = new CheckBox();
		expr.setIndeterminate(false);

		CheckBox resa = new CheckBox();
		resa.setIndeterminate(false);
		
		
		GridPane oeste= new GridPane();
		oeste.addRow(0, buscarLabel, buscarTextField);
		oeste.addRow(1, remplazarLabel,remplazarTextField);
		oeste.addRow(2, mayu,MayusculasLabel,busc,BuscarHaciaAtrasLabel);
		oeste.addRow(3,expr,ExpresionRegularLabel,resa,ResaltarLabel);
		
		
		
		// parte derecha
		VBox botones = new VBox(buscarButton, remplazarButton, RemplazarTodoButton, cerrarButton, ayudaButton);
		botones.setSpacing(5);
	

		BorderPane paneDerecha = new BorderPane();
		paneDerecha.setRight(botones);

		
		BorderPane root= new BorderPane();
		root.setLeft(oeste);
		root.setRight(paneDerecha);

		Scene scene = new Scene(root, 640, 480);

		primaryStage.setTitle("BorderPane Sample");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
