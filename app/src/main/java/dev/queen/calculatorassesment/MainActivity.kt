package dev.queen.calculatorassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    //Initializing text input layouts
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber : TextInputLayout

    //Initializing text input edit texts
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText

    //Initializing buttons
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMode: Button
    lateinit var btnDivide: Button

    //Initializing text views
    lateinit var tvResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSub)
        btnMode = findViewById(R.id.btnMode)
        btnDivide = findViewById(R.id.btnDivide)
        tvResults = findViewById(R.id.tvResults)

        btnAdd.setOnClickListener {
            obtainInputs()
            add()
        }

        btnSubtract.setOnClickListener {
            obtainInputs()
            sub()
        }

        btnMode.setOnClickListener {
            obtainInputs()
            modulus()
        }

        btnDivide.setOnClickListener {
            obtainInputs()
            divide()
        }


    }

    fun add(){
        var num_one = etFirstNumber.text.toString().toInt()
        var num_two = etSecondNumber.text.toString().toInt()
        var add = num_one + num_two
        tvResults.text = add.toString()
    }

    fun sub(){
        var num_one = etFirstNumber.text.toString().toInt()
        var num_two = etSecondNumber.text.toString().toInt()
        var subs = num_one - num_two
        tvResults.text = subs.toString()
    }

    fun modulus(){
        var num_one = etFirstNumber.text.toString().toInt()
        var num_two = etSecondNumber.text.toString().toInt()
        var modulus = num_one % num_two
        tvResults.text = modulus.toString()
    }
    fun divide(){
        var num_one = etFirstNumber.text.toString().toInt()
        var num_two = etSecondNumber.text.toString().toInt()
        var divide = num_one / num_two
        tvResults.text = divide.toString()
    }


    fun obtainInputs(){
        var num_one = etFirstNumber.text.toString()
        var num_two = etFirstNumber.text.toString()

        if (num_one.isBlank()){
            tilFirstNumber.error = "First number required"
        }
        if (num_two.isBlank()){
            tilSecondNumber.error = "Second number required"
        }
    }

}

