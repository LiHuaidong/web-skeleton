package hdli.web.skeleton.service;

import hdli.web.skeleton.vo.UserVo;

public interface UserService {

    UserVo getUserById(Integer id);

    void updateAgeById(Integer id);

}
