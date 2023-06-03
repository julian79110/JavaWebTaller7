package co.edu.sena.proyecttwo.repository;

import co.edu.sena.proyecttwo.model.Category;
import co.edu.sena.proyecttwo.model.User;

import java.sql.*;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        repository<Category> repository = new CategoryRepositoryImpl();

        System.out.println("========== createObj Insert =========="); //insert
        Category categoryInsert = new Category();
        categoryInsert.setCategory_name("verduras");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("frutas");
        repository.saveObj(categoryInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj Update ==========");
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("Verduras");
        repository.saveObj(categoryInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(3);
        repository.listAllObj().forEach(System.out::println);

    }
}
