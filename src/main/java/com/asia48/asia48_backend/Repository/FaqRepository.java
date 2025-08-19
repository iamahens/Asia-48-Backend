package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {

}
