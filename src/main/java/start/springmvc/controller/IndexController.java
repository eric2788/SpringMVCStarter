package start.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import start.springmvc.repository.ItemRepository;

@Controller
public class IndexController{

    private final ItemRepository itemRepository;

    @Autowired
    public IndexController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
    public String getIndex(ModelMap modelMap){
        modelMap.addAttribute("items", itemRepository.findAll());
        return "view/index";
    }
}
