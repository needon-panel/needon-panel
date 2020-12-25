package kr.needon.panel;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home() throws DockerException, InterruptedException, DockerCertificateException {
        System.out.println("test");

        final DockerClient docker = DefaultDockerClient.fromEnv().build();

        final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());
        System.out.println("containers --> " + containers.toString());

        return "home";
    }

}
