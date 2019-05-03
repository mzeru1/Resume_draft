package com.company;

public class Education extends ResumeDB {
    private String degree;
    private String major;
    private String univName;
    private int gradYear;

    public Education(){
    }
    public Education(String degree, String major, String univName, int gradYear){
        this.degree = degree;
        this.major = major;
        this.univName = univName;
        this.gradYear = gradYear;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getDegree (){
        return degree;
    }
    public void setMajor (String major){
        this.major = major;
    }
    public String getMajor (){
        return major;
    }
    public void  setUnivName(String univName){
        this.univName = univName;
    }
    public String getUnivName(){
        return univName;
    }
    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }
    public int getGradYear(){
        return gradYear;
    }
    public String toString(){
        return getDegree() + "in" + getMajor() + "\n" +getUnivName() + "," + getGradYear()+"\n";
    }
}