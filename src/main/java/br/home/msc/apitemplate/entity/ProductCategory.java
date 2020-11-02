package br.home.msc.apitemplate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity @Getter @Setter
@Table(name = "PRODUCT_CATEGORY")
public class ProductCategory implements Serializable {


    private static final long serialVersionUID = -6101149170098094551L;

    @Id
    @Column(name = "CD_PRODUCT_CATEGORY")
    private Long categoryID;

    @Column(nullable = false, unique = true, name = "NM_PRODUCT_CATEGORY")
    private String name;

    @Column(nullable = false, name = "STATUS")
    private Boolean status;


    @Deprecated
    public ProductCategory() {
    }

    public ProductCategory(Long categoryID, String name, Boolean status) {
        this.categoryID = categoryID;
        this.name = name;
        this.status = status;
    }

    public ProductCategory(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(categoryID, that.categoryID) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, name);
    }
}
