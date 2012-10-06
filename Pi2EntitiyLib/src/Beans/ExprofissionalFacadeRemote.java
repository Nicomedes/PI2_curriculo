/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Exprofissional;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface ExprofissionalFacadeRemote {

    void create(Exprofissional exprofissional);

    void edit(Exprofissional exprofissional);

    void remove(Exprofissional exprofissional);

    Exprofissional find(Object id);

    List<Exprofissional> findAll();

    List<Exprofissional> findRange(int[] range);

    int count();
    
}
