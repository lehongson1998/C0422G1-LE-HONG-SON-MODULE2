package draft;

import java.util.Date;

public class Draft1 {
   private String name;
   private int age;
   private String address;
   public boolean gender;

   public Draft1() {
   }
   public Draft1(String name, int age){
       this.name = name;
       this.age = age;
   }

   public Draft1(String name, int age, String address) {
      this(name, age);
      this.address = address;
   }

   public Draft1(String name, int age, String address, boolean gender){
      this(name, age);
      this.address = address;
      this.gender = gender;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getAddress() {
      return address;
   }

   public void setName(String name) {
      this.name = name;
   }
   public void setAge(int age) {
      this.age = age;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setGender(boolean gender) {
      this.gender = gender;
   }

   public boolean isGender(){
      return gender;
   }
   public String gender(){
      if (!isGender()){
         return "female";
      }else {
         return "male";
      }
   }
   public void display(){
      System.out.println("name: " + getName());
      System.out.println("age: " + getAge());
      System.out.println("address: " + getAddress());
      System.out.println("gender: " + gender());
   }
}
