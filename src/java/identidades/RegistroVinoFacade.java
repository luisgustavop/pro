/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author erick
 */
@Stateless
public class RegistroVinoFacade extends AbstractFacade<RegistroVino> {

    @PersistenceContext(unitName = "ProyectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroVinoFacade() {
        super(RegistroVino.class);
    }
    
}
