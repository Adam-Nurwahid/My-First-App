package com.dicoding.myapp

import Language
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    private val list = ArrayList<Language>()

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDetailName: TextView = findViewById(R.id.tv_item_name)
        val tvDetailDescription: TextView = findViewById(R.id.tv_item_description)
        val ivDetailPhoto: ImageView = findViewById(R.id.img_item_photo)

        val dataLanguage = intent.getParcelableExtra<Language>(EXTRA_PERSON)

        tvDetailName.text = dataLanguage?.name
        tvDetailDescription.text = dataLanguage?.description
        ivDetailPhoto.setImageResource(dataLanguage?.photo ?: 0)
    }
}


