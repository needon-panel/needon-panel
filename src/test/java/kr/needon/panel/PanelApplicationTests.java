package kr.needon.panel;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import com.spotify.docker.client.messages.ContainerInfo;
import com.spotify.docker.client.DefaultDockerClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PanelApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void dockerAPITest() throws DockerException, InterruptedException {
        DockerClient docker = dockerAPICALL();
        ContainerInfo info = null;

        final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());
    }


    public DockerClient dockerAPICALL() {
        DockerClient docker = null;
        docker = new DefaultDockerClient("unix:///var/run/docker.sock");
        return docker;
    }

}
