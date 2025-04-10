package es.neesis.demospringbatch.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private String fullName;

    public void setFull_name(String fullName) {
        this.fullName = fullName;
        // Separar el nombre completo en name y surname
        String[] parts = fullName.split(" ", 2);
        this.name = parts.length > 0 ? parts[0] : "";
        this.surname = parts.length > 1 ? parts[1] : "";
    }
}
