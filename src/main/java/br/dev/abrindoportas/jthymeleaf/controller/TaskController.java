package br.dev.abrindoportas.jthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.dev.abrindoportas.jthymeleaf.models.TaskModel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class TaskController {
  
  List<TaskModel> taskModels = new ArrayList<>();

  @GetMapping("/create")
  public String getHomeString() {
      return "create";
  }
  
  @PostMapping("/create")
  public String postCreateString(TaskModel taskModel) {
    // System.out.println("O nome da tarefa é " + taskModel.getName());
    Long id = taskModels.size() + 1L;
    taskModels.add(new TaskModel(id, taskModel.getName(), taskModel.getDate()));
    return "redirect:/list";
  }

  @GetMapping("/list")
  public ModelAndView getLiString() {
    ModelAndView mv = new ModelAndView("list");
    mv.addObject("taskModels", taskModels);
    return mv;
  }

  @GetMapping("/edit/{id}")
  public ModelAndView getEditString(@PathVariable("id") Long id) {
      ModelAndView mv  = new ModelAndView("create");

      TaskModel taskModelFind = taskModels.stream().filter(taskModel -> id.equals(taskModel.getId())).findFirst().get();

      mv.addObject("taskModel", taskModelFind);
      return mv;
  }
  
  
}
