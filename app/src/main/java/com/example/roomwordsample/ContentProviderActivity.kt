package com.example.roomwordsample

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.CursorAdapter
import android.widget.ListView
import android.widget.SimpleCursorAdapter

class ContentProviderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider)
        //val uriSms: Uri = Uri.parse("content://sms/inbox")
        val uriSms: Uri = ContactsContract.Contacts.CONTENT_URI
        val dataCursor: Cursor = contentResolver                   //content resolver will bring up the db & table into mem
            .query(uriSms, null, null, null, null)!! //selection -- rows, projection --columns

        //val from = arrayOf("body")
        val to = intArrayOf(android.R.id.text1)
        val from = arrayOf("display_name")
        val adapter = SimpleCursorAdapter(this,
            android.R.layout.simple_list_item_1,
            dataCursor ,from,to)

        val cpListView: ListView = findViewById(R.id.cpListview)
        cpListView.adapter = adapter
    }
}