package vn.techmaster.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.solid.request.BMIRequest;
import vn.techmaster.solid.response.BMIResult;
import vn.techmaster.solid.service.HealthService;

@Controller
@RequestMapping("/bmi3")
public class BMIController3 {

  @Autowired
  private HealthService healthService;

  @GetMapping
  public String getBMIForm(Model model) {
    model.addAttribute("bmiRequest", new BMIRequest());
    return "bmi2";
  }

  @PostMapping()
  public String handleBMIForm(@ModelAttribute BMIRequest request, BindingResult bindingResult, Model model) {
    if (! bindingResult.hasErrors()) {      
      BMIResult bmiResult = healthService.calculateBMI(request);
      model.addAttribute("bmiRequest", request); 
      model.addAttribute("bmiResult", bmiResult);
    }
    return "bmi2";
  }

  
}
