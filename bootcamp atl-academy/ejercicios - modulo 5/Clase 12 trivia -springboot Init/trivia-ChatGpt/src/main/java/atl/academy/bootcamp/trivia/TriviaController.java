package atl.academy.bootcamp.trivia;

import atl.academy.bootcamp.trivia.entities.Categoria;
import atl.academy.bootcamp.trivia.entities.Pregunta;
import com.fasterxml.jackson.databind.ObjectMapper;
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

            ChatGptClient chatGpt = new ChatGptClient();
            String respuestaJson = chatGpt.enviarPregunta("Estoy armando una trivia, necesito que me des una pregunta de la categoria \" + categoria + \", con la siguiente estructura de JSON. LA respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:\\n\" +\n" +
                    "                \"\\n\" +\n" +
                    "                \"{\\n\" +\n" +
                    "                \"  \\\"category\\\": \\\"aca va el nombre de la categoria\\\",\\n\" +\n" +
                    "                \"  \\\"question\\\": \\\"aca va la pregunta\\\",\\n\" +\n" +
                    "                \"  \\\"options\\\": [\\n\" +\n" +
                    "                \"    \\\"aca va la opcion 1\\\",\\n\" +\n" +
                    "                \"    \\\"aca va la opcion 2\\\",\\n\" +\n" +
                    "                \"    \\\"aca va la opcion 3\\\"\\n\" +\n" +
                    "                \"  ],\\n\" +\n" +
                    "                \"  \\\"answer\\\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\\n\" +\n" +
                    "                \"  \\\"explanation\\\": \\\"aca tienes que poner una explicacion diciendo porque es la respuesta correcta\\\"\\n\" +\n" +
                    "                \"}\"");

            return respuestaJson;

           // ObjectMapper convertidor = new ObjectMapper(); //Convertidor java json y vicebersa
          // Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class); //transforma al Json en un objeto pregunta y lo aloja en preg la variable

            //return preg;


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





