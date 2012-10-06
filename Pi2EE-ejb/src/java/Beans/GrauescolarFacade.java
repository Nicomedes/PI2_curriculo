/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Grauescolar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class GrauescolarFacade extends AbstractFacade<Grauescolar> implements Beans.GrauescolarFacadeRemote {
    @PersistenceContext(unitName = "Pi2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrauescolarFacade() {
        super(Grauescolar.class);
    }
    
}
