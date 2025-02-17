package jpa.repository;

import com.google.common.collect.Sets;
import jpa.domain.upms.Permission;
import jpa.domain.upms.Role;
import jpa.domain.upms.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xiongchengwei
 * @Date: 2019/10/8 下午1:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Rollback(false)
    @Test
    public void saveTest() throws Exception {
        User user = User.builder().phone("1222").build();
        Set<Role> roles = createRoles();
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Test
    public void findAllTest() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

    private Set<Role> createRoles() {
        Set<Permission> permissions = createPermissions();

        Role role = Role.builder().roleName("普通角色").permissions(permissions).build();
        Set<Role> roles = Sets.newHashSet(role);

        return roles;
    }

    private Set<Permission> createPermissions() {
        Set<Permission> permissions = new HashSet<>();
        Permission permission = Permission.builder().permissionName("新增").build();
        permissions.add(permission);
        return permissions;
    }

}