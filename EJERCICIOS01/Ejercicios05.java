package EJERCICIOS01;

public class Ejercicios05 {
    public static void main(String[] args) {
        String r = "\033[31m";
        String v = "\033[32m";
        String n = "\033[33m";
        String a = "\033[34m";
        String m = "\033[35m";
        String c = "\033[36m";
        String b = "\033[37m";
    
        
        System.out.printf("5%s      %-9s        %-9s         %-9s          %-9s        %-9s\n","Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"08.15", r+"Sistemas",a+"Prog",r+"Sistemas",a+"Prog",a+"lidre");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"09.15", r+"Sistemas",a+"Prog",r+"Sistemas",a+"Prog",a+"lidre");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"10.15", r+"Sistemas",a+"Prog",r+"Sistemas",a+"Prog",v+"lidre");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"11.45", c+"FOL", m+"lidre",v +"Entorno",m+"BBDD",n+"Lidre");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"12.40", c+"FOL", m+"lidre",n +"Lidre",m+"lidre",n+"calculo");
        System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-15s\n",  b+"13.35", c+"FOL", m+"lidre",n +"Lidre",m+"lidre",n+"calculo");
      }
    }
     


