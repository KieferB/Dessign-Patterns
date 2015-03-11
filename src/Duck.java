/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
        }
    
    public void performFly(){
        flyBehavior.fly();
        }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("Alle eenden drijven, ook lokeenden!");
    } 
    
}
