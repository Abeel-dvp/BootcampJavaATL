package atl.academy.bootcamp.trivia;

import repository.CategoryRepository;
import atl.academy.bootcamp.trivia.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



import java.util.*;
import java.time.LocalDate;


@RestController
    public class TriviaController {

        @Autowired
        CategoryRepository categoryRepository;

        @GetMapping("/busqueda-{id}")
        public Category buscarPorId(@PathVariable Long id){

            return categoryRepository.findById(id);
        }




    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria) {



        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }


        @GetMapping("/categories")
        public Category[] getCategories() {

            Category categoria = new Category();
            categoria.setName("Arte");
            categoria.setDescription( "Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

            Category categoria1 = new Category();
            categoria1.setName("Deportes");
            categoria1.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

            Category[] categorias = {categoria, categoria1};

            return  categorias;
           /* return "[\n" +
                    "  {\n" +
                    "    \"category\": \"Cultura\",\n" +
                    "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Deportes\",\n" +
                    "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Arte\",\n" +
                    "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Cine\",\n" +
                    "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Historia\",\n" +
                    "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Ciencia\",\n" +
                    "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                    "  }\n" +
                    "]";

            */
        }

    }





