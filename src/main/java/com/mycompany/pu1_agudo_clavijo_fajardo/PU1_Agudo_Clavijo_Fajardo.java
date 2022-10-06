/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pu1_agudo_clavijo_fajardo;

/**
 *
 * @author PC-2
 */
public class PU1_Agudo_Clavijo_Fajardo {

    public static void main(String[] args) {
        System.out.println("Clase01");
        
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        
        perro1.nombre="alex";
        perro1.raza="pug";
        perro1.edad=5;
        
        perro2.nombre="koc";
        perro2.raza="labrador";
        perro2.edad=6;
        
        perro3.nombre="tilin";
        perro3.raza="cocker";
        perro3.edad=4;
       
       System.out.println("mi perro se llama: "+perro1.nombre+" tiene "
               +perro1.edad+" años "+"y es un: "+perro1.raza);
       
       System.out.println("mi perro se llama: "+perro2.nombre+" tiene "
               +perro2.edad+" años "+"y es un: "+perro2.raza);
       
       System.out.println("mi perro se llama: "+perro3.nombre+" tiene "
               +perro3.edad+" años "+"y es un: "+perro3.raza);
        
    }
}
