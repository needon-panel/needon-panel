package kr.needon.panel.Docker.Controller;

import kr.needon.panel.Docker.Service.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/docker")
public class DockerController {

    @Autowired
    private DockerService dockerService;

    @RequestMapping("/containers")
    public String Containers(Model model) {

        dockerService.dockerAPIList(model);

        model.addAttribute("menuCategory","관리자");
        model.addAttribute("menuName","컨테이너");
        return "containers";
    }

}
