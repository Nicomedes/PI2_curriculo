/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Auditoria;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface AuditoriaFacadeRemote {

    void create(Auditoria auditoria);

    void edit(Auditoria auditoria);

    void remove(Auditoria auditoria);

    Auditoria find(Object id);

    List<Auditoria> findAll();

    List<Auditoria> findRange(int[] range);

    int count();
    
}
