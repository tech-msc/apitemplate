package br.home.msc.apitemplate.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("category")
public class ProductCategoryController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getStatus()
    {
        Map<String,String> res = new LinkedHashMap<String, String>();
        res.put("api_status", "product category running");
        return ResponseEntity.ok(res);
    }
}
