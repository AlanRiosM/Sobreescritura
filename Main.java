public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 30000.0);
        Gerente gerente1 = new Gerente("Ana", 50000.0, 10000.0);
        Desarrollador desarrollador1 = new Desarrollador("Carlos", 40000.0, 10);

        double salarioEmpleado = empleado1.calcularSalario();
        double salarioGerente = gerente1.calcularSalario();
        double salarioDesarrollador = desarrollador1.calcularSalario();

        System.out.println("Salario de " + empleado1.nombre + ": $" + salarioEmpleado);
        System.out.println("Salario de " + gerente1.nombre + ": $" + salarioGerente);
        System.out.println("Salario de " + desarrollador1.nombre + ": $" + salarioDesarrollador);
    }
}