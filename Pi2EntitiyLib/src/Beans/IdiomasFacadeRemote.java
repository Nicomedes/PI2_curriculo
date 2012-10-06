/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Idiomas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface IdiomasFacadeRemote {

    void create(Idiomas idiomas);

    void edit(Idiomas idiomas);

    void remove(Idiomas idiomas);

    Idiomas find(Object id);

    List<Idiomas> findAll();

    List<Idiomas> findRange(int[] range);

    int count();
    
}
