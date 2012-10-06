/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Rotinas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface RotinasFacadeRemote {

    void create(Rotinas rotinas);

    void edit(Rotinas rotinas);

    void remove(Rotinas rotinas);

    Rotinas find(Object id);

    List<Rotinas> findAll();

    List<Rotinas> findRange(int[] range);

    int count();
    
}
