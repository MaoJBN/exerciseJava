
package com.mycompany.lendbook;

public class Person {  
    int code;
    String name;
    String profession;

    public Person(int code, String name, String profession) {
        this.code = code;
        this.name = name;
        this.profession = profession;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
