package com.example.sklad;

import com.example.sklad.data.FakeData;
import com.example.sklad.data.crud.CRUDGroup;
import com.example.sklad.data.crud.CRUDProduct;
import com.example.sklad.entity.Group;
import com.example.sklad.entity.Product;
import com.example.sklad.service.GroupService;
import com.example.sklad.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SkladApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = SpringApplication.run(SkladApplication.class, args);
//        FakeData fakeData = new FakeData();
//        int size = 10000;
//
//        List<Group> groups = fakeData.setGroups(size);
//        List<Product> products = fakeData.setProducts(size);

//        testFakeData(applicationContext, groups, products);
//        createInsertionGroupMongoDB(groups, products);
    }

    public static void testFakeData(ApplicationContext applicationContext, List<Group> groups, List<Product> products) {
        GroupService groupService = applicationContext.getBean(GroupService.class);
        ProductService productService = applicationContext.getBean(ProductService.class);


        CRUDGroup crudGroup = new CRUDGroup();
        CRUDProduct crudProduct = new CRUDProduct();

//     create group
        Long timeStartGroupCreate = System.currentTimeMillis();
        crudGroup.create(groups, groupService);
        Long timeEndGroupCreate = System.currentTimeMillis();
        System.out.println("WorkingTimeGroupCreate [group] :" + (timeEndGroupCreate - timeStartGroupCreate));
//
//
////      create product
        Long timeStartProductCreate = System.currentTimeMillis();
        crudProduct.create(products, productService);
        Long timeEndProductCreate = System.currentTimeMillis();
        System.out.println("WorkingTimeProductCreate [product] :" + (timeEndProductCreate - timeStartProductCreate));

//        ////      read group
//        Long timeStartGroupRead = System.currentTimeMillis();
//        crudGroup.read(groups, groupService);
//        Long timeEndGroupRead = System.currentTimeMillis();
//        System.out.println("WorkingTimeGroupRead [group] :" + (timeEndGroupRead - timeStartGroupRead));

//        ////      update group
//        Long timeStartGroupUpdate = System.currentTimeMillis();
//        crudGroup.update(groups, groupService);
//        Long timeEndGroupUpdate = System.currentTimeMillis();
//        System.out.println("WorkingTimeGroupUpdate [group] :" + (timeEndGroupUpdate - timeStartGroupUpdate));


        ////      update product
//        Long timeStartProductUpdate = System.currentTimeMillis();
//        crudProduct.update(products, productService);
//        Long timeEndProductUpdate = System.currentTimeMillis();
//        System.out.println("WorkingTimeProductUpdate [product] :" + (timeEndProductUpdate - timeStartProductUpdate));
//
////      read group
//        Long timeStartProductRead = System.currentTimeMillis();
//        crudProduct.read(products, productService);
//        Long timeEndProductRead = System.currentTimeMillis();
//        System.out.println("WorkingTimeGroupRead [product] :" + (timeEndProductRead - timeStartProductRead));
//
//        //      delete group
//        Long timeStartGroupDelete = System.currentTimeMillis();
//        crudGroup.delete(groups, groupService);
//        Long timeEndGroupDelete = System.currentTimeMillis();
//        System.out.println("WorkingTimeGroupDelete [group] :" + (timeEndGroupDelete - timeStartGroupDelete));
//
//
////      delete product
//        Long timeStartProductDelete = System.currentTimeMillis();
//        crudProduct.delete(products, productService);
//        Long timeEndProductDelete = System.currentTimeMillis();
//        System.out.println("WorkingTimeProductDelete [group] :" + (timeEndProductDelete - timeStartProductDelete));


    }


    private static void createJsonInsertionToGroup() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("{\"name\": \"gr" + i + "\" },");
        }
    }

    private static void createInsertionGroupPostgres(List<Group> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Code\\spring\\sklad_university\\src\\main\\java\\com\\example\\sklad\\data\\sql\\PostgreSQL.sql", true));

        for (int i = 0; i < list.size(); i++) {
            String str = "insert into \"_groups\" (id, name, description) values ('" + list.get(i).getId().toString() + "', 'gr" + i + "', 'description');\n";
            writer.append(str);

        }
        writer.close();
    }

    private static void createInsertionProductPostgres(List<Product> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Code\\spring\\sklad_university\\src\\main\\java\\com\\example\\sklad\\data\\sql\\PostgreSQL.sql", true));

        for (int i = 0; i < list.size(); i++) {
            String str = "insert into \"_products\" (id, name, group_id, description, producer, price) values ('" + list.get(i).getId() + "', 'product" + i + "', '" + list.get(i).getGroup().getId() + "', 'description','producer', 1.1);\n";
            writer.append(str);

        }
        writer.close();
    }

    private static void createInsertionGroupMySQL(List<Group> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Code\\spring\\sklad_university\\src\\main\\java\\com\\example\\sklad\\data\\sql\\MySQL.sql", true));

        for (int i = 0; i < list.size(); i++) {
            String str = "insert into _groups (id, name, description) values (\"" + list.get(i).getId() + "\", \"gr" + i + "\", \"description\");\n";
            writer.append(str);

        }
        writer.close();
    }

    private static void createInsertionProductMySQL(List<Product> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Code\\spring\\sklad_university\\src\\main\\java\\com\\example\\sklad\\data\\sql\\MySQL.sql", true));

        for (int i = 0; i < list.size(); i++) {
            String str = "insert into _products (id, name, group_id, description, producer, price) values (\"" + list.get(i).getId() + "\", \"product" + i + "\", \"" + list.get(i).getGroup().getId() + "\", \"description\",\"producer\", 1.1);\n";
            writer.append(str);

        }
        writer.close();
    }

    private static void createInsertionGroupMongoDB(List<Group> groups, List<Product> products) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Code\\spring\\sklad_university\\src\\main\\java\\com\\example\\sklad\\data\\sql\\test.json", true));

        writer.append("db.groups.insertMany([\n");
        for (int i = 0; i < groups.size(); i++) {

            StringBuilder str = new StringBuilder("{\n\"_id\": \"" + groups.get(i).getId() + "\",\n" +
                    "                    \"name\": \"gr" + i + "\",\n" +
                    "                    \"products\": [");
            String id = groups.get(i).getId().toString();
            List<Product> tempProductsList = products.stream()
                    .filter(p -> p.getGroup().getId().toString().equals(id))
                    .collect(Collectors.toList());
            for (int j = 0; j < tempProductsList.size(); j++) {
                str.append("{\n" +
                        "                    \"_id\":\"" + tempProductsList.get(j).getId() + "\",\n" +
                        "                        \"name\":\"" + tempProductsList.get(j).getName() + "\",\n" +
                        "                        \"description\":\"" + tempProductsList.get(j).getDescription() + "\",\n" +
                        "                        \"producer\":\"" + tempProductsList.get(j).getProducer() + "\",\n" +
                        "                        \"price\":\"" + tempProductsList.get(j).getPrice() + "\"\n" +
                        "                }");
                str.append((j + 1) == tempProductsList.size() ? "\n" : ",\n");
            }
            str.append((i + 1) == groups.size() ? "]\n}" : "]\n},");
            writer.append(str);
        }
        writer.append("])\n");
        writer.close();

    }

}
