package com.kevine.contactdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kevine.contactdisplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        layoutinflatercomes from the parent implementation theclass
//        activity has the fun called get layout inflater
binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }

    fun displayTweets(){
        var tweet1=TweetsData("Marcus","Mark","@Markdy","if not today when will you slide in",
        4,56,300)
        var tweet2=TweetsData("Mary","Mariana","@DaughterofChrist","God is coming watch yourself",
            1,5,30)

        var tweet3=TweetsData("Marcus","Mark","@Markzaddy","if not today when will you slide in",
            4,56,300)
        var tweet4=TweetsData("Mary","Mariana","@DaughterofChrist","God is coming watch yourself",
            1,5,30)

        var tweet5=TweetsData("Ariel","aris","@littlemerm","if not today when will you slide in",
            4,56,300)
        var tweet6=TweetsData("Mary","Mariana","@DaughterofChrist","God is coming watch yourself",
            1,5,30)

        var tweet7=TweetsData("Marcus","Mark","@Markzaddy","if not today when will you slide in",
            4,56,300)
        var tweet8=TweetsData("Mary","Mariana","@DaughterofChrist","God is coming watch yourself",
            1,5,30)
        var tweetList= listOf<TweetsData>(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        var tweetsAdapter=tweetsrvAdapter(tweetList)
        binding.rvTweets.adapter=tweetsAdapter
    }
}