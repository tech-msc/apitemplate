package br.home.msc.apitemplate.repository;

import br.home.msc.apitemplate.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface IProductCategoryRepository extends CrudRepository<ProductCategory, Long> {


}
