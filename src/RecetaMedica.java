import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecetaMedica {
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Medico medico;
    private final List<String> medicamentos;

    public RecetaMedica(LocalDateTime fechaHora, Paciente paciente, Medico medico, List<String> medicamentos) {
        setFechaHora(fechaHora);
        setPaciente(paciente);
        setMedico(medico);

        this.medicamentos = new ArrayList<>();
        if (medicamentos != null) this.medicamentos.addAll(medicamentos);
    }

    public void agregarMedicamento(String medicamento) {
        if (medicamento != null && !medicamento.trim().isEmpty()) {
            medicamentos.add(medicamento.trim());
        }
    }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null) throw new IllegalArgumentException("fechaHora no puede ser null");
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) {
        if (paciente == null) throw new IllegalArgumentException("paciente no puede ser null");
        this.paciente = paciente;
    }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) {
        if (medico == null) throw new IllegalArgumentException("medico no puede ser null");
        this.medico = medico;
    }

    // Encapsulate collection:
    public List<String> getMedicamentos() {
        return Collections.unmodifiableList(medicamentos);
    }
}