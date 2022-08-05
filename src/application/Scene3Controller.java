package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Scene3Controller {

	@FXML
    public TextField currentweightTextField;

    @FXML
    private TextField weightToChange;

    @FXML
    private ChoiceBox<String> weightChange;

    @FXML
    private ChoiceBox<String> genderChoiceBox;

    @FXML
    private ChoiceBox<String> weeklyWeightChange;

    @FXML
    private TextField heightTextField;

    @FXML
    private Label sceneThreeErrorLabel;

    @FXML
    private ChoiceBox<String> activityLevelChoiceBox;

    @FXML
    private TextField ageTextField;

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void switchToScene4(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_4.fxml"));
		root = loader.load();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));

		ErrorMessage error = new ErrorMessage(genderChoiceBox.getValue(), ageTextField.getText(),
				heightTextField.getText(), currentweightTextField.getText(), weightToChange.getText(),
				activityLevelChoiceBox.getValue(), weeklyWeightChange.getValue(), weightChange.getValue());

		sceneThreeErrorLabel.setText(error.getErrorText());

		if (error.isChangeScene()) {

			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			Person user = new Person(genderChoiceBox.getValue(), Integer.parseInt(ageTextField.getText()),
					Integer.parseInt(heightTextField.getText()), Integer.parseInt(currentweightTextField.getText()),
					Double.parseDouble(weeklyWeightChange.getValue()), weightChange.getValue(),
					Integer.parseInt(weightToChange.getText()), activityLevelChoiceBox.getValue());
			Scene6Controller.weight=Integer.parseInt(currentweightTextField.getText());
			Scene4Controller s4c = loader.getController();
			setLabelText(user, s4c);

		}
	}

	void setLabelText(Person theUser, Scene4Controller s4c) {
		
		Bmi usersBmi = new Bmi(theUser.getHeight(), theUser.getWeight());
		
		s4c.bmiLabelNew.setText(String.format("%.1f", usersBmi.getBmiValue()));
		s4c.obesityLabelNew.setText(usersBmi.obesityLabelText(usersBmi.getBmiValue()));

		s4c.bmrLabelNew.setText(theUser.getBmr() + "");

		s4c.targetStuff.setText(theUser.getDailyIntake() + "");
		Scene6Controller.recommendedIntake=theUser.getDailyIntake();

		s4c.requiredDays.setText(theUser.getDaysNeeded() + "");

	}
}