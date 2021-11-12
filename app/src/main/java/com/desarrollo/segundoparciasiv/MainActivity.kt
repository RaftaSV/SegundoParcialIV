package com.desarrollo.segundoparciasiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv_mostrar: TextView
    private lateinit var lv_lista : ListView
    private var NombreMascotas = arrayOf("Cheese","Lasy","Terry","Michi","Orejas","Beethoven")
    private var Especie = arrayOf("Perro","Perro","Ormitorrinco","Gato","Conejo","Perro")
    private var Color = arrayOf("Canelo","Cafe","Besh","Blanco","Blanco y Cafe","Cafe")
    private var Sexo = arrayOf("Macho","Hembra","Macho","Macho","Hembra","Macho")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()
        tv_mostrar = findViewById(R.id.tv_Mostrar)
        lv_lista = findViewById(R.id.lv_list)
        val adaptadoLista = ArrayAdapter(this,android.R.layout.simple_list_item_1,NombreMascotas)
        lv_lista.adapter=adaptadoLista
        lv_lista.setOnItemClickListener{adapterView,View,i,l ->
            tv_mostrar.setText("La Especie de "+lv_lista.getItemAtPosition(i)+ " es: "+Especie[i]+ System.getProperty("line.separator")
            +"Color: " + Color[i] + System.getProperty("line.separator")
            +"Sexo: "+ Sexo[i])
        }
    }
}