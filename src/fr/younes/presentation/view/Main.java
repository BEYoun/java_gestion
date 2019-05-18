package fr.younes.presentation.view;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        Label lblCurrentQuestion = new Label();
        ProgressBar prgb = new ProgressBar(0);

        int numberOfQuestions = 5;//Number of questions
        int timeForEachQuestion = 3;//3 second to do each questions
        AtomicInteger currentProgressCounter = new AtomicInteger(0);
        AtomicInteger currentQuestionCounter = new AtomicInteger(1);

        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), (event) -> {
            if (currentProgressCounter.get() == timeForEachQuestion + 1) {
                //Go to next question!
                prgb.setProgress(0);
                currentProgressCounter.set(0);
                currentQuestionCounter.incrementAndGet();
            }
            lblCurrentQuestion.setText("Question " + currentQuestionCounter.get());
            prgb.setProgress(currentProgressCounter.getAndIncrement() / (double) timeForEachQuestion);
        }));

        fiveSecondsWonder.setCycleCount(numberOfQuestions * (timeForEachQuestion + 1));
        fiveSecondsWonder.play();
        fiveSecondsWonder.setOnFinished(event -> {
            PauseTransition wait = new PauseTransition(Duration.seconds(1));
            wait.setOnFinished((e) -> {
                /*YOUR METHOD*/
                lblCurrentQuestion.setText("Quiz done!");
                prgb.setProgress(0);
                wait.playFromStart();
            });
            wait.play();
        });

        Scene scene = new Scene(new StackPane(new VBox(lblCurrentQuestion, prgb)), 500, 500);

        stage.setScene(scene);
        stage.show();
    }
}