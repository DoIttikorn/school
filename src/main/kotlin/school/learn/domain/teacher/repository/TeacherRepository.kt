package school.learn.domain.teacher.repository

import school.learn.domain.teacher.model.Teacher
import reactor.core.publisher.Mono


interface TeacherRepository {

    fun findAll(): Mono<List<Teacher>>

    fun findById(id: Long): Mono<Teacher>

    fun save(teacher: Teacher): Mono<Teacher>

    fun deleteById(id: Long): Mono<Void>

    fun edit(teacher: Teacher): Mono<Teacher>

    fun findByName(name: String): Mono<Teacher>

    fun findByEmail(email: String): Mono<Teacher>

    fun findByPhone(phone: String): Mono<Teacher>
}