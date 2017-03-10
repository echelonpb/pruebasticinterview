/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testgenericdao.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pnaca
 */
public class EM {
    
    @PersistenceContext(unitName = "myPersistenceUnit")
    public static EntityManager em;

    public EM() {
    }

    public static EntityManager getEm() {
        
        return em;
    }
    
    
}
