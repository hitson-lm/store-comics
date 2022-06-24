package com.hitsonlm.backendstorecomics.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproductos;
    private String nombre;
    private String description;
    private String tipo;
    private Double precio;
    private String imagen;
    private String fecha;

}
