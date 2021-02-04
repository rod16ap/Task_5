package com.company;

public class Clerk {
     String fullName;
     String post;
     String email;
     String phoneNumber;
     double wages;
     int age;


     public Clerk ( String fullNameFromConstructor, String postFromConstructor, String emailFromConstructor, String phoneNumberFromConstructor, double wagesFromConstructor, int ageFromConstructor ) {
          fullName = fullNameFromConstructor;
          post = postFromConstructor;
          email = emailFromConstructor;
          phoneNumber = phoneNumberFromConstructor;
          wages = wagesFromConstructor;
          age = ageFromConstructor;

//          Внутри класса «Сотрудник» создаем метод, который выводит информацию об объекте в консоль.
//          System.out.println(this.fullName + "\n" + this.post+ "\n" + this.email+ "\n" + this.phoneNumber+ "\n" + this.wages+ "\n" +
//                  this.age);


     }


}
