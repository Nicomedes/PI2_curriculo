/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Usuarios;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface UsuariosFacadeRemote {

    void create(Usuarios usuarios);

    void edit(Usuarios usuarios);

    void remove(Usuarios usuarios);

    Usuarios find(Object id);

    List<Usuarios> findAll();

    List<Usuarios> findRange(int[] range);

    int count();
    
}
