package com.test.converter;

import com.test.entity.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by zhang_htao on 2019/8/16.
 */
public class UserConverter implements Converter<String, User>{
    @Override
    public User convert(String source) {
        String[] split = source.split("-");
        User user = new User(11,split[0],split[1],null);
        return user;
    }
}
