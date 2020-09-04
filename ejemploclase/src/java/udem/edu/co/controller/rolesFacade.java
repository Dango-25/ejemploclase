/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.entities.roles;

/**
 *
 * @author gomez
 */
@Stateless
public class rolesFacade extends AbstractFacade<roles> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public rolesFacade() {
        super(roles.class);
    }
    
}
