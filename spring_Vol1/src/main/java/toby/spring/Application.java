package toby.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import toby.spring.dao.UserDao;
import toby.spring.domain.User;

import java.sql.SQLException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(Application.class, args);

		UserDao dao = new UserDao();

		User user = new User();
		user.setId("aaa");
		user.setName("2");
		user.setPassword("12345");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + " 조회 성공");
	}

}
