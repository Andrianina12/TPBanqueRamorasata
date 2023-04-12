/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpbanqueramorasata.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import mg.itu.tpbanqueramorasata.entities.CompteBancaire;

/**
 *
 * @author 26134
 */
 @Singleton
 @Startup 
public class Init {
     @EJB
    private GestionnaireCompte ejb;
     
    @PostConstruct
    public void create() {
        System.out.println(ejb.nbComptes());
        if(ejb.nbComptes() == 0) {
            ejb.creerCompte(new CompteBancaire("John Lennon", 150000));
            ejb.creerCompte(new CompteBancaire(" Paul McCartney", 950000 ));
            ejb.creerCompte(new CompteBancaire("Ringo Starr", 20000 ));
            ejb.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
        }
    }
}
