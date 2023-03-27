package fi.tuni.isitpalindrome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var editT2 : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textV2 : TextView = findViewById(R.id.vieweri2)
        this.editT2 = findViewById(R.id.editkent2)

        val myintent = intent

        textV2.text = if(myintent.getBooleanExtra("is_palindrome", false)) "YES" else "NO"


    }


    // when back button is pressed or UI is "swiped":
    override fun onBackPressed() {
        // Send name = jaska back to first activity
        val intent = Intent()
        intent.putExtra("number", editT2?.text.toString())
        setResult(RESULT_OK, intent);
        super.onBackPressed()
    }
}