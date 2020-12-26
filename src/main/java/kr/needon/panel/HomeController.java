package kr.needon.panel;

import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import kr.needon.panel.Docker.Service.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private DockerService dockerService;

    @GetMapping("/")
    public String Home(Model model) throws DockerException, InterruptedException, DockerCertificateException {

        dockerService.dockerAPICount(model);

        model.addAttribute("menuCategory","관리자");
        model.addAttribute("menuName","홈");
        return "home";
    }
}
