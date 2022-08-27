/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.sessions.ac.za;

import atech.entities.ac.za.GraphicsCard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andil
 */
@Local
public interface GraphicsCardFacadeLocal {

    void create(GraphicsCard graphicsCard);

    void edit(GraphicsCard graphicsCard);

    void remove(GraphicsCard graphicsCard);

    GraphicsCard find(Object id);

    List<GraphicsCard> findAll();

    List<GraphicsCard> findRange(int[] range);

    int count();
    
}
