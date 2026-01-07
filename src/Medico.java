public class Medico extends Persona {

    public Medico(String nombre, int edad, Genero genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
    }

    // Rename method + Remove parameter: eliminamos parámetros que no se usan.
    public void realizarConsulta(Consulta consulta) {
        System.out.println("Realizando consulta a " + consulta.getPaciente().getNombre());
        String tratamiento = "Conservador...";
        prescribirTratamiento(consulta.getPaciente(), tratamiento); // Hide method: solo se usa internamente
    }

    // Hide method: nadie fuera de Medico debería llamarlo directamente.
    private void prescribirTratamiento(Paciente paciente, String tratamiento) {
        System.out.println("Prescribiendo tratamiento: " + tratamiento);
    }

    public void administrarMedicamento(Paciente paciente, String medicamento) {
        // Implementación para administrar medicamentos al paciente.
    }
}