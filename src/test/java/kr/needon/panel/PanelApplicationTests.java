package kr.needon.panel;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import kr.needon.panel.Model.DockerBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Test
    void 실행중인_도커_서비스_카운트() throws DockerCertificateException, DockerException, InterruptedException {
        final DockerClient docker = DefaultDockerClient.fromEnv().build();
        final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());

        System.out.println("컨테이너 실행수 --> " + containers.size());
    }

    @Test
    void 실행중인_컨테이너() throws DockerCertificateException, DockerException, InterruptedException {
        ArrayList<DockerBean> list = new ArrayList<>();

        final DockerClient docker = DefaultDockerClient.fromEnv().build();

        // List all containers. Only running containers are shown by default.
        final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());


        for(Container dockerApi : containers) {
            DockerBean bean = new DockerBean();

            bean.setId(dockerApi.id());
            bean.setNames(Objects.requireNonNull(dockerApi.names()).toString());
            bean.setState(dockerApi.state());
            bean.setPorts(dockerApi.portsAsString());

            list.add(bean);

        }

        for(int i=0; i<list.size(); i++) {

            System.out.println("get list ==> " +  list.get(i).toString());
        }


    }

}
