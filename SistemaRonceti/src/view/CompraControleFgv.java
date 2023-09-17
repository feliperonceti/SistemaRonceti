/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CompraFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */
public class CompraControleFgv extends AbstractTableModel {
        private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public CompraFgv getBean(int linha) {
        return (CompraFgv) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CompraFgv comprafgv = (CompraFgv) lista.get(rowIndex);
        if (columnIndex == 0) {
            return comprafgv.getIdcompraFgv();
        }
        if (columnIndex == 1) {
            return comprafgv.getNomeclienteFgv();
        }
        if (columnIndex == 2) {
            return comprafgv.getValorcompraFgv();
        }
        if (columnIndex == 3) {
            return comprafgv.getQuantidadeFgv();
        }
        if (columnIndex == 4) {
            return comprafgv.getStatusFgv();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome Cliente";
        }
        if (columnIndex == 2) {
            return "Valor Compra";
        }
        if (columnIndex == 3) {
            return "Quantidade";
            
        }
        if (columnIndex == 4) {
            return "Status";
        }
        
        return "";
    }
        
}
    
