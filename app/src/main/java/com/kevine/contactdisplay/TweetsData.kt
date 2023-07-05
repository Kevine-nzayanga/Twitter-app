package com.kevine.contactdisplay

data class TweetsData(
    var avatar:String,
    var displayName:String,
    var handle:String,
    var tweet:String,
    var replyCount:Int,
    var rtCount:Int,
    var likeCount:Int
)
