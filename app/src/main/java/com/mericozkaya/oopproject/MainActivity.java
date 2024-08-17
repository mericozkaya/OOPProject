package com.mericozkaya.oopproject;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*
        User myUser= new User();
        myUser.name="Atil";
        myUser.job="Instructor";

        User newUser=new User();
        newUser.name="Kirk";
        newUser.job="Musician";
         */

        User myUser=new User("Atil","Instructor");
        System.out.println(myUser.information());
        System.out.println(myUser.name);

        //Encapsulation
        Musician james=new Musician("James","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"Atil");
        System.out.println(james.getAge());


        //Inheritance
        SuperMusician lars =new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics=new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        Animal myAnimal =new Animal();
        myAnimal.sing();

        Dog barley=new Dog();
        barley.test();
        barley.sing();

        //Abstract&Interface
        Piano myPiano=new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();



    }
}