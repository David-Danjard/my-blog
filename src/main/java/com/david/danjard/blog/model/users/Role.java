package com.david.danjard.blog.model.users;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@RegisterForReflection
public class Role extends PanacheEntity {

    @Column(unique = true, nullable = false, length = 20)
    public String name;

    public static Role add(String name) {
        Role role = new Role();
        role.name = name.toUpperCase();
        role.persist();
        return role;
    }

}
