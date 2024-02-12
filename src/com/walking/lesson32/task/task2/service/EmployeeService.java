package com.walking.lesson32.task.task2.service;

import com.vtb.multithreading.Main;
import com.walking.lesson32.task.task2.model.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum EmployeeService {
  INSTANCE;




  private final List<Employee> base;

  EmployeeService() {
    base = read();
  }

  public List<Employee> getBase() {
    return base;
  }

  public void showEmployee() {
    for (Employee emploee : base) {
      System.out.println(emploee);
    }
  }

  public void put(Employee e) {
    base.add(e);
  }

  public void createEmployee() {
    String name = Main.readStringFromConsole("Input the name: ");
    System.out.println("Input the age: ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println("Input the salary: ");
    int salary = Integer.parseInt(scanner.nextLine());
    EmployeeService.INSTANCE.put(new Employee(name, age, salary));
    EmployeeService.INSTANCE.save();
  }

  public void save() {
    File file = new File("resourses/emploeeCatalog.txt");
    try (
      FileWriter fw = new FileWriter(file);
      BufferedWriter writer = new BufferedWriter(fw)
    ) {
      for (Employee emploee : base) {
        writer.write(emploee.serialized());
        writer.newLine();
      }
      writer.close();
    } catch (IOException e) {
      // TODO: handle exception
      System.err.println("Ошибка при записи в файл: " + e.getMessage());
    }
  }

  public ArrayList<Employee> read() {
    File file = new File("resourses/emploeeCatalog.txt");
    List<Employee> list = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            Employee e = Employee.deSerialized(line);
            list.add(e);
        }
        reader.close();
    } catch (Exception e) {
        // TODO: handle exception
        System.err.println("Ошибка при чтении из файла: " + e.getMessage());
    }
    return (ArrayList<Employee>) list;
  }
}
