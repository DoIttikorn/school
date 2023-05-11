package school.learn.domain.teacher.repository

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import school.learn.domain.teacher.model.Teacher


@ConditionalOnProperty(value = ["application.teacher.cache.enabled"], havingValue = "true")
@Primary
@Repository
class TeacherRepositoryImpl : TeacherRepository {
    override fun findAll(): Mono<List<Teacher>> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Mono<Teacher> {
        TODO("Not yet implemented")
    }

    override fun save(teacher: Teacher): Mono<Teacher> {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long): Mono<Void> {
        TODO("Not yet implemented")
    }

    override fun edit(teacher: Teacher): Mono<Teacher> {
        TODO("Not yet implemented")
    }

    override fun findByName(name: String): Mono<Teacher> {
        TODO("Not yet implemented")
    }

    override fun findByEmail(email: String): Mono<Teacher> {
        TODO("Not yet implemented")
    }

    override fun findByPhone(phone: String): Mono<Teacher> {
        TODO("Not yet implemented")
    }
}