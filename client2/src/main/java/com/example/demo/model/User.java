package com.example.demo.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author @醉鱼
 * @link https://github.com/TianPuJun
 * @ClassName User
 * @Description
 * @Date 20:55 2022/4/7
 **/
@Document(indexName = "#{@getElasticsearchNamespace}.user")
public class User {
    @Field(type = FieldType.Text)
    private String id;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Text)
    private String phone;
    @Field(type = FieldType.Text)
    private String namespace;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}
