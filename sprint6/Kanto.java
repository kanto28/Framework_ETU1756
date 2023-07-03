package test_framework.packe1.packe2;
import framework.*;
import java.util.*;
import framework.annotation.*;
public class Kanto {
    int idkanto;
    String nom;
    String nee;
    String genre;
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
