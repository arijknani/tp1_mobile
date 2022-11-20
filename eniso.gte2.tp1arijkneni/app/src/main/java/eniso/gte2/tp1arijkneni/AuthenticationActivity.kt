package eniso.gte2.tp1arijkneni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authentication.*
import java.text.DateFormat
import java.util.*

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        //lors de chargement
        afficherDate()


        update_button.setOnClickListener{
            afficherDate()
        }

        singin_button.setOnClickListener {
            val login=login_hint.text.toString()
            val password=password_hint.text.toString()

            if(password== "pw$login"){
                //Toast.makeText(this,"correct",Toast.LENGTH_LONG).show()
                val intent=Intent(this,ComputeActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_LONG).show()
            }
        }


    }

    fun afficherDate(){
        val d=Date()

        val df=DateFormat.getDateInstance(DateFormat.LONG)
        val fd=df.format(d)

        val tf=DateFormat.getTimeInstance(DateFormat.LONG)
        val ft=tf.format(d)
        //Toast.makeText(this,fd,Toast.LENGTH_LONG).show()

        mytextView.text=fd+"\n"+ft

    }
}