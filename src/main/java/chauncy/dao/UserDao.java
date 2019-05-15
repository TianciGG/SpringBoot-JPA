package chauncy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import chauncy.entity.UserEntity;

//规范：使用jpa的dao层必须要继承JpaRepository<实体类, 序列化主键>接口
public interface UserDao extends JpaRepository<UserEntity, Integer> {

}
