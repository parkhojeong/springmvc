package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users() {
        return "users";
    }

    @PostMapping
    public String postUsers() {
        return "postUsers";
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId) {
        return "getUser userId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "putUser userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "deleteUser userId=" + userId;
    }
}
