package org.pahappa.systems.todo.Views;

import org.pahappa.systems.todo.Services.Imp.TodoServicesImp;

import org.pahappa.systems.todo.Models.Item;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean cont = false;

        System.out.println("Welcome to the Todo Application.");
        System.out.print("Press 2 to continue: ");
        String choice = scanner.nextLine();
        if(choice.equals("2")){
            cont = true;
            while(cont){

                Item item = new Item();
                TodoServicesImp TodoService = new TodoServicesImp();

                System.out.println();
                System.out.println("1. Display Items");
                System.out.println("2. Add item");
                System.out.println("3. Delete Item");
                System.out.println("4. Mark Item done");
                System.out.println("Else to quit.");
                System.out.print("Select action: ");
                String opt = scanner.nextLine();
                if(opt.equals("1") ) {
//
//                    System.out.println("*******ITEMS*******************");
//                    display(TodoService);

                }else if(opt.equals("2")) {
                    System.out.println("Enter Todo Item.");

                    String activity = scanner.nextLine();
                    boolean status = false;

                    // create an item object

//                    item.setId(id);
                    item.setItem(activity);
                    item.setStatus(status);

                    // save the new object to the list
                    addItem(item, TodoService);

                }else if(opt.equals("3")){

                    System.out.print("Enter the Id of the item: ");
                    int id = scanner.nextInt();
                    deleteItem(TodoService, id);
                }else if (opt == "4"){
                    System.out.print("Enter the id of item: ");
                    int id = scanner.nextInt();
                    verify(TodoService, id);

                }else{
                    break;
                }


            }
        }else{
            System.out.println("Thanks for using this applicataion.");
        }



    }
    public static void  display(TodoServicesImp TodoService ){

        TodoService.showItems();
    }
    public static void verify(TodoServicesImp TodoService, int id){
        TodoService.markDone(id);
    }

    public static void addItem(Item item, TodoServicesImp TodoAdd){

    TodoAdd.addItem(item);
    }
    public static  void deleteItem(TodoServicesImp TodoDelete, int id){

    TodoDelete.deleteItem(id);
    }
}