package com.fantastic.zbatis.test;

import com.fantastic.zbatis.reflection.Reflector;

/**
 * @author zc
 * @Description
 * @create 2021-06-30 18:32
 */
public class Test {

    private Long id;

    private String name;

    public Test() {
    }

    public Test(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Reflector reflector = new Reflector(Test.class);
    }
}
