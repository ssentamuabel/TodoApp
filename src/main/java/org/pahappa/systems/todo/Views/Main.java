package org.pahappa.systems.todo.Views;

import org.pahappa.systems.todo.Services.*;
import org.pahappa.systems.todo.Models.*;
import org.pahappa.systems.todo.constants.Gender;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

      UserServices userservices = new UserImp();
      Scanner scanner = new Scanner(System.in);
      TodoServices todoservices = new TodoServicesImp();

      System.out.println("***********************Welcome**To***Todo**Application********\n");

      System.out.println("1. SignUp");
      System.out.println("2. Login");

      System.out.print("Select  an action: ");
      switch(scanner.nextLine()){

          case "1":registerUser(userservices, scanner); break;
          case "2":
              User user = new User();
              user = login(userservices, scanner);
              System.out.println(user.getName() +" successfully logged in");
              System.out.println("1. View tasks.");
              System.out.println("2.Add task");
              System.out.println("3.Confirm task");
              System.out.println("4.Delete task");
              System.out.println("Any other to logout\n");
              System.out.print("Choice: ");
              switch(scanner.nextLine()){
                  case "1":
                      System.out.println("You have selected 1"); break;
                  case "2":
                      addItem(user,todoservices, scanner ); break;
                  case "3": System.out.println("You have selected 3"); break;
                  case "4": System.out.println("You have selected 4"); break;
                  default : System.out.println("The choice is not valid");
              }
              break;
          default :System.out.println("The choice is not valid");
      }



    }

    public static void registerUser(UserServices services, Scanner scan){
        User user = new User();

        System.out.print("Enter your name: ");
        user.setName(scan.nextLine());

        System.out.print("Enter your email: ");
        user.setEmail(scan.nextLine());


        System.out.print("Choose\n M for male \n F for female: ");
        switch(scan.nextLine()){
            case "m":user.setGender(Gender.MALE);break;
            case "f":user.setGender(Gender.FEMALE); break;
            default:System.out.println("Please make a valid option");
        }

        System.out.print("Enter your password ");
        user.setPassword(scan.nextLine());

        services.register(user);

    }
    public static User login( UserServices service, Scanner scan){
        System.out.println("Enter your email");
        String email = scan.nextLine();

        System.out.println("Enter your password ");
        String password = scan.nextLine();

      return  service.login(email, password) ;
    }
    public static void  display(TodoServicesImp TodoService ){


    }
    public static void verify(TodoServicesImp TodoService, String id){
        TodoService.markDone(id);
    }


    public static void addItem( User user, TodoServices TodoAdd, Scanner scan){
        Item newItem = new Item();
        System.out.println("Enter the Item");
        newItem.setItem(scan.nextLine());

        newItem.setUser(user);
        newItem.setStatus(false);

        TodoAdd.addItem(newItem);
        System.out.println(user.getName()+", you have added an Item");

    }
    public static  void deleteItem(TodoServicesImp TodoDelete, String id){

    TodoDelete.deleteItem(id);
    }
}