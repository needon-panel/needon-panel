package kr.needon.panel.Docker.Service;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import kr.needon.panel.Model.DockerBean;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;

@Log
@Service
public class DockerService {

    final DockerClient docker = DefaultDockerClient.fromEnv().build();
    final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());

    public DockerService() throws DockerCertificateException, DockerException, InterruptedException {
    }


    /**
     * 도커 서비스 모니터링
     * @param model
     * @throws DockerCertificateException
     * @throws DockerException
     * @throws InterruptedException
     */
    public void dockerAPICount(Model model) throws DockerCertificateException, DockerException, InterruptedException {
        log.log(Level.INFO,"containers.size() --> " + containers.size());

        model.addAttribute("container_count", containers.size());

    }

    public void dockerAPIList(Model model) {
        ArrayList<DockerBean> list = new ArrayList<>();

        for(Container dockerApi : containers) {
            DockerBean bean = new DockerBean();

            bean.setId(dockerApi.id());
            bean.setNames(Objects.requireNonNull(dockerApi.names()).toString());
            bean.setState(dockerApi.state());
            bean.setPorts(dockerApi.portsAsString());

            list.add(bean);

        }

        log.log(Level.INFO,"컨테이너 리스트 --> " + list.toString());
        model.addAttribute("containers", list);
    }

}
