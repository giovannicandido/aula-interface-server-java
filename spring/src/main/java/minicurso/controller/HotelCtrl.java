package minicurso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import minicurso.service.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import java.lang.Long;
import org.springframework.web.bind.annotation.PathVariable;
import minicurso.domain.Hotel;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

@Controller
@RequestMapping({"/hotels"})
public class HotelCtrl {
  @Autowired
  private HotelRepository hotelRepository;

  @RequestMapping(method=RequestMethod.GET)
  public String list(Model model){
	Iterable<Hotel> hotels = hotelRepository.findAll();
	model.addAttribute("hotels", hotels);
  return "hotels/list";
  }

  @RequestMapping("/edit/{id}")
   public String edit(@PathVariable("id") Long id, Model model){
    model.addAttribute("hotel", hotelRepository.findOne(id));
    return "hotels/edit";
  }

  @RequestMapping(method=RequestMethod.GET, params={"form"})
  public String createForm(Model model){
    model.addAttribute("hotel", new Hotel());
    return "hotels/create";
  }

  @RequestMapping(method={RequestMethod.POST})
  public String create(@Valid Hotel hotel, BindingResult bindingResult){
    if (bindingResult.hasErrors()) {
      return   "hotels/create";
    }else {
      hotelRepository.save(hotel);
      return   "redirect:/hotels";
    }
  }

  @RequestMapping(value={"/update"}, method={RequestMethod.POST})
  public String update(@Valid Hotel hotel, BindingResult bindingResult){
    if (bindingResult.hasErrors()) {
      return   "hotels/edit";
    }else {
      hotelRepository.save(hotel);
      return   "redirect:/hotels";
    }
  }

  @RequestMapping(value={"/delete/{id}"})
  public String delete(@PathVariable("id") Long id){
    hotelRepository.delete(id);
    return "redirect:/hotels";
  }

  @RequestMapping(value="/json", method=RequestMethod.GET)
  @ResponseBody
  public Iterable<Hotel> hoteisRest(){
    return hotelRepository.findAll();
  }
}
