package es.neesis.demospringbatch.processor;

import es.neesis.demospringbatch.dto.User;
import es.neesis.demospringbatch.model.UserEntity;
import org.springframework.batch.item.ItemProcessor;

public class UserProcessor implements ItemProcessor<User, UserEntity> {

    @Override
    public UserEntity process(User user) {

        String fullName = user.getName() + " " + user.getSurname();

        return UserEntity.builder()
                .id(Integer.parseInt(user.getId()))
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                //.name(user.getName())
                //.surname(user.getSurname())
                .fullName(user.getName() + " " + user.getSurname())
                .build();
    }
}
