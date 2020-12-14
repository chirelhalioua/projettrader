/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Acteur;
import Entity.Cinema;
import Entity.Film;
import java.io.File;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbuffeteau
 */
public class FonctionsMetier implements IMetier
{
    
    public ArrayList<Film> GetAllFilmsByCinema(String num)
    {
        ArrayList<Film> lesFilms = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("Select film.codeFilm, film.nomfilm from film, projeter where film.codeFilm = projeter.numFilm and projeter.numCinema = '"+num + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Film f = new Film(rs.getString("codeFilm"),rs.getString("nomFilm"));
                lesFilms.add(f);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFilms;    
    }

    @Override
    public ArrayList<Cinema> GetAllCinemas() {
         ArrayList<Cinema> lesCinemas = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT codeCine, nomCine FROM cinema");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Cinema c = new Cinema(rs.getString("codeCine"), rs.getString("nomCine"));
                lesCinemas.add(c);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesCinemas;
    }
    
    public String getImageJeuxByIdJeu(String code) {
        String cheminImage = "";
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT `imageFilm` FROM `film` WHERE `codeFilm`=?");
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            rs.next();
            cheminImage = rs.getString("imageFilm");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cheminImage;
    }
    
    // Select nbVotes From film Where 
     public ArrayList<Film> GetAllVotesByFilms(String num)
    {
        ArrayList<Film> lesFilms = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("Select nbVotes From film Where projeter.numCinema = '"+num + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Film f = new Film(rs.getInt("nbVotes"));
                lesFilms.add(f);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFilms;    
    }
    
    
    @Override
    public ArrayList<Film> GetAllFilmsByCinema(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
