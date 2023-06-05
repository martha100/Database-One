package com.example.afternoondatabaseapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class UsersActivity : AppCompatActivity() {
    lateinit var listUsers:ListView
    lateinit var user: Users:Arrray<user>
    lateinit var adapter:CustomAdapter
    lateinit var progressionDialoue:ProgressionDialogue
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        listusers = findViewById(R.id.mbtnupdateusers)
        users = ArrayList()
        adapter = CustomAdapter?(this,users)
        progressionDialoue = ProgressDialog(this)
        progressDialogue.setTitle("loading")
        progressionDialoue.setMessage("please wait")
        //ctreate a reference to load data from database
        var ref = arrayOf(FirebaseDatabase.getInstant().getReference()
            child("users")
            //start showing the project as you load the data
        progress dialogue . show()
            ref.addValueEventlistener(object:ValueEventListener){
                overr
        }
    }



    for(data in snapshot.children){
    var user =dat}
}