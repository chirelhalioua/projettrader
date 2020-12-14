/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Acteur;
import Entity.Cinema;
import Entity.Film;
import java.util.ArrayList;

/**
 *
 * @author jbuffeteau
 */
public interface IMetier
{
    public ArrayList<Cinema> GetAllCinemas();
    public ArrayList<Film> GetAllFilmsByCinema(int num);

}
