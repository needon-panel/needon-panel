package kr.needon.panel;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@SpringBootTest
@PropertySource("classpath:application.properties")
class PanelApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDockerList() throws DockerCertificateException, DockerException, InterruptedException {

        final DockerClient docker = DefaultDockerClient.fromEnv().build();

        final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());
        System.out.println("containers --> " + containers.toString());
    }

}
