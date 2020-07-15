package com.yapayzeka.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        }

    fun onMensClicked(view: View)
    {
        womansLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"

    }

    fun onWomanClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "womans"

    }

    fun onCoedClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        womansLeagueBtn.isChecked = false

        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View){

        if(!mensLeagueBtn.isChecked && !womansLeagueBtn.isChecked && !coedLeagueBtn.isChecked){
            selectedLeague = ""
        }

        if(selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }



}