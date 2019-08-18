package buu.informatics.s59160039.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListenner()
    }
    private fun makeColor(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_tree_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.button_red ->box_tree_text.setBackgroundResource(R.color.my_red)
            R.id.button_green ->box_four_text.setBackgroundResource(R.color.my_green)
            R.id.button_yellow ->box_five_text.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    private fun setListenner(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxtreeText = findViewById<TextView>(R.id.box_tree_text)
        val boxfourText = findViewById<TextView>(R.id.box_four_text)
        val boxfiveText = findViewById<TextView>(R.id.box_five_text)
        val redBuuton =findViewById<TextView>(R.id.button_red)
        val greenBuuton =findViewById<TextView>(R.id.button_green)
        val yellowBuuton =findViewById<TextView>(R.id.button_yellow)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableView: List<View> =
                listOf(boxOneText,boxTwoText,boxtreeText,boxfourText,boxfiveText,rootConstraintLayout
                ,redBuuton,greenBuuton,yellowBuuton)
        for (item in clickableView){
            item.setOnClickListener{makeColor(it)}
        }



    }
}
