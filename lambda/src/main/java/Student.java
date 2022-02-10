import lombok.*;

import java.util.Objects;



@AllArgsConstructor
@Data
//@Data will give all below command out annotations, it include them. it's a shortcut.
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    //private final int age;



}
