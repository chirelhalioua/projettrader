/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Acteur;
import Entity.Cinema;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jbuffeteau
 */
public class ModelActeur extends AbstractTableModel
{
    private String[] nomsColonnes = {"Numéro", "Nom"};
    private Vector<String[]> rows;

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return rows.get(i)[i1];
    }
    
    @Override
    public String getColumnName(int column) {
        return nomsColonnes[column]; 
    }

    public void loadDatas(ArrayList<Acteur> lesActeurs)
    {
        rows = new Vector<>();
        for (Acteur act : lesActeurs)
        {
            rows.add(new String[]{String.valueOf(act.getIdActeur()),act.getNomActeur(),act.getPhotoActeur()});
        }
        fireTableChanged(null);
    }
}