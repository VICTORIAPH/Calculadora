package mx.edu.itm.link.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import mx.edu.itm.link.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        /*   limpiamos el edit text con clear*/
        binding.buttonAC.setOnClickListener {
            binding.editTextNumber.text.clear()
        }
        /*delete*/
        binding.buttonDelete.setOnClickListener {
            //binding.editTextNumber.text.append(".")
        }
          }
    fun numberButtonCliked(view: View){
        val button = view as Button
        if(button.id.equals(binding.buttondecimal.id) ){
            if( !binding.editTextNumber.text.contains('.')){
                binding.editTextNumber.text.append(button.text)
            }
        }else{
            binding.editTextNumber.text.append(button.text)
        }


        /*   como saber cual de todos los botones oprimimos?*/
        /*
            binding.editTextNumber.text.append(button.text)*/
        /* hacerlo con el id de los btns*/
     /* when(button.id){
            binding.buttondecimal.id ->{binding.editTextNumber.text.append(".")}
            binding.button0.id-> {binding.editTextNumber.text.append("0")}
            binding.button1.id-> {binding.editTextNumber.text.append("1")}
            binding.button2.id-> {binding.editTextNumber.text.append("2")}
            binding.button3.id-> {binding.editTextNumber.text.append("3")}
            binding.button4.id-> {binding.editTextNumber.text.append("4")}
            binding.button5.id-> {binding.editTextNumber.text.append("5")}
            binding.button6.id-> {binding.editTextNumber.text.append("6")}
            binding.button7.id-> {binding.editTextNumber.text.append("7")}

            else -> {
                Toast.makeText(this, "else", Toast.LENGTH_SHORT).show()
            }
        }*/

    }
}