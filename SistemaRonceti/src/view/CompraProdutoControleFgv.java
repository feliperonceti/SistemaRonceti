/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CompraprodutoFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */
public class CompraProdutoControleFgv extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public CompraprodutoFgv getBean(int linha) {
        return (CompraprodutoFgv) lista.get(linha);
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
        CompraprodutoFgv compraprodutofgv = (CompraprodutoFgv) lista.get(rowIndex);
        if (columnIndex == 0) {
            return compraprodutofgv.getId();
        }
        if (columnIndex == 1) {
            return compraprodutofgv.getNomeprodutoFgv();
        }
        if (columnIndex == 2) {
            return compraprodutofgv.getQuantidadeFgv();
        }
        if (columnIndex == 3) {
            return compraprodutofgv.getValorcompraprodutoFgv();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Produto";
        }
        if (columnIndex == 1) {
            return "Quantidade";
        }
        if (columnIndex == 2) {
            return "Valor Unitário";
        }
        if (columnIndex == 3) {
            return "Total";
        }
        return "";
    }
}

    


