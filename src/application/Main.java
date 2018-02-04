package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	Button nextB;
	Button previousB;
	
	Label lm1;
	Label lm2;
	Label lm3;
	
	Label l1;
	Label l2;
	Label l3;
	Label l4;
	Label l5;
	Label l6;
	Label l7;
	Label l8;
	Label l9;
	Label l10;
	
	
	Stage primaryStage;
	Label[] labels;
	
	int count;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		try {
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(setMyView());
			primaryStage.show();
			//setMyView();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	


	private void getPreviousHero() {
		//count++;
		//System.out.println(count);
		//return count;
		
		
	}

	private void getNextHero() {
		//count--;
		//System.out.println("count");
		//return count;
		
	}

	public Scene setMyView(){
		this.count=count;
		nextB = new Button("next");
		nextB.setId("nextB");
		previousB=new Button("previous");
		previousB.setId("previousB");
		
		lm1 = new Label();
		lm2 = new Label();
		lm2.setId("Lm2");
		lm2.setMaxHeight(300);
		lm2.setMaxHeight(250);
		
		lm3 = new Label();
		
		l1 = new Label();
		l1.setText("Antimage");
		l1.setId("L1");
		
		l2 = new Label();
		l2.setText("Broodmother");
		l2.setId("L2");
		
		l3 = new Label();
		l3.setText("Crystal Maiden");
		l3.setId("L3");
		
		l4 = new Label();
		l4.setText("Enchantress");
		l4.setId("L4");
		
		l5 = new Label();
		l5.setText("Kunkka");
		l5.setId("L5");
		
		l6 = new Label();
		l6.setText("Lina");
		l6.setId("L6");
		
		l7 = new Label();
		l7.setText("Luna");
		l7.setId("L7");
		
		l8 = new Label();
		l8.setText("Mirana");
		l8.setId("L8");
		
		l9 = new Label();
		l9.setText("Pudge");
		l9.setId("L9");
		
		l10 = new Label();
		l10.setText("Templar Assassin");
		l10.setId("L10");
		
		Label [] labels = new Label [10];
		this.labels=labels;
		labels[0] =  l1;
		labels[1] = l2;
		labels[2] = l3;
		labels[3] = l4;
		labels[4] = l5;
		labels[5] = l6;
		labels[6] = l7;
		labels[7] = l8;
		labels[8] = l9;
		labels[9] = l10;
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		grid.setHgap(50);
		grid.setVgap(50);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid, 725, 392);
		
		lm1 = labels[count];
		lm2 = labels[count+1];
		lm3 = labels[count+2];
		
		grid.add(lm1, 0, 0);
		grid.add(lm2, 1, 0);
		grid.add(lm3, 2, 0);
		grid.add(previousB, 0, 1);
		grid.add(nextB, 2, 1);
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		initListeners();
		return scene;
	}
	
	public Scene setNextMyView(int count){
		nextB = new Button("next");
		nextB.setId("nextB");
		previousB=new Button("previous");
		previousB.setId("previousB");
		
		Label lm1 = new Label();
		Label lm2 = new Label();
		lm2.setId("Lm2");
		lm2.setPrefWidth(300);
		lm2.setPrefHeight(250);
		Label lm3 = new Label();
		
		Label l1 = new Label();
		l1.setText("Antimage");
		l1.setId("L1");
		
		Label l2 = new Label();
		l2.setText("Broodmother");
		l2.setId("L2");
		
		Label l3 = new Label();
		l3.setText("Crystal Maiden");
		l3.setId("L3");
		
		Label l4 = new Label();
		l4.setText("Enchantress");
		l4.setId("L4");
		
		Label l5 = new Label();
		l5.setText("Kunkka");
		l5.setId("L5");
		
		Label l6 = new Label();
		l6.setText("Lina");
		l6.setId("L6");
		
		Label l7 = new Label();
		l7.setText("Luna");
		l7.setId("L7");
		
		Label l8 = new Label();
		l8.setText("Mirana");
		l8.setId("L8");
		
		Label l9 = new Label();
		l9.setText("Pudge");
		l9.setId("L9");
		
		Label l10 = new Label();
		l10.setText("Templar Assassin");
		l10.setId("L10");
		
		Label [] labels = new Label [10];
		this.labels=labels;
		labels[0] =  l1;
		labels[1] = l2;
		labels[2] = l3;
		labels[3] = l4;
		labels[4] = l5;
		labels[5] = l6;
		labels[6] = l7;
		labels[7] = l8;
		labels[8] = l9;
		labels[9] = l10;
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		grid.setHgap(50);
		grid.setVgap(50);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid, 725, 392);
		
		lm1 = labels[count];
		if(count<9) {lm2 = labels[count+1];} else lm2 = labels[0]; 
		if(count<8) {lm3 = labels[count+2];} else lm3 = labels[1]; 
		
		grid.add(lm1, 0, 0);
		grid.add(lm2, 1, 0);
		grid.add(lm3, 2, 0);
		grid.add(previousB, 0, 1);
		grid.add(nextB, 2, 1);
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		initListeners();
		return scene;
	}
	
	private void initListeners() {
		nextB.setOnMouseClicked((e)->{
			setNext();
		});
		
		previousB.setOnMouseClicked((e)->{
			setPrevios();
		});
		
	}



	private void setPrevios() {
		if(count>0){
			count--;
			}else count=9;
			System.out.println(count);
			setNextMyView(count);
			//return count;
		
	}



	private void setNext() {
		if(count<9){
		count++;
		}else count=0;
		System.out.println(count);
		setNextMyView(count);
		//return count;
		
	}



	public static void main(String[] args) {
		launch(args);
	}
}
