package es.neesis.demospringbatch.processor;

import es.neesis.demospringbatch.dto.User;
import es.neesis.demospringbatch.model.UserEntity;
import org.springframework.batch.item.ItemProcessor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

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
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
