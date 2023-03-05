//package com.driver.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "connections")
//public class Connection {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    // child wrt SP
//    @ManyToOne
//    @JoinColumn
//    private ServiceProvider serviceProvider;
//
//    // child wrt user
//    @ManyToOne
//    @JoinColumn
//    private User user;
//
//    public Connection() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public ServiceProvider getServiceProvider() {
//        return serviceProvider;
//    }
//
//    public void setServiceProvider(ServiceProvider serviceProvider) {
//        this.serviceProvider = serviceProvider;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}

package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "connections")
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn
    private User user;

    @JoinColumn
    @ManyToOne
    private ServiceProvider serviceProvider;

    public Connection() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
