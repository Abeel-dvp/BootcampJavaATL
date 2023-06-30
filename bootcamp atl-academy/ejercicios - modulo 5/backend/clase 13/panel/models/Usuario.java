package academy.atl.panel.models;

import lombok.*;

//@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
// OR Data 3primeros resume
@Data @AllArgsConstructor
public class Usuario {


    private Integer id;
    private  String nombre;
    private  String apellido;
    private String telefono;
    private String email;


}
