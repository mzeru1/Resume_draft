package com.company;

import java.util.ArrayList;

public class Person {

    private ArrayList<Education> educat_L = new ArrayList<Education>();
    private ArrayList<Experience> experien_L = new ArrayList<Experience>();
    private ArrayList<Skill> skil_L = new ArrayList<Skill>();
    String name;
    String email;
    Education education = new Education();

    public Person() {

    }

    public Person(String name,String email, ArrayList<Education> educat_L, ArrayList<Experience> experien_L, ArrayList<Skill> skil_L) {
        this.name = name;
        this.email= email;
        this.educat_L = educat_L;
        this.experien_L = experien_L;
        this.skil_L = skil_L;

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setEmail(String email)  {

        this.email = email;
    }

    public String getEmail()
    {

        return email;
    }

    public void addEducation(Education ed) {

        educat_L.add(ed);
    }

    public ArrayList<Education> getEducaton_L() {
        return educat_L;

    }

    public void addExperience(Experience exp) {

        experien_L.add(exp);
    }

    public ArrayList<Experience> getExperience() {

        return experien_L;
    }

    public void addSkill(Skill sk) {

        skil_L.add(sk);
    }

    public ArrayList<Skill> getSkill() {

        return skil_L;
    }

    public void toStrings(){
        System.out.println( this.name + "\n" + this.email + "\n\n" + "Education");
        for(Education edc: educat_L){
            System.out.println(edc.toString());
        }

    }
}
