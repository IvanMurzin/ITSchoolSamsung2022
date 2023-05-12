package ru.ivanmurzin.testserver.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import ru.ivanmurzin.testserver.model.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    @NonNull
    UserEntity save(@NonNull UserEntity user);
}
