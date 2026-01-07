import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaAtencionMedico {
    private final List<Paciente> pacientes;
    private final List<Medico> medicos;
    private final List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        if (paciente != null)
            pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        if (medico != null)
            medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        if (servicioMedico != null)
            serviciosMedicos.add(servicioMedico);
    }

    // Encapsulate collection: vistas inmodificables
    public List<Paciente> getPacientes() {
        return Collections.unmodifiableList(pacientes);
    }

    public List<Medico> getMedicos() {
        return Collections.unmodifiableList(medicos);
    }

    public List<ServicioMedico> getServiciosMedicos() {
        return Collections.unmodifiableList(serviciosMedicos);
    }

    // Parameterize method: un solo "buscarPorNombre" para evitar duplicación.
    private <T extends Persona> T buscarPorNombre(List<T> lista, String nombre) {
        if (nombre == null)
            return null;
        for (T item : lista) {
            if (item.getNombre().equalsIgnoreCase(nombre.trim()))
                return item;
        }
        return null;
    }

    public Paciente obtenerPaciente(String nombrePaciente) {
        return buscarPorNombre(pacientes, nombrePaciente);
    }

    public Medico obtenerMedico(String nombreMedico) {
        return buscarPorNombre(medicos, nombreMedico);
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        if (nombreServicio == null)
            return null;
        for (ServicioMedico servicio : serviciosMedicos) {
            if (servicio.getNombre().equalsIgnoreCase(nombreServicio.trim()))
                return servicio;
        }
        return null;
    }

    // Remove parameter: el paciente ya va dentro de la consulta.
    public void agendarConsulta(Consulta consulta) {
        if (consulta == null)
            return;
        consulta.getPaciente().getHistorialMedico().agregarConsulta(consulta);
    }
}
