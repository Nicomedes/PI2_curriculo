/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Grpacesso;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface GrpacessoFacadeRemote {

    void create(Grpacesso grpacesso);

    void edit(Grpacesso grpacesso);

    void remove(Grpacesso grpacesso);

    Grpacesso find(Object id);

    List<Grpacesso> findAll();

    List<Grpacesso> findRange(int[] range);

    int count();
    
}
