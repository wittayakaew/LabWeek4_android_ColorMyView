package buu.informatics.s59160039.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

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
            else -> view.setBackgroundColor(Color.GREEN)
        }
    }
    private fun setListenner(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxtreeText = findViewById<TextView>(R.id.box_tree_text)
        val boxfourText = findViewById<TextView>(R.id.box_four_text)
        val boxfiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableView: List<View> =
                listOf(boxOneText,boxTwoText,boxtreeText,boxfourText,boxfiveText,rootConstraintLayout)
        for (item in clickableView){
            item.setOnClickListener{makeColor(it)}
        }

    }
}
