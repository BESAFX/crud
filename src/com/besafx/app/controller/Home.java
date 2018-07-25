package com.besafx.app.controller;

import com.besafx.app.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

public class Home implements Initializable {

    @FXML
    Button create;

    @FXML
    Button update;

    @FXML
    Button delete;

    @FXML
    TableView<Customer> tableView = new TableView<>();

    @FXML
    TableColumn<Customer, String> tableColumn_id = new TableColumn<>();

    @FXML
    TableColumn<Customer, String> tableColumn_name = new TableColumn<>();

    @FXML
    TableColumn<Customer, String> tableColumn_mobile = new TableColumn<>();

    @FXML
    TableColumn<Customer, String> tableColumn_email = new TableColumn<>();

    @FXML
    TableColumn<Customer, String> tableColumn_address = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumn_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumn_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableColumn_mobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        tableColumn_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableColumn_address.setCellValueFactory(new PropertyValueFactory<>("address"));

        ObservableList<Customer> customers = FXCollections.observableArrayList();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("بسام المهدي");
        customer.setMobile("0540780551");
        customer.setEmail("islamhaker@gmail.com");
        customer.setAddress("عرعر - الحدود الشمالية - المملكة العربية السعودية");

        customers.add(customer);

        tableView.setItems(customers);
    }
}
