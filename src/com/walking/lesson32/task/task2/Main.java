// package com.walking.lesson32.task.task2;

// import com.walking.lesson32.task.task2.service.EmployeeService;
// import java.util.Scanner;

// public class Main {

//   private static final Scanner scanner = new Scanner(System.in);

//   public static void main(String[] args) {
//     action();
//     scanner.close();
//   }


//   public static void action() {
//     boolean flag = true;
//     while (flag) {
//       System.out.println("What do you want:");
//       System.out.println("1: Show base.");
//       System.out.println("2: Create employee.");
//       System.out.println("0: Exit.");
//       int choice = readIntFromConsole("Input your choice: ");
//       switch (choice) {
//         case 1 -> EmployeeService.INSTANCE.showEmployee();
//         case 2 -> EmployeeService.INSTANCE.createEmployee();
//         case 0 -> flag = false;
//       }
//     }
//   }
// }
