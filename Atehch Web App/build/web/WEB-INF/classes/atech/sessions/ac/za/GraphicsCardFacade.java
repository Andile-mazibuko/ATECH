/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.sessions.ac.za;

import atech.entities.ac.za.GraphicsCard;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andil
 */
@Stateless
public class GraphicsCardFacade extends AbstractFacade<GraphicsCard> implements GraphicsCardFacadeLocal {

    @PersistenceContext(unitName = "Atehch_Web_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GraphicsCardFacade() {
        super(GraphicsCard.class);
    }
    
}
