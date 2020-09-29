package io.quind.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", nullable=false, length=30)
    private String name;

    public Long getId() { return id; }

    public void  setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name=name;
    }
}
