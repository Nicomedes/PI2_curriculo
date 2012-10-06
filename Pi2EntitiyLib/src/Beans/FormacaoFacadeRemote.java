/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Formacao;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface FormacaoFacadeRemote {

    void create(Formacao formacao);

    void edit(Formacao formacao);

    void remove(Formacao formacao);

    Formacao find(Object id);

    List<Formacao> findAll();

    List<Formacao> findRange(int[] range);

    int count();
    
}
