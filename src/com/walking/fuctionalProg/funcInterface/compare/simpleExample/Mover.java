package com.walking.fuctionalProg.funcInterface.compare.simpleExample;
/*
 * Интерфейс Comparable нужен для сравнения и сортировки в натуральном порядке
 */
class Mover implements Comparable<Mover> {

  private final String name;
  private int salary;

  public Mover(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
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
    result = prime * result + salary;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Mover other = (Mover) obj;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    if (salary != other.salary) return false;
    return true;
  }

  @Override
  public String toString() {
    return "Mover [name=" + name + ", salary=" + salary + "]";
  }


  @Override
  public int compareTo(Mover o) {
    return this.name.compareTo(o.getName());
  }
}
