package main.java.com.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TransitionController {
    
    public void transitionAddScreen(ActionEvent eEvent) throws IOException {
        Parent pRoot = FXMLLoader.load(getClass().getResource("../../../resources/com/view/AddScreen.fxml"));
        Stage sStage = (Stage)((Node)eEvent.getSource()).getScene().getWindow();
        Scene sScene = new Scene(pRoot);
        sStage.setScene(sScene);
        sStage.show();
    }

    public void transitionRemoveScreen(ActionEvent eEvent) throws IOException {
        Parent pRoot = FXMLLoader.load(getClass().getResource("../../../resources/com/view/RemoveScreen.fxml"));
        Stage sStage = (Stage)((Node)eEvent.getSource()).getScene().getWindow();
        Scene sScene = new Scene(pRoot);
        sStage.setScene(sScene);
        sStage.show();
    }

    public void transitionAnalyzeScreen(ActionEvent eEvent) throws IOException {
        Parent pRoot = FXMLLoader.load(getClass().getResource("../../../resources/com/view/AnalyzeScreen.fxml"));
        Stage sStage = (Stage)((Node)eEvent.getSource()).getScene().getWindow();
        Scene sScene = new Scene(pRoot);
        sStage.setScene(sScene);
        sStage.show();
    }

    public void transitionMenuScreen(ActionEvent eEvent) throws IOException {
        Parent pRoot = FXMLLoader.load(getClass().getResource("../../../resources/com/view/MenuScreen.fxml"));
        Stage sStage = (Stage)((Node)eEvent.getSource()).getScene().getWindow();
        Scene sScene = new Scene(pRoot);
        sStage.setScene(sScene);
        sStage.show();
    }

}
