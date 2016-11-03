package com.company.valuechangedtestapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.OneToMany;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "VALUECHANGEDTESTAPP_CUSTOMER")
@Entity(name = "valuechangedtestapp$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 3206704609474454101L;

    @Column(name = "NAME")
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    protected Set<Order> orders;

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Order> getOrders() {
        return orders;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}