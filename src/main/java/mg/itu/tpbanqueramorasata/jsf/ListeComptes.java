/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpbanqueramorasata.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpbanqueramorasata.ejb.GestionnaireCompte;
import mg.itu.tpbanqueramorasata.entities.CompteBancaire;

/**
 *
 * @author 26134
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {
    private List<CompteBancaire> comptes;
    
    @EJB
    GestionnaireCompte ejb;
    /**
     * Creates a new instance of ListeComptes
     */
    public ListeComptes() {
    }
    
    public List<CompteBancaire> getComptes() {
        if(comptes == null) 
            comptes = ejb.getAllComptes();
        return comptes;
    }
}

