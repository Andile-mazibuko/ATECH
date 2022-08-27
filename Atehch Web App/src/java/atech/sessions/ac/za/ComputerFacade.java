/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.sessions.ac.za;

import atech.entities.ac.za.Computer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andil
 */
@Stateless
public class ComputerFacade extends AbstractFacade<Computer> implements ComputerFacadeLocal {

    @PersistenceContext(unitName = "Atehch_Web_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComputerFacade() {
        super(Computer.class);
    }
    
}
