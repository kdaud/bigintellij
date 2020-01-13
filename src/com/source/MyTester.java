package com.source;

public class MyTester {
    private String name;
    private String experience;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "MyTester{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
