/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jbuffeteau
 */
public class Cinema
{
    private String idCinema;
    private String nomCinema;
    private String photoCinema;
    
    public Cinema()
    {
        
    }
    
    public Cinema(String unId, String unNom, String unePhoto)
    {
        idCinema = unId;
        nomCinema = unNom;
        photoCinema = unePhoto;
    }
    
    public Cinema(String unId)
    {
        idCinema = unId;
    }
    

    public Cinema(String unId, String unNom) {
        idCinema = unId;
        nomCinema = unNom;
    }

    public String getIdCinema() {
        return idCinema;
    }

    public String getNomCinema() {
        return nomCinema;
    }

    public String getPhotoCinema() {
        return photoCinema;
    }
}
