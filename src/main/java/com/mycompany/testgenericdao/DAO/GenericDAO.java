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
public interface GenericDAO <T extends GenericBean> {
    


    
    default T findById(Long id){
        EM.getEm().createNativeQuery("dgd");
        
         return null;
    }
    default void test(T t){
        t.getId();
        
    }
}
