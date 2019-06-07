package template;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import template.service.SysUserService;
import template.service.entity.SysUserServiceEntity;

import java.util.List;

public class ApplicationMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SysUserService service = context.getBean(SysUserService.class);
        List<SysUserServiceEntity> entities = service.selectAllUsers();
        for(SysUserServiceEntity entity: entities) {
            System.out.println(entity.getName());
        }
    }
}
