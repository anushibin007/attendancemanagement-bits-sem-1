package wilp.dbms.attendancemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import wilp.dbms.attendancemanagement.model.Role;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
