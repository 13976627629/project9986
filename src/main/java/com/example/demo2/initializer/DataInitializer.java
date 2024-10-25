//package com.example.demo2.initializer;
//
//import com.example.demo2.model.Profile;
//import com.example.demo2.repository.ProfileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    @Autowired
//    private ProfileRepository profileRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        // 检查数据库中是否已经有 Profile 数据
//        if (profileRepository.count() == 0) { // 如果数据库中没有数据
//            Profile defaultProfile = new Profile();
//            // 设置默认值
//            defaultProfile.setName("许雅婷");
//            defaultProfile.setTitle("学生 | 笨蛋一只");
//            defaultProfile.setEmail("hahaha@xyt.edu.cn");
//            defaultProfile.setPhone("wo bu zhi dao");
//            defaultProfile.setResearch("八皇后算法、金铲铲双排运营、《如何做到有点粗心但不多》、《如何让不给讨厌的舍友太多好脸色看》");
//            profileRepository.save(defaultProfile); // 保存默认数据
//        }
//    }
//}
package com.example.demo2.initializer;

import com.example.demo2.model.Profile;
import com.example.demo2.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void run(String... args) throws Exception {
       //  检查数据库中是否已经有 Profile 数据
        if (profileRepository.count() == 0) { // 如果数据库中没有数据
            Profile defaultProfile = new Profile();
            // 设置默认值
            defaultProfile.setName("许雅婷");
            defaultProfile.setTitle("学生 | 笨蛋一只");
            defaultProfile.setEmail("hahaha@xyt.edu.cn");
            defaultProfile.setPhone("wo bu zhi dao");
            defaultProfile.setResearch("八皇后算法、金铲铲双排运营、《如何做到有点粗心但不多》、《如何让不给讨厌的舍友太多好脸色看》");
            defaultProfile.setAwards("2023年数学建模竞赛全国一等奖");
            defaultProfile.setExchange("2023年暑假赴日本京都大学参加暑期交流项目");
            defaultProfile.setLab("计算机科学与技术学院软件工程实验室");
            defaultProfile.setScholarship("2023年国家励志奖学金");
            defaultProfile.setGraduates("zdd,2024年毕业，预计获得学士学位");
            defaultProfile.setUsername("admin");
            defaultProfile.setPassword("123456");
            defaultProfile.setImage("images/picture.jpg");
            profileRepository.save(defaultProfile); // 保存默认数据
            System.out.println("默认数据已插入到数据库中");
       } else { System.out.println("数据库中已有数据，未插入默认数据");
        }
    }
}
