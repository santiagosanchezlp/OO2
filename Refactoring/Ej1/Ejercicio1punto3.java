public class Ejercicio1punto3 {
//Bad Smell: Temporary Field
//Refactoring: Replace Temp With Query / Inline Temp

    public void imprimirValores() {
//        int totalEdades = 0;
//        double promedioEdades = 0;
//        double totalSalarios = 0;
        
//        for (Empleado empleado : personal) {
//            totalEdades = totalEdades + empleado.getEdad();
//            totalSalarios = totalSalarios + empleado.getSalario();
//        }
//        promedioEdades = totalEdades / personal.size();
//            
//        String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);        
//        System.out.println(message);

        System.out.println("El promedio de las edades es %s y el total de salarios es %s", 
                           this.getPromedioEdades() , 
                           this.getTotalSalario());
    }

    private int getPromedioEdades(){
        return this.personal.stream().mapToDouble(emp->emp.getEdad()).average().orElse(0);
    }
    private double getTotalSalario(){
        return this.personal.stream().mapToDouble(emp->emp.getSalario()).sum();
    }
}
