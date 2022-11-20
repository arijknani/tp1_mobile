package eniso.gte2.tp1arijkneni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_compute.*

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)

        radiogroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                sum.id ->{
                    val1_tv.visibility = View.VISIBLE
                    value1.visibility = View.VISIBLE
                    val2_tv.visibility = View.VISIBLE
                    value2.visibility = View.VISIBLE
                }
                square.id->{
                    val1_tv.visibility = View.VISIBLE
                    value1.visibility = View.VISIBLE
                    val2_tv.visibility = View.INVISIBLE
                    value2.visibility = View.INVISIBLE
                    val1_tv.text="Value"
                    value1.hint="Value"

                }
            }

            calculate.setOnClickListener {
                if(sum.isChecked){
                    val v1= value1.text.toString().toInt()
                    val v2=value2.text.toString().toInt()
                    res.text="${v1+v2}"
                }
                else if (square.isChecked){
                    val v1= value1.text.toString().toInt()

                    res.text="${v1*v1}"
                }
            }
        }
        }
    }
