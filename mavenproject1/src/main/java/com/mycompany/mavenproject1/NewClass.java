package com.mycompany.mavenproject1;

import characters.Character;
        
public class NewClass {
    
    public static void main(String[] args){
        Character homero = new Character("Homero","Inspector de seguridad", 33, "A la grande le puse cuca");
        homero.greeting();
        System.out.println(homero.getAge());
        
        Character bart = new Character();
        bart.setPhrase("Ay caramba");
        bart.greeting();
}
}
