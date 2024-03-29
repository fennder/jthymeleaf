package br.dev.abrindoportas.jthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.dev.abrindoportas.jthymeleaf.models.TaskModel;



@Controller
public class TaskController {
  
  List<TaskModel> taskModels = new ArrayList<>();

  @GetMapping("/create")
  public String getHomeString() {
      return "create";
  }
  
  @PostMapping("/create")
  public void postCreateString(TaskModel taskModel) {
    // System.out.println("O nome da tarefa é " + taskModel.getName());
    Long id = taskModels.size() + 1L;
    taskModels.add(new TaskModel(id, taskModel.getName(), taskModel.getDate()))
  }
}
