package br.home.msc.apitemplate.resources;


import br.home.msc.apitemplate.entity.ProductCategory;
import br.home.msc.apitemplate.repository.IProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IProductCategoryRepository repository;

    @GetMapping
    public ResponseEntity<Map<String, String>> getStatus()
    {
        Map<String,String> res = new LinkedHashMap<String, String>();
        res.put("api_status", "running");
        return ResponseEntity.ok(res);
    }


    @GetMapping("add")
    public ResponseEntity<ProductCategory> get1()
    {
        ProductCategory p = new ProductCategory("Eletronics", true);
        ProductCategory pp = repository.save(p);
        return ResponseEntity.ok(pp);
    }


}
