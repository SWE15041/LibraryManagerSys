package com.librarymansys.demo.user.dao;

import com.librarymansys.demo.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     //@Repository用于标注数据访问组件，即DAO组件；
public interface UserRepositpry extends JpaRepository<User,Long> {
        User findFirstByUsernameAndPassword(String name, String password);
}
