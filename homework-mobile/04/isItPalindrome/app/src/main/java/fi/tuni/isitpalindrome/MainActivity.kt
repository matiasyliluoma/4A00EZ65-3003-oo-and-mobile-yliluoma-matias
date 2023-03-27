package fi.tuni.isitpalindrome

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById(R.id.palinappi)
        val textView : TextView = findViewById(R.id.vieweri)
        val textView3 : TextView = findViewById(R.id.vieweri3)
        this.editText = findViewById(R.id.editkent)



        var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                textView3.text = data?.getStringExtra("number")
            }
        }


        myButton.setOnClickListener() {


           // if(text == reversedText) {
            //    textView.text = "YES"
           // } else {
           //     textView.text = "NO"
          //  }

            textView.text = if(editText?.text.toString().isPalindrome(editText)) "YES" else "NO"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("is_palindrome", editText?.text.toString().isPalindrome(editText))



            resultLauncher.launch(intent)

        }

        


        this.editText?.addMyKeyListener {
            textView.text = if(it.isPalindrome(editText)) "YES" else "NO"
        }

        Log.d("TAG", "onCreate()")
    }


    fun String.isPalindrome(editText: EditText?) : Boolean {
        var text = editText?.text.toString()
        var reversedText = text.reversed()
        if(text == reversedText) {
            return true
        }
        return false
    }

    fun EditText.addMyKeyListener(function: (String) -> Unit) {
        editText?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {
                function.invoke(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
    }
    
    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy()")
    }
}

