package IMC;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class fenetre extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 500, 500);

			GridPane gridpane = new GridPane();
			gridpane.setPadding(new Insets(5));
			gridpane.setHgap(5);
			gridpane.setVgap(5);
			ColumnConstraints column1 = new ColumnConstraints(150);
			ColumnConstraints column2 = new ColumnConstraints(150, 200, 300);

			gridpane.setPadding(new Insets(15, 12, 15, 12));
			gridpane.setStyle("-fx-background-color: #758699;");
			
			ObservableList<String> options = 
				    FXCollections.observableArrayList(
				        "Masculin",
				        "Feminin"
				    );
				final ComboBox textSexe = new ComboBox(options);
				
			Label Nom = new Label("Nom:");
		    TextField textName = new TextField ();
		    Label Prenom = new Label("Prenom:");
		    TextField textPrenom = new TextField ();
		    Label Poids = new Label("Poids(kg):");
		    TextField textPoids = new TextField ();
		    Label Taille = new Label("Taille(m):");
		    TextField textTaille = new TextField ();
		    Label Sexe = new Label("Sexe:");
		    
		    Button buttonStart = new Button("Calculez");
			buttonStart.setPrefSize(100, 20);
			
			Label IMC = new Label("IMC");
		    Label textIMC = new Label ();
		    
		    
		    Label PoidsMax = new Label("Poids Maximum (kg):");
		    Label textPoidsMax = new Label ();
		    Label PoidsIdeal = new Label("Poids Ideal (kg):");
		    Label textPoidsIdeal = new Label ();
		    Label PoidsMin = new Label("Poids Minimum (kg):");
		    Label textPoidsMin = new Label ();

			gridpane.getColumnConstraints().addAll(column1, column2);

		    gridpane.add(Nom, 0, 0);
		    gridpane.add(textName, 1, 0);
		    gridpane.add(Prenom, 0, 1);
		    gridpane.add(textPrenom, 1, 1);
		    gridpane.add(Taille, 0, 2);
		    gridpane.add(textTaille, 1, 2);
		    gridpane.add(Poids, 0, 3);
		    gridpane.add(textPoids, 1, 3);
		    gridpane.add(Sexe, 0, 4);
		    gridpane.add(textSexe, 1, 4);
		    gridpane.add(buttonStart, 0, 5);
		    GridPane.setHalignment(buttonStart, HPos.CENTER);
		    gridpane.add(IMC, 0, 6);
		    gridpane.add(textIMC, 1, 6);
		    gridpane.add(PoidsMax, 0, 7);
		    gridpane.add(textPoidsMax, 1, 7);
		    gridpane.add(PoidsIdeal, 0, 8);
		    gridpane.add(textPoidsIdeal, 1, 8);
		    gridpane.add(PoidsMin, 0, 9);
		    gridpane.add(textPoidsMin, 1, 9);	   
		    
		    
		    
		    
		    buttonStart.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					Personne p1 = new Personne();
					p1.nom = textName.getText();
					p1.prenom = textPrenom.getText();
					p1.poids = Double.parseDouble(textPoids.getText()) ;
					p1.taille = Double.parseDouble(textTaille.getText()) ;
					p1.sexe = (textSexe.getValue() == "Masculin");
					
					
					textIMC.setText(""+p1.IMC());
					textPoidsMax.setText(""+p1.poidsMax());
					textPoidsIdeal.setText(""+p1.poidsIdeal());
					textPoidsMin.setText(""+p1.poidsMin());
					
				}
			
		    	
		    });
		    
		    root.setCenter(gridpane);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("IMC Calculator");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}