package com.company;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;
public class Education  {
    private String degree;
    private String major;
    private String univName;
    private int gradYear;

    public Education(){
    }

    Scanner scan = new Scanner(System.in);
    public Education(String degree, String major, String univName, int gradYear){
        this.degree = degree;
        this.major = major;
        this.univName = univName;
        this.gradYear = gradYear;
        //educationInfo();
    }

//    public void educationInfo() {
//        System.out.print("enter your Degree type : ");
//        setDegree(scan.nextLine());
//        System.out.println("enter your major");
//        setMajor(scan.nextLine());
//        System.out.println("enter school name");
//        setUnivName(scan.nextLine());
//        System.out.println("enter graduation year");
//        setGradYear(scan.nextInt());
//        scan.nextLine();
//    }

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
    public int getGradYear()
    {
        return gradYear;
    }
    @Override
    public String toString(){
        return getDegree() + "in" + getMajor() + "\n" +getUnivName() + "," + getGradYear()+"\n";
    }
}
