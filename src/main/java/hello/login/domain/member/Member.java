package hello.login.domain.member;

import lombok.Data;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Data
@Setter
public class Member {

    private Long id;

    @NotEmpty
    private String loginId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
}
