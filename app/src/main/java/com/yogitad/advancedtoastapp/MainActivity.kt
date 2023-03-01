package com.yogitad.advancedtoastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yogitad.advancedtoast.AdvancedToast
import com.yogitad.advancedtoast.ToastStyles
import com.yogitad.advancedtoastapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setClickListeners()
    }

    /**
     * Method used to set button click listeners
     */
    private fun setClickListeners() {
        binding.btnSuccess.setOnClickListener(this)
        binding.btnError.setOnClickListener(this)
        binding.btnOnline.setOnClickListener(this)
        binding.btnOffline.setOnClickListener(this)
        binding.btnInfo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnSuccess -> AdvancedToast.makeToast(
                this,
                "Account Added",
                "Account added successfully..!",
                ToastStyles.SUCCESS,
                AdvancedToast.LENGTH_LONG
            )
            R.id.btnError -> AdvancedToast.makeToast(
                this,
                "Error",
                "Mobile number update failed!",
                ToastStyles.ERROR,
                AdvancedToast.LENGTH_LONG
            )
            R.id.btnOnline -> AdvancedToast.makeToast(
                this,
                "Yeah",
                "You're online",
                ToastStyles.ONLINE,
                AdvancedToast.LENGTH_LONG
            )
            R.id.btnOffline -> AdvancedToast.makeToast(
                this,
                "No internet",
                "Please connect to network.",
                ToastStyles.OFFLINE,
                AdvancedToast.LENGTH_LONG
            )
            R.id.btnInfo -> AdvancedToast.makeToast(
                this,
                "Info",
                "New version is available, Please update the app.",
                ToastStyles.INFO,
                AdvancedToast.LENGTH_LONG
            )
        }
    }
}