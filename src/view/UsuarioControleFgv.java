/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuarioFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuarioControleFgv extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public UsuarioFgv getBean(int linha) {
        return (UsuarioFgv) lista.get(linha);
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
        UsuarioFgv usuariofgv = (UsuarioFgv) lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuariofgv.getIdusuarioFgv();
        }
        if (columnIndex == 1) {
            return usuariofgv.getNomeFgv();
        }
        if (columnIndex == 2) {
            return usuariofgv.getApelidoFgv();
        }
        if (columnIndex == 3) {
            return usuariofgv.getCpfFgv();
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
            return "CPF";
        }
        return "";
    }
}

    


