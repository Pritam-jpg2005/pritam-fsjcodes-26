/*Aim :Wap to store Dispaly student information of few student ,
imformation like name , uin,cgpa
Coder : Pritam Nagargoje 
Class : SE COMP Div A*/

public class exp1 {

    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.name ="pritam" ;
        s1.uin = "241P060" ;
        s1.cgpa = 8 ;
        s1.display();

         Student s2 = new Student() ;
        s2.name ="om" ;
        s2.uin = "241P062" ;
        s2.cgpa = 4.5 ;
        s2.display();


        

    }
}

class Student{
    String name;
    String uin;
    double cgpa;


    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student UIN : "+uin);
        System.out.println("Student CGPA: "+cgpa);
        
    }
}
