package elldimi.spring.elldimipetclinic.controllers;

import elldimi.spring.elldimipetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        //s: "owners" is the NAME of the attribute, which  will return list of owners!!!
        //Thymeleaf will search for an attribute with exactly the same name,
        // as it was written at the OwnersIndex page.
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
