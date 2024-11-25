package evgen.task_tracker_api.store.repositories;

import evgen.task_tracker_api.store.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
}
