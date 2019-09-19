package com.lambdaschool.products.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product extends Auditable
{
    // all fields -> columns

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // lots of number
    // long base datatype vs Long class
    private long productid;

    @Column(unique = true, nullable = false)
    private String prodname;

    private double price;

    public Product()
    {
    }

    public Product(String prodname, double price)
    {
        this.prodname = prodname;
        this.price = price;
    }

    public Product(String prodname)
    {
        this.prodname = prodname;
        price = 10.00;
    }

    public long getProductid()
    {
        return productid;
    }

    public void setProductid(long productid)
    {
        this.productid = productid;
    }

    public String getProdname()
    {
        return prodname;
    }

    public void setProdname(String prodname)
    {
        this.prodname = prodname;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
