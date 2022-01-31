package com.example.roomwordsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cursoradapter.widget.SimpleCursorAdapter
import android.R

import android.provider.ContactsContract
import android.view.View
import android.widget.ListView

class ContactProvider : AppCompatActivity() {
    /*
    private var adapter: SimpleCursorAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_provider)
        val lvContacts: ListView = findViewById<View>(R.id.lvContacts) as ListView
        lvContacts.setAdapter(adapter)
    }
    private fun setupCursorAdapter() {
        // Column data from cursor to bind views from
        val uiBindFrom = arrayOf(
            ContactsContract.Contacts.DISPLAY_NAME,
            ContactsContract.Contacts.PHOTO_URI
        )
        // View IDs which will have the respective column data inserted
        val uiBindTo = intArrayOf(R.id.tvName, R.id.ivImage)
        // Create the simple cursor adapter to use for our list
        // specifying the template to inflate (item_contact),
        adapter = SimpleCursorAdapter(
            this, R.layout.item_contact,
            null, uiBindFrom, uiBindTo,
            0
        )
    }

     */
}
