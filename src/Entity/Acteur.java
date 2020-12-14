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
public class Acteur 
{
    private String idActeur;
    private String nomActeur;
    private String photoActeur;
    
    public Acteur()
    {
        
    }
    
    public Acteur(String unId, String unNom, String unePhoto)
    {
        idActeur = unId;
        nomActeur = unNom;
        photoActeur = unePhoto;
    }

    public String getIdActeur() {
        return idActeur;
    }
    
    public String getNomActeur() {
        return nomActeur;
    }

    public String getPhotoActeur() {
        return photoActeur;
    }

}
