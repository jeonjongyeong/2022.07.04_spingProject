package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControlor {

  @RequestMapping("/sbb")
  @ResponseBody
  public String article() {
    return "3sbsㅀ";
  }
}
