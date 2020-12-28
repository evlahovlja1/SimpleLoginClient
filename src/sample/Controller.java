package sample;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.Socket;

public class Controller {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Button login;


    public void loginAction(ActionEvent actionEvent) {
        Task<Object> sendRequest = new Task<>() {
            @Override
            protected Object call() throws Exception {
                System.out.println("socket boi");
                Socket socket = new Socket("127.0.0.1", 12345);

                return  null;
            }
        };

        sendRequest.run();

        sendRequest.setOnSucceeded(workerStateEvent -> {
            username.setText("SUCCESS");
        });
    }
}
