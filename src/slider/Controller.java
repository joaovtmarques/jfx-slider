package slider;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Controller implements Initializable {

  @FXML
  private Label exit;
  private Pane pane1;
  private Pane pane2;
  private Pane pane3;
  private Pane pane4;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    exit.setOnMouseClicked(event -> {
      System.exit(0);
    });
    
    SliderAnimation();
  }

  private void SliderAnimation() {
    FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3),pane4);
    fadeTransition.setFromValue(1);
    fadeTransition.setToValue(0);
    fadeTransition.play();

    fadeTransition.setOnFinished(event -> {
      FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3),pane3);
      fadeTransition1.setFromValue(1);
      fadeTransition1.setToValue(0);
      fadeTransition1.play();
      
      fadeTransition1.setOnFinished(event1 -> {
        FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3),pane2);
        fadeTransition2.setFromValue(1);
        fadeTransition2.setToValue(0);
        fadeTransition2.play();

        fadeTransition2.setOnFinished(event2 -> {
          FadeTransition fadeTransition0 = new FadeTransition(Duration.seconds(3),pane2);
          fadeTransition0.setFromValue(1);
          fadeTransition0.setToValue(0);
          fadeTransition0.play();

          fadeTransition0.setOnFinished(event3 -> {
            FadeTransition fadeTransition11 = new FadeTransition(Duration.seconds(3),pane3);
            fadeTransition11.setFromValue(1);
            fadeTransition11.setToValue(0);
            fadeTransition11.play();

            fadeTransition11.setOnFinished(event4 -> {
              FadeTransition fadeTransition22 = new FadeTransition(Duration.seconds(3),pane4);
              fadeTransition22.setFromValue(1);
              fadeTransition22.setToValue(0);
              fadeTransition11.play();

              fadeTransition22.setOnFinished(event5 -> {
                SliderAnimation();
              });
            });
          });
        });
      });
    });
  }
}
