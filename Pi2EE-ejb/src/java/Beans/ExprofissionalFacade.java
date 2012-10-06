/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Exprofissional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class ExprofissionalFacade extends AbstractFacade<Exprofissional> implements Beans.ExprofissionalFacadeRemote {
    @PersistenceContext(unitName = "Pi2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExprofissionalFacade() {
        super(Exprofissional.class);
    }
    
}
