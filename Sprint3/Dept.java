package etu1756.framework.modele;
import annotation.*;
import java.lang.annotation.*;
import java.time.LocalDateTime;
@model(table="departement")
public class Dept{
    int id;
    String libele;
    
    public Dept() {
    }
    public Dept(int id, String libele) {
        this.id = id;
        this.libele = libele;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibele() {
        return libele;
    }
    public void setLibele(String libele) {
        this.libele = libele;
    }
   
    @Methods("listDept") 
    public void get_Deptlist(){
        System.out.println("Depart 1");
        System.out.println("Depart 2");

    }


}