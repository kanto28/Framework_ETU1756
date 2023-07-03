package test_framework.packe1.packe2;
import framework.*;
import java.util.*;
import framework.annotation.*;
@Scope(annote="singleton")
public class Kanto {
    int idkanto;
    String nom;
    String nee;
    String genre;

    int nbAppel;

    public int getNbAppel() {
        return nbAppel;
    }

    public void setNbAppel(int nbAppel) {
        this.nbAppel = nbAppel;
    }
    public void plusplusnbAppel(){ nbAppel=nbAppel+1; }
    
    public int getIdkanto() {
        return idkanto;
    }

    public void setIdkanto(int idkanto) {
        this.idkanto = idkanto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNee() {
        return nee;
    }

    public void setNee(String nee) {
        this.nee = nee;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Url(url_map="save")
    public void insert(){   
    }
    @Url(url_map="findall")
    public void searchKanto(){
    }
    public void update(){   
    }
    @Url(url_map="findall")
    public ModelView whereKanto(){
        ModelView mv=new ModelView();
        mv.addItem("1","Class Kanto");
        mv.setUrl("page1.jsp");
        return mv;
    }
    

}
