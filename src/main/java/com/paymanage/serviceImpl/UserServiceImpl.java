package com.paymanage.serviceImpl;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service;

import com.paymanage.entity.User;
import com.paymanage.mapper.UserMapper;
import com.paymanage.service.IUserService;  
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userMapper;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userMapper.selectByPrimaryKey(userId);  
    }  
  
}  