/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Rotinas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class RotinasFacade extends AbstractFacade<Rotinas> implements Beans.RotinasFacadeRemote {
    @PersistenceContext(unitName = "Pi2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RotinasFacade() {
        super(Rotinas.class);
    }
    
}
