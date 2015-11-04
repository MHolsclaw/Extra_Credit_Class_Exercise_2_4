package assignment4;

import java.util.Collections;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class UserDriver extends Application
{
	private static final int SIZE = 10;
	private static User [] users = new User[SIZE];
	private int count=0;
	public static void main(String[] args)
	{
		launch(args);
		int i=0;
		while(i<SIZE)
		{
			System.out.println(users[i]);
			i++;
		}
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		
		
		primaryStage.setTitle("Sign Up Page");
		Label nameLabel = new Label("First Name");
		Label lastNameLabel = new Label("Last Name");
		Label emailLabel = new Label("Email");
		Label userNameLabel = new Label("User Name");
		Label passwordLabel = new Label("Password");
		Label confirmLabel = new Label("Confirm Password");
		TextField nameTextField = new TextField();
		TextField lastNameTextField = new TextField();
		TextField emailTextField = new TextField();
		TextField userNameTextField = new TextField();
		PasswordField pwTextField = new PasswordField();
		PasswordField confirmPwTextField = new PasswordField();
		ComboBox acTypeCmbBox = new ComboBox();
		acTypeCmbBox.getItems().addAll(AccountType.values());
		Label passwordErrorLabel = new Label("");
		
		
		
		
		Button submitBtn = new Button("Sign Up");
		submitBtn.setOnAction(new EventHandler<ActionEvent>()
		{
			String inputUserName = "";
			String inputPw = "";
			String inputConfirmPw = "";
			String inputEmail = "";
			String emailPattern = "\\w+@\\w+\\.\\w+";
			String pwPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}";
			
			boolean nameStatus, lastNameStatus, emailStatus, userNameStatus, pwStatus, confirmPwStatus = false;
			
			@Override
			public void handle(ActionEvent arg0)
			{
				nameStatus = validateFill(nameTextField);
				if (!nameStatus)
				{
					System.out.println("Warning: 'Name' field empty");
				}
				lastNameStatus = validateFill(lastNameTextField);
				if (!lastNameStatus)
				{
					System.out.println("Warning: 'Last Name' field empty");
				}
				emailStatus = validateFill(emailTextField);
				if (!emailStatus)
				{
					System.out.println("Warning: 'Email ' field empty");
				}
				userNameStatus = validateFill(userNameTextField);
				if (!userNameStatus)
				{
					System.out.println("Warning: 'User Name' field empty");
				}
				pwStatus = validateFill(pwTextField);
				if (!pwStatus)
				{
					System.out.println("Warning: 'Password' field empty");
				}
				confirmPwStatus = validateFill(confirmPwTextField);
				if (!confirmPwStatus)
				{
					System.out.println("Warning: 'Confirm Password' field empty");
				}
				inputUserName = userNameTextField.getText();
				inputPw = pwTextField.getText();
				inputConfirmPw = confirmPwTextField.getText();
				inputEmail = emailTextField.getText();
				
				if (nameStatus && lastNameStatus && emailStatus && userNameStatus && pwStatus && confirmPwStatus && inputPw.length()>=8 && inputEmail.matches(emailPattern) && inputPw.matches(pwPattern) && inputPw.matches(inputConfirmPw))
				{
					users[count] = new User(inputUserName, inputPw);
					count++;
					JOptionPane.showMessageDialog(null, "Account '" + inputUserName + "' created! Accounts Stored: " + count + "/10");
				}
				
				else
				{
					if (!inputEmail.matches(emailPattern))
					{
						System.out.println("Warning: email must be in xxxx@xxx.xxx format.");
					}
					if (!inputPw.matches(inputConfirmPw))
					{
						System.out.println("Warning: passwords do not match.");
					}
					if (inputPw.length()<8)
					{
						System.out.println("Warning: password length too short (minimum: 8 characters).");
					}
					if (!inputPw.matches(pwPattern))
					{
						System.out.println("Warning: password must contain at least one uppercase character, lowercase character, base 10 digit, and nonalphanumeric character.");
					}
				}
												
			}
			
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(nameLabel, 0, 0);
		grid.add(lastNameLabel, 0, 1);
		grid.add(emailLabel, 0, 2);
		grid.add(userNameLabel, 0, 3);
		grid.add(passwordLabel, 0, 4);
		grid.add(confirmLabel, 0, 5);
		grid.add(nameTextField, 1, 0);
		grid.add(lastNameTextField, 1, 1);
		grid.add(emailTextField, 1, 2);
		grid.add(userNameTextField, 1, 3);
		grid.add(pwTextField, 1, 4);
		grid.add(confirmPwTextField, 1, 5);
		grid.add(acTypeCmbBox, 1, 6);
		grid.add(passwordErrorLabel, 2, 4);
		grid.add(submitBtn, 1, 7);
		
		Scene scene = new Scene(grid, 500, 500);
		scene.getStylesheets().add("JavaFx.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

	
	
	private boolean validateFill(TextField tf)
	{
		boolean pass = false;
		ObservableList<String> styleClass = tf.getStyleClass();
		if (tf.getText().trim().length() == 0)
		{
			if (!styleClass.contains("error"))
			{
				styleClass.add("error");
			}
		}
		
		else
		{
			//remove all occurrences:
			styleClass.removeAll(Collections.singleton("error"));
			pass = true;
		}
		return pass;
	}
}
