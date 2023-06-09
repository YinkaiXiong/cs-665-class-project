package edu.bu.met.cs665.bridge;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: ConcreteDatabase1.java
 * Description: This is a class represents a concrete type of database.
 * It implements Database interface.
 * And this is the Concrete Implementations component in bridge pattern.
 * */
public class ConcreteDatabase1 implements Database {
  private String authenticationInfo;

  public ConcreteDatabase1(String authenticationInfo) {
    this.authenticationInfo = authenticationInfo;
  }

  /**
   * Connect database with basic information and prompt message if connected.
   * @return message indicate connected successful.
   */
  @Override
  public String connect() {
    System.out.println("DB 1 connected.");
    return "DB 1 connected.";
  }

  /**
   * Read operation, read data from database.
   * @return data content from database.
   */
  @Override
  public String read(String data) {
    System.out.println("Read from database 1.");
    return "Read from database 1.";
  }

  /**
   * Insert operation, insert information to database.
   * @return message indicated information insert successful.
   */
  @Override
  public String insert(String data) {
    System.out.println("Insert to database 1.");
    return "Insert to database 1.";
  }

  /**
   * Delete operation, delete date from database.
   * @return message indicated information delete successful.
   */
  @Override
  public String delete(String data) {
    System.out.println("Delete from database 1.");
    return "Delete from database 1.";
  }
}
