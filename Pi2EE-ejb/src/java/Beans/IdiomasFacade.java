/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Idiomas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class IdiomasFacade extends AbstractFacade<Idiomas> implements Beans.IdiomasFacadeRemote {
    @PersistenceContext(unitName = "Pi2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IdiomasFacade() {
        super(Idiomas.class);
    }
    
}
