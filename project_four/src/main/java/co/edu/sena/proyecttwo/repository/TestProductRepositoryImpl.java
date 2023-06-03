package co.edu.sena.proyecttwo.repository;
import co.edu.sena.proyecttwo.model.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        repository<Product> repository = new ProductRepositoryImpl();

        System.out.println("========== createObj Insert =========="); //insert
        Product productInsert = new Product();
        productInsert.setProduct_name("hola");
        productInsert.setProduct_value(20.000F);
        productInsert.setCategory_id(9);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("buenas2");
        productInsert.setProduct_value(40.000F);
        productInsert.setCategory_id(8);
        repository.saveObj(productInsert);

    }
}
