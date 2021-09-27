package com.adihang.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adihang.myapplication.databinding.ActivityMainBinding
import android.content.Intent
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pyPlayer = MediaPlayer.create(this, R.raw.popyoung)

        binding.pyimgbu.setOnClickListener {
            pyPlayer.start()

        }
    }
    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}