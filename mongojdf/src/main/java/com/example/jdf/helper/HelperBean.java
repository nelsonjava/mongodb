package com.example.jdf.helper;

import com.example.jdf.domain.Customer;

import java.util.Calendar;
import java.util.Random;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.logging.Logger;

/**
 *
 * @author Apress
 */
@Singleton
@LocalBean
@Named("helperbean")
public class HelperBean {

    @PersistenceContext(unitName = "MONGODB_PU")
    private EntityManager em;
    private static final Logger log = Logger.getLogger(HelperBean.class.getName());

    public void populateShop() {

        log.info("Please wait while preparing database data ... ");

        Customer customer = new Customer();
        customer.setFirstName("COINSA");
        customer.setLastName("LTDA");

        em.persist(customer);
        em.flush();

        log.info("Database successfully populated ... ");
    }
}
