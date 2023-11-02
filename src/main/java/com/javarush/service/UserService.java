package com.javarush.service;

import com.javarush.dto.UserDto;
import com.javarush.entity.UserEntity;
import com.javarush.mapper.UserMapper;
import com.javarush.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto getUserById(Long id){
        return userMapper.toUserDto(userRepository.findById(id).orElseThrow());
    }

    public void saveUser(UserDto userDto){
        userRepository.save(userMapper.toUserEntity(userDto));
    }

    public void  deleteUserById(Long id){
        userRepository.deleteById(id);
    }

}
