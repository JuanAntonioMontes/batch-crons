package es.neesis.demospringbatch.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@Data
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private String email;
    //private String name;
    //private String surname;
    private String fullName;
    private Timestamp createdAt;
}
