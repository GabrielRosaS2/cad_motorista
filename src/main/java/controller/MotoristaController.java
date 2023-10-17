package controller;

import dao.MotoristaDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Motorista;

import javax.swing.*;

public class MotoristaController {

    @FXML
    Button btnSalvar;

    @FXML
    TextField textNome;

    public void salvarCadastro(){

        //CRIAR UM OBJETO MOTORISTA
        Motorista motorista = new Motorista();

        //PEGAR DADOS DA TELA
        motorista.setNome(textNome.getText());

        //CHAMAR CLASSE DAO PARA INSERIR NO BANCO
        MotoristaDAO motoristaDAO = new MotoristaDAO();
        motoristaDAO.inserir(motorista);
    }


}
