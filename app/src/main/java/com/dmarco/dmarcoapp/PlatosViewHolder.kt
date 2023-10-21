package com.dmarco.dmarcoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.PopupMenu



class PlatosViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_plato, parent, false)) {

    private var imgPlato: ImageView? = null
    private var textNombre: TextView? = null
    private var textCategoria: TextView? = null
    private var textPrecio: TextView? = null
    private var textDescripcion: TextView? = null

    init {
        imgPlato = itemView.findViewById(R.id.imgPlato)
        textNombre = itemView.findViewById(R.id.textNombre)
        textCategoria = itemView.findViewById(R.id.textCategoria)
        textPrecio = itemView.findViewById(R.id.textPrecio)
        textDescripcion = itemView.findViewById(R.id.textDescripcion)
        itemView.setOnClickListener { v ->
            showPopupMenu(v)
        }
    }

    fun bind(plato: Platos) {
        textNombre?.text = plato.nombre
        textCategoria?.text = plato.categoria
        textPrecio?.text = plato.precio
        textDescripcion?.text = plato.descripcion
        imgPlato?.setImageResource(plato.image)
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(view.context, view)
        popupMenu.menuInflater.inflate(R.menu.menu_emergente, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_abrir_detalle -> {
                    // Aquí manejas la acción "Abrir detalle"
                    true
                }
                R.id.action_compartir -> {
                    // Aquí manejas la acción "Compartir"
                    true
                }
                R.id.action_preguntas -> {
                    // Aquí manejas la acción "Preguntas"
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

}