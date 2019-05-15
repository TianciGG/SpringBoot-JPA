package chauncy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chauncy.dao.UserDao;
import chauncy.entity.UserEntity;

@RestController
@RequestMapping("/IndexController")
public class IndexController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/index")
	public String index(Integer id) {
		UserEntity userEntity = userDao.findOne(id);
		return userEntity.toString();
	}
}
