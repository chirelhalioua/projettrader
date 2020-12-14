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
public class Film 
{
    private String idFilm;
    private String nomFilm;
    private String photoFilm;
    private int nbVotes;
    private int totalVotes;
    
    public Film()
    {
        
    }
    
    public Film(String unId, String unNom, String unePhoto,int unNbVotes, int unTotal)
    {
        idFilm = unId;
        nomFilm = unNom;
        photoFilm = unePhoto;
        nbVotes = unNbVotes;
        totalVotes = unTotal;
    }

    public Film(String unidFilm, String unnomFilm) {
        nomFilm = unidFilm;
        nomFilm= unnomFilm;
    }

    public Film(int unNbVote) {
        nbVotes = unNbVote;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public String getPhotoFilm() {
        return photoFilm;
    }

    /**
     * @return the nbVotes
     */
    public int getNbVotes() {
        return nbVotes;
    }

    /**
     * @return the totalVotes
     */
    public int getTotalVotes() {
        return totalVotes;
    }

}
