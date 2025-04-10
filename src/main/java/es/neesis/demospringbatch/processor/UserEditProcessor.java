package es.neesis.demospringbatch.processor;

import es.neesis.demospringbatch.dto.User;
import es.neesis.demospringbatch.model.UserEntity;
import org.springframework.batch.item.ItemProcessor;

public class UserEditProcessor implements ItemProcessor<User, UserEntity> {


    @Override
    public UserEntity process(User user) {
        // Me llega Null name y surname, para comprobar :
        System.out.println("Usuario recibido en processor: " + user);

        return UserEntity.builder()
                .id(Integer.parseInt(user.getId()))
                .username(user.getUsername() + "EDITED")
                .password(user.getPassword() + "EDITED")
                .email(user.getEmail() + "EDITED")
                .name(user.getName() + "EDITED")
                .surname(user.getSurname() + "EDITED")
                .build();
    }
}
