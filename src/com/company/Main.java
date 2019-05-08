package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
     String degree;
     String major;
     String univName;
     int gradYear;


    public static void main(String[] args) {
        //HashMap<Integer, String> resumeMap = new HashMap<Integer, String>();
        ArrayList<Person> pp = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);
        Person person1 = null;
        Education education;
        String buildResume = "";
        // ResumeDB res = new ResumeDB();

         boolean ido = true;
         while (ido){
            // ArrayList<ResumeDB> s = new ArrayList<ResumeDB>();
             System.out.println("Do you want to Build a resume? Y OR N");
             buildResume = scan.nextLine();

            // checks user input if building resume response was yes or no
            if (buildResume.equalsIgnoreCase("Y")) {
                person1 = new Person();

                System.out.println("enter name ");
                person1.setName(scan.nextLine());
                System.out.println("enter email");
                person1.setEmail(scan.nextLine());
                //person1.toString();


                boolean addEducation = true;
                while (addEducation) {
                    //education = new Education();
                    System.out.print("enter your Degree type : ");
                    person1.education.setDegree(scan.nextLine());
                    System.out.println("enter your major");
                    person1.education.setMajor(scan.nextLine());
                    System.out.println("enter school name");
                    person1.education.setUnivName(scan.nextLine());
                    System.out.println("enter graduation year");
                    person1.education.setGradYear(scan.nextInt());
                    scan.nextLine();
                    person1.addEducation(person1.education);
         //           education.toString();
          //          person1.toString();

                    System.out.println("More education to add? Y or N ");
                    String choice = scan.nextLine();
                    if (!choice.equalsIgnoreCase("Y")) {
                        addEducation = false;
                        System.out.println("loop tester ...1");
                    }
                }

            } else {
                System.out.println("Thank you see you next time !");
            }
            pp.add(person1);
        } while (buildResume.equalsIgnoreCase("y"));
        System.out.println(pp.size());
        if(person1 != null){
            for(Person i : pp) {
                i.toStrings();
            }
        }
//        ArrayList<Person> pp = new ArrayList<Person>();
//        Scanner scan = new Scanner(System.in);
//        Person person1 = new Person();
//        System.out.println("enter name");
//        person1.setName(scan.nextLine());
//        System.out.println("enter your email");
//        person1.setEmail(scan.nextLine());
//        pp.add(person1);
//
//        //adding education now
//
//        System.out.println("fill the education form ed, dd,yega");
//        Education edu = new Education();
//        edu.educationInfo();
//        person1.add(edu);
//        edu.toString();

    }

}

