package com.dmarco.dmarcoapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.MenuItem
import android.content.Intent


class PlatosActivity : AppCompatActivity() {

    private val listPlatos = listOf(
        Platos("Pizza DMarco", "Pizzas", "S/ 25.00", "La mejor pizza con la combinación perfecta de queso, espinaca y carnes del norte trujillano", R.drawable.imagen1),
        Platos("Duo DMarco", "Bebidas", "S/ 15.00", "La combinación perfecta para compartir entre amigos", R.drawable.imagen2),
        Platos("Pan con Pollo", "Sanguches", "S/ 15.00", "El tradicional pan con pollo trujillano, solo en DMarco", R.drawable.imagen3),
        Platos("Cafe", "Bebidas", "S/ 10.00", "Los mejores granos del norte peruano solo en DMarco", R.drawable.imagen4),
        Platos("Ceviche Tradicional", "Marino", "S/ 25.00", "El infaltable ceviche trujillano", R.drawable.imagen5)

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platos)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)
        title = "Platos D'Marco"

        val recyclerPlatos = findViewById<RecyclerView>(R.id.recyclerPlatos)
        recyclerPlatos.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlatosAdapter(listPlatos)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.platos_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_search -> {
                // Handle search action
                return true
            }
            R.id.action_register -> {
                // Handle register action
                return true
            }
            R.id.action_questions -> {
                // Navigate to activity_preguntas when "Preguntas" is selected
                val intent = Intent(this, PreguntasActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}