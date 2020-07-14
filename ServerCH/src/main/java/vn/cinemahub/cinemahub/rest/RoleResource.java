package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.cinemahub.cinemahub.entities.GheEntity;
import vn.cinemahub.cinemahub.entities.Role;
import vn.cinemahub.cinemahub.serviceImpl.RoleService;

@CrossOrigin
@RestController
public class RoleResource {
    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role save(@RequestBody Role role) {
        return this.roleService.save(role);
    }
}
