package com.dicoding.mynavigationdrawer.ui.subway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.mynavigationdrawer.databinding.ActivitySubwayBinding

class SubwayActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubwayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubwayBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}