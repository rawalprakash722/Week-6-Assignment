package com.example.week6assignment1.model

var students = mutableListOf<User>(User("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/brad-pitt-portrait-london-october-1988-news-photo-121163696-1565374000.jpg?crop=0.753xw:0.872xh;0.0689xw,0.0315xh&resize=640:*","Prakash Rawal","20","Male","Imadol"))

class UserDatabase() {
   private val user1 = User("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/brad-pitt-portrait-london-october-1988-news-photo-121163696-1565374000.jpg?crop=0.753xw:0.872xh;0.0689xw,0.0315xh&resize=640:*","Prakash Rawal","20","Male","Imadol")



    fun getStudent():MutableList<User>
    {
        return students
    }
}

