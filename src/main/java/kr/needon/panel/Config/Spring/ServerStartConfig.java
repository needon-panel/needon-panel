package kr.needon.panel.Config.Spring;

import kr.needon.panel.Module.User.Service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerStartConfig implements InitializingBean, DisposableBean {

    @Autowired
    private UserService userService;

    @Override
    public void afterPropertiesSet() throws Exception {
        //웹서버 시작시 실행될 함수

        try{
            Thread.sleep(2000); //DB Insert 되기까지 대기하기

            int userRoleSize = userService.getUserRole().size();
            System.out.println("Check User Role Size --> " + userRoleSize);

            if(userRoleSize == 0) {
                userService.insertUserRole("ROLE_ADMIN");

            }

        }catch(InterruptedException e){
            e.printStackTrace();
        }



    }

    @Override
    public void destroy() throws Exception {
        //웹서버 종료시 실행될 함수

    }

}
