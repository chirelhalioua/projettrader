/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Cinema;
import Entity.Film;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jbuffeteau
 */
public class ModelFilm extends AbstractTableModel
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
    public void loadDatas(ArrayList<Film> lesFilms)
    {
        rows = new Vector<>();
        for (Film unFilm : lesFilms)
        {
            rows.add(new String[]{String.valueOf(unFilm.getIdFilm()),
                unFilm.getNomFilm(),
                unFilm.getPhotoFilm(),
            String.valueOf(unFilm.getNbVotes()),
            String.valueOf(unFilm.getTotalVotes())});
        }
        fireTableChanged(null);
    }
}
