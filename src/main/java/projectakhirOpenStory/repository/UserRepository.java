package projectakhirOpenStory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projectakhirOpenStory.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
