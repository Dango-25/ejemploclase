/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.entities.users;

/**
 *
 * @author gomez
 */
@Stateless
public class usersFacade extends AbstractFacade<users> {

    @PersistenceContext(unitName = "ejemploclasePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public usersFacade() {
        super(users.class);
    }
    
}
