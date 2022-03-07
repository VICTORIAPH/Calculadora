package mx.edu.itm.link.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.itm.link.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}