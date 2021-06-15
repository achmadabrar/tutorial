package com.abrar.freefireguides.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abrar.freefireguides.R
import com.abrar.freefireguides.cheat.CheatFragment
import com.abrar.freefireguides.community.CommunityFragment
import com.abrar.freefireguides.howtoinstall.HowToInstallFragment
import com.abrar.freefireguides.tutorial.TutorialFragment

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_install, HomeFragment()).addToBackStack("home")
            .commit()

    }

    override fun onSupportNavigateUp(): Boolean {
        val install: HowToInstallFragment? =
            supportFragmentManager.findFragmentByTag("install") as HowToInstallFragment?
        val cheat: CheatFragment? =
            supportFragmentManager.findFragmentByTag("install") as CheatFragment?
        val community: CommunityFragment? =
            supportFragmentManager.findFragmentByTag("install") as CommunityFragment?
        val tutorial: TutorialFragment? =
            supportFragmentManager.findFragmentByTag("install") as TutorialFragment?
        if (install != null && install.isVisible()) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_install, HomeFragment()).addToBackStack("home")
                .commit()
        } else if (cheat != null && cheat.isVisible()) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_install, HomeFragment()).addToBackStack("home")
                .commit()
        } else if (community != null && community.isVisible()) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_install, HomeFragment()).addToBackStack("home")
                .commit()
        } else if (tutorial != null && tutorial.isVisible()) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_install, HomeFragment()).addToBackStack("home")
                .commit()
        } else {
            onBackPressed()
        }
        return true
    }

}