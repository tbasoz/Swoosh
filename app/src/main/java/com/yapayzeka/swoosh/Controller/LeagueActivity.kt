package com.yapayzeka.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.yapayzeka.swoosh.Model.Player
import com.yapayzeka.swoosh.R
import com.yapayzeka.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //var selectedLeague = ""
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        }

    fun onMensClicked(view: View)
    {
        womansLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        //selectedLeague = "mens"
        player.league = "mens"

    }

    fun onWomanClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womans"
        //selectedLeague = "womans"

    }

    fun onCoedClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        womansLeagueBtn.isChecked = false

        player.league = "coed"
        //selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View){

        if(!mensLeagueBtn.isChecked && !womansLeagueBtn.isChecked && !coedLeagueBtn.isChecked){
            player.league = ""
            //selectedLeague = ""
        }

        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }



}