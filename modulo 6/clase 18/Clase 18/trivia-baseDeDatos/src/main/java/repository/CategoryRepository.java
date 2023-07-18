package repository;


import atl.academy.bootcamp.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional
public class CategoryRepository {


    //@PersistenceContext
    //EntityManager entityManager;


    public Category findById(Long id){
       return null;
        // return entityManager.find(Category.class, id);
    }



}
