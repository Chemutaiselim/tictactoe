package com.pamela.tictactoe

import android.content.Context
import android.graphics.Color
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

    fun buClick(view: View) {
        val buSelected = view as Button
        var cellID = 0
        when (buSelected.id) {
            R.id.bt1 -> cellID = 1
            R.id.bt2 -> cellID = 2
            R.id.bt3 -> cellID = 3
            R.id.bt4 -> cellID = 4
            R.id.bt5 -> cellID = 5
            R.id.bt6 -> cellID = 6
            R.id.bt7 -> cellID = 7
            R.id.bt8 -> cellID = 8
            R.id.bt9 -> cellID = 9
        }
        Toast.makeText(this, "cell id" + cellID, Toast.LENGTH_LONG).show()
        playGame(cellID, buSelected)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activeplayer = 1

    private fun playGame(cellID: Int, buSelected: Button) {


        if (activeplayer == 1) {
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.parseColor("#2B2B2B"))
            player1.add(cellID)
            activeplayer = 2
        } else {
            buSelected.text = "0"
            buSelected.setBackgroundColor(Color.parseColor("#2B2B2B"))
            player2.add(cellID)
            activeplayer = 1
        }
        buSelected.isEnabled = false
        checkWinner()
    }

    private fun checkWinner() {
        var winner = -1

//row
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 1
        }
        //column
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 1
        }

        //announcing the winner
        if (winner==-1){
            if (winner==1) {
                Toast.makeText(this, "player 1 won the game", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "player 2 won the game", Toast.LENGTH_LONG).show()
            }
        }
    }
}


