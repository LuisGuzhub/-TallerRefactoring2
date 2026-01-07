
// Consulta.java
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consulta {
    private LocalDateTime fechaHora; 
    private Paciente paciente; 
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;

    private final List<String> examenesMedicos;

    public Consulta(LocalDateTime fechaHora,
            Paciente paciente,
            Medico medico,
            ServicioMedico servicioMedico,
            String diagnostico,
            String tratamiento,
            List<String> examenesMedicos) {
        setFechaHora(fechaHora);
        setPaciente(paciente);
        setMedico(medico);
        setServicioMedico(servicioMedico);
        setDiagnostico(diagnostico);
        setTratamiento(tratamiento);

        this.examenesMedicos = new ArrayList<>();
        if (examenesMedicos != null)
            this.examenesMedicos.addAll(examenesMedicos);
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null)
            throw new IllegalArgumentException("fechaHora no puede ser null");
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null)
            throw new IllegalArgumentException("paciente no puede ser null");
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        if (medico == null)
            throw new IllegalArgumentException("medico no puede ser null");
        this.medico = medico;
    }

    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        if (servicioMedico == null)
            throw new IllegalArgumentException("servicioMedico no puede ser null");
        this.servicioMedico = servicioMedico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    // Encapsulate collection:
    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }

    public void agregarExamen(String examen) {
        if (examen != null && !examen.trim().isEmpty()) {
            examenesMedicos.add(examen.trim());
        }
    }
}



