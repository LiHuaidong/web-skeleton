package hdli.web.skeleton.controller;

import hdli.web.skeleton.param.GetUserParam;
import hdli.web.skeleton.service.UserService;
import hdli.web.skeleton.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    public UserVo getUser(@RequestParam GetUserParam param) {
        Integer id = param.getId();
        UserVo userVo = userService.getUserById(id);
        return userVo;
    }

}
