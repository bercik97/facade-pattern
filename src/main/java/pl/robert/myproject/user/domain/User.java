package pl.robert.myproject.user.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity(name = "users")
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
class User implements Serializable {
    private static final long serialVersionUID = 101L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 13)
    private String name;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 3, max = 13)
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 6, max = 30)
    private String password;
}
