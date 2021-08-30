package hello.login.web.login;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinitions;
import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
