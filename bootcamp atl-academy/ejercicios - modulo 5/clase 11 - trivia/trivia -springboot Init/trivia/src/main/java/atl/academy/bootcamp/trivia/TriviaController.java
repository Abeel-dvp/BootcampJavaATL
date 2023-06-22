package atl.academy.bootcamp.trivia;

import atl.academy.bootcamp.trivia.entities.Categoria;
import atl.academy.bootcamp.trivia.entities.Pregunta;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
    @SpringBootApplication
    public class TriviaController {

        @GetMapping("/question/{categoria}")
        public String getQuestion(@PathVariable String categoria){
            return "{\n" +
                    "  \"category\": \"Cultura\",\n" +
                    "  \"question\": \"¿Qué ingredintes se necesitan para hacer una michelada?\",\n" +
                    "  \"options\": [\"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante\", \"Cerveza, lima/limón y limon\", \"Cerveza, sal, tabasco y lima/limón\"],\n" +
                    "  \"answer\": 0,\n" +
                    "  \"explanation\": \"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"\n" +
                    "}";
        }
        @GetMapping("/question/Cine")
        public Pregunta getQuestionCine(){

            Pregunta pregunta = new Pregunta();
            pregunta.setCategory("Cultura");
            pregunta.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
            pregunta.setAnswer(0);
            pregunta.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");


            String [] options = new String[3];
            options[0]= "Cerveza, lima/limon, sal, chile en polvo, salsa tipo inglesa,picante";
            options[1]= "Cerveza, lima/limon y limon";
            options[2]= "Cerveza, sal, tabasco y lima/limon";

            /*
            List<String> options = new ArrayList();
            options.add("Cerveza, lima/limon, sal, chile en polvo, salsa tipo inglesa,picante");
            options.add("Cerveza, lima/limon y limon");
            options.add("Cerveza, sal, tabasco y lima/limon");
                */
            pregunta.setOptions(options);
            return  pregunta;

          /*  return "{\n" +
                    "  \"category\": \"Cultura\",\n" +
                    "  \"question\": \"¿Qué ingredintes se necesitan para hacer una michelada?\",\n" +
                    "  \"options\": [\"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante\", \"Cerveza, lima/limón y limon\", \"Cerveza, sal, tabasco y lima/limón\"],\n" +
                    "  \"answer\": 0,\n" +
                    "  \"explanation\": \"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"\n" +
                    "}";*/
        }


        @GetMapping("/categories")
        public Categoria[] getCategories() {

            Categoria categoria = new Categoria();
            categoria.setCategory("Arte");
            categoria.setDescription( "Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

            Categoria categoria1 = new Categoria();
            categoria1.setCategory("Deportes");
            categoria1.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

            Categoria[] categorias = {categoria, categoria1};

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





