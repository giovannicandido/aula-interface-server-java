package minicurso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import java.lang.Long;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
class MainCtrl {

  @RequestMapping(method={RequestMethod.GET})
  public String index(){
  	return "layout/sitelayout";
  }

  @RequestMapping(value="/", method={RequestMethod.GET})
  public String outro(){
    return "hotels/list";
  }
}
