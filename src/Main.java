public class Main {
    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "kevin";
        cliente.telefono = 12345678;
        cliente.credito = 35;
cliente.showInformation();
        Trabajador mitrabajador = new Trabajador();
        mitrabajador.edad = 44;
        mitrabajador.nombre = "cristian";
        mitrabajador.telefono = 1234567;
        mitrabajador.salario = 3000;
        mitrabajador.showInformation();


    }



}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
        int credito;

    public void showInformation () {
        System.out.println("cliente");
        System.out.println( "Name: " + this.nombre );
        System.out.println( "Age: " + this.edad );
        System.out.println( "Phone Number: " + this.telefono );
        System.out.println( "Creadit/Salary: " + this.credito );
    }
}

class Trabajador extends Persona {
    int salario;
    public void showInformation () {
        System.out.println("trabajador");
        System.out.println( "Name: " + this.nombre );
        System.out.println( "Age: " + this.edad );
        System.out.println( "Phone Number: " + this.telefono );
        System.out.println( "Creadit/Salary: " + this.salario );
    }
}