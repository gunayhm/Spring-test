package com.javarush.mapper;


import com.javarush.dto.UserDto;
import com.javarush.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toUserDto(UserEntity userEntity){
        UserDto userDto= new UserDto();
        userDto.setAge(userDto.getAge());
        userDto.setName(userEntity.getName());

        return userDto;
    }

    public UserEntity toUserEntity(UserDto userDto){
        return new UserEntity()
                .setAge(userDto.getAge())
                .setName(userDto.getName());
    }

}