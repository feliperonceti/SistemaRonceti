/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */
public class ClienteControleFgv extends AbstractTableModel {

    private List lista;
    
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public ClienteFgv getBean(int linha) {
        return (ClienteFgv) lista.get(linha);
    }
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteFgv clientefgv = (ClienteFgv) lista.get(rowIndex);
        if (columnIndex == 0) {
            return clientefgv.getIdclienteFgv();
        }
        if (columnIndex == 1) {
            return clientefgv.getNomeFgv();
        }
        if (columnIndex == 2) {
            return clientefgv.getApelidoFgv();
        }
        if (columnIndex == 3) {
            return clientefgv.getTelefoneFgv();
        }
          if (columnIndex == 4) {
            return clientefgv.getSexoFgv();
        }
           if (columnIndex == 5) {
            return clientefgv.getCnpjFgv();
        }
           if (columnIndex == 6) {
            return clientefgv.getEmailFgv();
        }
           if (columnIndex == 7) {
            return clientefgv.getEnderecoFgv();
        }
           if (columnIndex == 8) {
            return clientefgv.getUfFgv();
        }
            if (columnIndex == 9) {
            return clientefgv.getNacionalidadeFgv();
        }
            if (columnIndex == 10) {
            return clientefgv.getRgFgv();
        }
            if (columnIndex == 11) {
            return clientefgv.getBairroFgv();
        }
            if (columnIndex == 12) {
            return clientefgv.getEstadocivilFgv();
        }
            if (columnIndex == 13) {
            return clientefgv.getCepFgv();
        }
            if (columnIndex == 14) {
            return clientefgv.getCpfFgv();
        }
        return "";
    }
    
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "Telefone";
        }
        if (columnIndex == 4) {
            return "Sexo";
        }
        if (columnIndex == 5) {
            return "Cnpj";
        }
        if (columnIndex == 6) {
            return "Email";
        }
        if (columnIndex == 7) {
            return "Endereco";
        }
        if (columnIndex == 8) {
            return "Uf";
        }
        if (columnIndex == 9) {
            return "Nacionalidade";
        }
        if (columnIndex == 10) {
            return "Rg";
        }
        if (columnIndex == 11) {
            return "Bairro";
        }
        if (columnIndex == 12) {
            return "Estadocivil";
        }
        if (columnIndex == 13) {
            return "Cep";
        }
        if (columnIndex == 14) {
            return "Cpf";
        }
        return "";
    }
}
