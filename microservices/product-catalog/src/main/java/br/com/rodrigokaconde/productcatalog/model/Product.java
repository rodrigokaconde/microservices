package br.com.rodrigokaconde.productcatalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Data
public class Product {
    @Id
    private Integer id;
    private String name;
    private Integer amount;
}
