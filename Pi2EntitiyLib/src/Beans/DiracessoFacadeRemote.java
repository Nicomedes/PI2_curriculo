/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Diracesso;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface DiracessoFacadeRemote {

    void create(Diracesso diracesso);

    void edit(Diracesso diracesso);

    void remove(Diracesso diracesso);

    Diracesso find(Object id);

    List<Diracesso> findAll();

    List<Diracesso> findRange(int[] range);

    int count();
    
}
