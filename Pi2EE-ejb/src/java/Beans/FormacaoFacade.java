/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Formacao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class FormacaoFacade extends AbstractFacade<Formacao> implements Beans.FormacaoFacadeRemote {
    @PersistenceContext(unitName = "Pi2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormacaoFacade() {
        super(Formacao.class);
    }
    
}
