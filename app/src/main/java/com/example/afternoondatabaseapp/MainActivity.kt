package com.example.afternoondatabaseapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtIdNumber: EditText
    lateinit var btnSave: Button
    lateinit var btnView: Button
    lateinit var processBuilder: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.mEdtnName)
        edtEmail = findViewById(R.id.mEdtnEmail)
        edtIdNumber = findViewById(R.id.medtnIdNumber)
        btnSave = findViewById(R.id.mbtnSave)
        btnView = findViewById(R.id.mbtnView)
        btnSave.setOnClickListener {
            //receive data from the user
            var name = EditName.text.toString().trim()
            var Email = EditEmail.text.toString().trim()
            var name = EditIDNumber.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            //Check if the system is submitting any files
            if(name.isEmpty()){
                editEmail.set
            }
        }
