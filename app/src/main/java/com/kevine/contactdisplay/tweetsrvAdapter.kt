package com.kevine.contactdisplay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kevine.contactdisplay.databinding.TweetListItemBinding

class tweetsrvAdapter (var tweetsList:List<TweetsData>):RecyclerView.Adapter<TweetsViewHolder>(){
//    ctrl i to bring all these three
//    passingtweetsvieholder is important
//    recy is a view group coz its a colletciton of the tweets
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return TweetsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
//we instatiate each var in the data class
    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
var currenttweet=tweetsList[position]



    holder.binding.apply {
       tvdisplayname.text=currenttweet.displayName
        tvhandle.text=currenttweet.handle
       tvtweet.text=currenttweet.tweet
        //the replycount is made tostring because the text expects a string for it to work
       tvreplycount.text=currenttweet.replyCount.toString()
        tvlikecount.text=currenttweet.likeCount.toString()
        tvretweet.text=currenttweet.rtCount.toString()
    }
    }

}

class TweetsViewHolder(var binding:TweetListItemBinding):RecyclerView.ViewHolder(binding.root){

}