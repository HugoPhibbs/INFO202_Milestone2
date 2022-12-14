/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.math.BigDecimal;

/**
 * Factory for creating DAO objects
 * 
 * @author Hugo
 */
public class DaoFactory {
    
    /**
     * Creates and returns a new ProductDAO
     * 
     * @return ProductDAO as described
     */
    public static ProductDAO getProductDAO() {
        return JdbiDaoFactory.getProductDAO();
        //ProductDAO dao = ProductCollectionsDAO();
    }
    
    /**
     * Creates and returns a new CustomerDAO
     * 
     * @return CustomerDAO as described
     */
    public static CustomerDAO getCustomerDAO() {
        return JdbiDaoFactory.getCustomerDAO();
        // return new CustomerCollectionsDAO();
    }
    
     public static SaleDAO getSaleDAO() {
        return JdbiDaoFactory.getSaleDAO();
    }
}
