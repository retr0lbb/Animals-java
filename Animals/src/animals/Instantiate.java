/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author aluno
 */
public class Instantiate {
    public static void main(String [] args){
    Dog dog = new Dog();
    Galinha galinha = new Galinha();
    Coruja coruja = new Coruja();
    
    
    coruja.BotaOvo();
    dog.name = "Vacalo";
    
    System.out.println(dog.name);
    }
}
