package hdli.web.skeleton.service.impl;

import hdli.web.skeleton.mapper.UserPoMapper;
import hdli.web.skeleton.po.UserPo;
import hdli.web.skeleton.service.UserService;
import hdli.web.skeleton.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserPoMapper userPoMapper;

    @Override
    public UserVo getUserById(Integer id) {
        UserPo userPo = userPoMapper.selectByPrimaryKey(id);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userPo, userVo);
        return userVo;
    }

    @Override
    public void updateAgeById(Integer id) {

    }
}
