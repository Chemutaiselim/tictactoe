package com.pamela.tictactoe

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buClick(view: View){
        val buSelected=view as Button
        var cellID=0
        when(buSelected.id){
            R.id.bt1->cellID=1
            R.id.bt2->cellID=2
            R.id.bt3->cellID=3
            R.id.bt4->cellID=4
            R.id.bt5->cellID=5
            R.id.bt6->cellID=6
            R.id.bt7->cellID=7
            R.id.bt8->cellID=8
            R.id.bt9->cellID=9
        }
        Toast.makeText(this,"cell id"+cellID,Toast.LENGTH_LONG).show()
        playGame(cellID,buSelected)
    }

    private fun playGame(cellID: Int, buSelected: Button) {
        var player1=ArrayList<Int>()
        var player2=ArrayList<Int>()
        var activeplayer=1

        if (activeplayer==1){
            buSelected.text="X"
            player1.add(cellID)
            activeplayer=2
        }
        else {
            buSelected.text = "0"
            player2.add(cellID)
            activeplayer = 1
        }
        buSelected.isEnabled=false
    }

}
