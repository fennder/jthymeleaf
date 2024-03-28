package br.dev.abrindoportas.jthymeleaf.models;

import java.util.Date;

public class TaskModel {

  public TaskModel(Long id, String name, Date date) {
    this.id = id;
    this.name = name;
    this.date = date;
  }

  public TaskModel() {
  
  }

  private Long id;
  private String name;
  private Date date;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

}
