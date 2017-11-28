package employee.view;

import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddNewEmployeeController {
	ObservableList<String> maritalStatusList = FXCollections.observableArrayList("Single","Married","Divorced");
	ObservableList<String> mainDepartmentList = FXCollections.observableArrayList("Electrical","Mechanical");
	//General information
	@FXML
	private TextField namefield;
	@FXML
	private TextField addressfield;
	@FXML
	private TextField Cityfield;
	@FXML
	private TextField Mobilefield;
	@FXML
	private TextField Faxfield;
	
	//personal information
	@FXML
	private DatePicker dateofBirth;
	@FXML
	private TextField age;
	@FXML
	private ChoiceBox maritalStatusBox;
	@FXML
	private RadioButton maleBtn;
	@FXML
	private RadioButton femalebtn;
	//Employee Informations
	@FXML
	private TextField idField;
	@FXML
	private ComboBox mainDepartmentBox;
	
	
	@FXML
	private void initialize(){
		maritalStatusBox.setValue("Single");
		maritalStatusBox.setItems(maritalStatusList);
		
		mainDepartmentBox.setValue("Electrical");
		mainDepartmentBox.setItems(mainDepartmentList);
		
	}
	
	@FXML
	private void showAge(){
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int birthYear = (dateofBirth.getValue().getYear());
		int Age = year - birthYear;
		age.setText(Integer.toString(Age) + "Years");
		
	}
}
