package com.walking.lesson32.task.task2.model;

public class Employee {

  private static int countId = 0;
  private final int id;

  private final String name;
  private int age;
  private int salary;

  public Employee(int id, String name, int age, int salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public Employee(String name, int age, int salary) {
    countId++;
    this.id = countId;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    result = prime * result + salary;
    result = prime * result + salary + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Employee other = (Employee) obj;
    if (id != other.id) {
      return false;
    }
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    if (age != other.age) return false;
    if (salary != other.salary) return false;
    return true;
  }

  @Override
  public String toString() {
    return (
      "Emploee [id=" +
      id +
      ", name=" +
      name +
      ", age=" +
      age +
      ", salary=" +
      salary +
      "]"
    );
  }

  public String serialized() {
    return "%d-%s-%d-%d".formatted(id, name, age, salary);
  }

  public static Employee deSerialized(String s) {
    String[] arr = s.split("-");
    int id = Integer.parseInt(arr[0]);
    String name = arr[1];
    int age = Integer.parseInt(arr[2]);
    int salary = Integer.parseInt(arr[3]);
    return new Employee(id, name, age, salary);
  }
}
