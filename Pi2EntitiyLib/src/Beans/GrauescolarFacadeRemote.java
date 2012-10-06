/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Grauescolar;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface GrauescolarFacadeRemote {

    void create(Grauescolar grauescolar);

    void edit(Grauescolar grauescolar);

    void remove(Grauescolar grauescolar);

    Grauescolar find(Object id);

    List<Grauescolar> findAll();

    List<Grauescolar> findRange(int[] range);

    int count();
    
}
