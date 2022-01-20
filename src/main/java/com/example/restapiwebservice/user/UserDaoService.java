package com.example.restapiwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// 도메인 정보를 이용해서 비즈니스 로직을 추가
@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "dk", new Date()));
        users.add(new User(2, "b", new Date()));
        users.add(new User(3, "c", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for(User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();     // Iterator(열거형 타입): 배열, 리스트 형태의 데이터 값을 순차적으로 접근해서 사용

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }
}
