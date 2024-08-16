package br.edu.ifsp.scl.ads.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.ads.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var contador: Int  = 0
    private lateinit var amb: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)
        amb.inicialEt.setOnClickListener{
            contador = if (amb.inicialCb.isChecked)
                amb.inicialCb.text.toString().toInt()
                else 0
        }
        amb.cliqueBt.setOnClickListener{
            amb.contadorTv.setText((++contador).toString())
        }
        amb.zeroRb.setOnClickListener{
            contador = amb.zeroRb.text.toString().toInt()
        }
        amb.umRb.setOnClickListener{
            contador = amb.zeroRb.text.toString().toInt()
        }

    }
}