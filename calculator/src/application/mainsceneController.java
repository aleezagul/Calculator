package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;

public class mainsceneController {
	@FXML
	private Button btnequals;
	@FXML
	private Button btn2;
	@FXML
	private Button btnplus;
	@FXML
	private Button btn0;
	@FXML
	private Button btn4;
	@FXML
	private Button btn3;
	@FXML
	private Button btnminus;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btnmultiply;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn0divide;
	@FXML
	private Button btnac;
	@FXML
	private TextArea textbox;
	@FXML
	private Button btn1;

	// Event Listener on Button[#btnequals].onAction
	@FXML
	public void btequalsclicked(ActionEvent event) {
String equals=textbox.getText();
String[] op=equals.split("[-+/x]");
String r1=op[0];
String r2=op[1];
if (equals.contains("-"))
{
	double results=Integer.parseInt(r1) - Integer.parseInt(r2);
	textbox.setText(String.valueOf(results));
}
if (equals.contains("+"))
{
	double results=Integer.parseInt(r1) + Integer.parseInt(r2);
	textbox.setText(String.valueOf(results));
}
if (equals.contains("/"))
{
	double results=Integer.parseInt(r1) / Integer.parseInt(r2);
	textbox.setText(String.valueOf(results));
}
if (equals.contains("x"))
{
	double results=Integer.parseInt(r1) * Integer.parseInt(r2);
	textbox.setText(String.valueOf(results));
}
}
	// Event Listener on Button[#btn2].onAction
	@FXML
	public void bt2clicked(ActionEvent event) {
		String n2=btn2.getText();
		textbox.appendText(n2);
	}
	// Event Listener on Button[#btnplus].onAction
	@FXML
	public void btplusclicked(ActionEvent event) {
		String nplus=btnplus.getText();
		textbox.appendText(nplus);	}
	// Event Listener on Button[#btn0].onAction
	@FXML
	public void bt0clicked(ActionEvent event) {
		String n0=btn0.getText();
		textbox.appendText(n0);
	}
	// Event Listener on Button[#btn4].onAction
	@FXML
	public void bt4clicked(ActionEvent event) {
		String n4=btn4.getText();
		textbox.appendText(n4);	}
	// Event Listener on Button[#btn3].onAction
	@FXML
	public void bt3clicked(ActionEvent event) {
		String n3=btn3.getText();
		textbox.appendText(n3);	}
	// Event Listener on Button[#btnminus].onAction
	@FXML
	public void btminusclicked(ActionEvent event) {
		String nminus=btnminus.getText();
		textbox.appendText(nminus);	}
	// Event Listener on Button[#btn5].onAction
	@FXML
	public void bt5clicked(ActionEvent event) {
		String n5=btn5.getText();
		textbox.appendText(n5);	}
	// Event Listener on Button[#btn6].onAction
	@FXML
	public void bt6clicked(ActionEvent event) {
		String n6=btn6.getText();
		textbox.appendText(n6);	}
	// Event Listener on Button[#btnmultiply].onAction
	@FXML
	public void btmultiplyclicked(ActionEvent event) {
		String nmultiply=btnmultiply.getText();
		textbox.appendText(nmultiply);	}
	// Event Listener on Button[#btn7].onAction
	@FXML
	public void bt7clicked(ActionEvent event) {
		String n7=btn7.getText();
		textbox.appendText(n7);	}
	// Event Listener on Button[#btn8].onAction
	@FXML
	public void bt8clicked(ActionEvent event) {
		String n8=btn8.getText();
		textbox.appendText(n8);	}
	// Event Listener on Button[#btn9].onAction
	@FXML
	public void bt9clicked(ActionEvent event) {
		String n9=btn9.getText();
		textbox.appendText(n9);	}
	// Event Listener on Button[#btn0divide].onAction
	@FXML
	public void btdivideclicked(ActionEvent event) {
		String ndivide=btn0divide.getText();
		textbox.appendText(ndivide);	}
	// Event Listener on Button[#btnac].onAction
	@FXML
	public void btacclicked(ActionEvent event) {
		String nac=btnac.getText();
		textbox.setText("");	}
	// Event Listener on Button[#btn1].onAction
	@FXML
	public void bt1clicked(ActionEvent event) {
		String n1=btn1.getText();
		textbox.appendText(n1);
	}
}
