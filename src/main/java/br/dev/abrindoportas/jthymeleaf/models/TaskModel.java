package br.dev.abrindoportas.jthymeleaf.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TaskModel {

  public TaskModel(Long id, String name, String description, Date date) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.date = date;
  }

  public TaskModel() {
  
  }

  private Long id;
  private String name;
  private String description;

  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
