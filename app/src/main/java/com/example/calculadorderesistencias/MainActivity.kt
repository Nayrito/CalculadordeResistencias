package com.example.calculadorderesistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var entrada = ""
    private var resultado = ""
    private var tol = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btCalculo.setOnClickListener {


            var b1 = spB1.selectedItem.toString()
            var b2 = spB2.selectedItem.toString()
            var b3 = spB3.selectedItem.toString()
            var b4 = spB4.selectedItem.toString()

            if (b1.equals("Banda1")) {
                Toast.makeText(this, "Seleccione todas las bandas", Toast.LENGTH_SHORT).show()
            } else if (b2.equals("Banda2")) {
                Toast.makeText(this, "Seleccione todas las bandas", Toast.LENGTH_SHORT).show()
            } else if (b3.equals("Banda3")) {
                Toast.makeText(this, "Seleccione todas las bandas", Toast.LENGTH_SHORT).show()
            } else if (b4.equals("Banda4")) {
                Toast.makeText(this, "Seleccione todas las bandas", Toast.LENGTH_SHORT).show()
            } else {
                color_conversor(b1, b2, b3, b4)
            }
        }

    }

    private fun color_conversor(b1: String, b2: String, b3: String, b4: String) {
        var banda1=""
        var banda2=""
        var banda3=""
        var banda4=""
        if(b1.equals("Negro")){banda1=""}
        else if(b1.equals("Marron")){banda1="1";ibtBanda1.setImageResource(R.drawable.marron)}
        else if(b1.equals("Rojo")){banda1="2";ibtBanda1.setImageResource(R.drawable.rojo)}
        else if(b1.equals("Naranja")){banda1="3";ibtBanda1.setImageResource(R.drawable.naranja)}
        else if(b1.equals("Amarillo")){banda1="4";ibtBanda1.setImageResource(R.drawable.amarillo)}
        else if(b1.equals("Verde")){banda1="5";ibtBanda1.setImageResource(R.drawable.verde)}
        else if(b1.equals("Azul")){banda1="6";ibtBanda1.setImageResource(R.drawable.azul)}
        else if(b1.equals("Purpura")){banda1="7";ibtBanda1.setImageResource(R.drawable.purpura)}
        else if(b1.equals("Gris")){banda1="8";ibtBanda1.setImageResource(R.drawable.gris)}
        else if(b1.equals("Blanco")){banda1="9";ibtBanda1.setImageResource(R.drawable.blanco)}

        if(b2.equals("Negro")){banda2="0"}
        else if(b2.equals("Marron")) {banda2="1";ibtBanda2.setImageResource(R.drawable.marron)}
        else if(b2.equals("Rojo")){banda2="2";ibtBanda2.setImageResource(R.drawable.rojo)}
        else if(b2.equals("Naranja")){banda2="3";ibtBanda2.setImageResource(R.drawable.naranja)}
        else if(b2.equals("Amarillo")){banda2="4";ibtBanda2.setImageResource(R.drawable.amarillo)}
        else if(b2.equals("Verde")){banda2="5";ibtBanda2.setImageResource(R.drawable.verde)}
        else if(b2.equals("Azul")){banda2="6";ibtBanda2.setImageResource(R.drawable.azul)}
        else if(b2.equals("Purpura")){banda2="7";ibtBanda2.setImageResource(R.drawable.purpura)}
        else if(b2.equals("Gris")){banda2="8";ibtBanda2.setImageResource(R.drawable.gris)}
        else if(b2.equals("Blanco")){banda2="9";ibtBanda2.setImageResource(R.drawable.blanco)}

        if(b3.equals("Negro")){banda3="Ω "}
        else if(b3.equals("Marron")){banda3="0Ω ";ibtBanda3.setImageResource(R.drawable.marron)}
        else if(b3.equals("Rojo")){banda3="00Ω ";ibtBanda3.setImageResource(R.drawable.rojo)}
        else if(b3.equals("Naranja")){banda3="KΩ ";ibtBanda3.setImageResource(R.drawable.naranja)}
        else if(b3.equals("Amarillo")){banda3="0KΩ ";ibtBanda3.setImageResource(R.drawable.amarillo)}
        else if(b3.equals("Verde")){banda3="00KΩ ";ibtBanda3.setImageResource(R.drawable.verde)}
        else if(b3.equals("Azul")){banda3="MΩ ";ibtBanda3.setImageResource(R.drawable.azul)}
        else if(b3.equals("Dorado")){banda3="0.1";ibtBanda3.setImageResource(R.drawable.dorado)}
        else if(b3.equals("Plateado")){banda3="0.01";ibtBanda3.setImageResource(R.drawable.plateado)}

        if(b4.equals("Marron")){banda4="± 1%";ibtBanda4.setImageResource(R.drawable.marron)}
        else if(b4.equals("Rojo")){banda4="± 2%";ibtBanda4.setImageResource(R.drawable.rojo)}
        else if(b4.equals("Dorado")){banda4="± 5%";ibtBanda4.setImageResource(R.drawable.dorado)}
        else if(b4.equals("Plateado")){banda4="± 10%";ibtBanda4.setImageResource(R.drawable.plateado)}

        if(banda3.equals("0.1")){
            var cast = (banda1+banda2).toDouble()
            cast = (cast*0.1)
            var str= cast.toString()
            resultado = str+"Ω"+banda4
            tvShow.text = resultado
        }
        else if(banda3.equals("0.01")){
            var cast = (banda1+banda2).toDouble()
            cast = (cast*0.01)
            var str= cast.toString()
            resultado = str+"Ω"+banda4
            tvShow.text = resultado
        }
        else{
            resultado = banda1+banda2+banda3+""+banda4
            tvShow.text = resultado
        }

    }
}
