package eniso.gte2.tp1arijkneni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            this,
            "this App is developed by arij kneni",
            Toast.LENGTH_LONG).show()
    }
}