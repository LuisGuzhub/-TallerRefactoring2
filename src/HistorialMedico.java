// HistorialMedico.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private final List<Consulta> consultas;
    private final List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    // Encapsulate collection: devolvemos una vista inmodificable.
    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return Collections.unmodifiableList(recetasMedicas);
    }

    public void agregarConsulta(Consulta consulta) {
        if (consulta != null)
            consultas.add(consulta);
    }

    public void agregarReceta(RecetaMedica receta) {
        if (receta != null)
            recetasMedicas.add(receta);
    }
}