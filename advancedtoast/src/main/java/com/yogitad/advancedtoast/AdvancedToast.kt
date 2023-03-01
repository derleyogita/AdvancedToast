package com.yogitad.advancedtoast

import android.app.Activity
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.yogitad.advancedtoast.databinding.AdvancedToastBinding

/**
 * Advanced Toast class - main class which contains logic of Advanced Toast functionality.
 */
class AdvancedToast {

    companion object {

        const val LENGTH_LONG = 1
        const val LENGTH_SHORT = 0

        private lateinit var layoutInflater: LayoutInflater

        /**
         * Method used to create Toast that we want
         */
        fun makeToast(
            context: Activity,
            title: String? = null,
            message: String? = null,
            style: ToastStyles,
            duration: Int
        ) {
            layoutInflater = LayoutInflater.from(context)
            val binding = AdvancedToastBinding.inflate(layoutInflater)
            val layout = binding.root
            //handle Toast case based on mentioned style
            when (style) {
                ToastStyles.SUCCESS -> {
                    //Set Toast Image
                    binding.ivImageIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.wrapper_ic_success_tick
                        )
                    )
                    //set background tint
                    binding.rlToastBg.backgroundTintList =  ContextCompat.getColorStateList(context,R.color.bg_success_color)

                }
                ToastStyles.ERROR -> {
                    //Set Toast Image
                    binding.ivImageIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.wrapper_ic_error
                        )
                    )
                    //set background tint
                    binding.rlToastBg.backgroundTintList =  ContextCompat.getColorStateList(context,R.color.bg_error_color)

                }
                ToastStyles.ONLINE -> { //Set Toast Image
                    binding.ivImageIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.wrapper_ic_online
                        )
                    )
                    //set background tint
                    binding.rlToastBg.backgroundTintList =  ContextCompat.getColorStateList(context,R.color.bg_success_color)
                }

                ToastStyles.OFFLINE -> { //Set Toast Image
                    binding.ivImageIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.wrapper_no_internet
                        )
                    )
                    binding.rlToastBg.backgroundTintList =  ContextCompat.getColorStateList(context,R.color.bg_error_color)
                }
                ToastStyles.INFO -> { //Set Toast Image
                    binding.ivImageIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.wrapper_ic_info
                        )
                    )
                    binding.rlToastBg.backgroundTintList =  ContextCompat.getColorStateList(context,R.color.bg_info_color)
                }
            }
            //Set title
            binding.tvTitle.text = title
            //set Message
            binding.tvMessage.text = message
            // init toast
            val toast = Toast(context.applicationContext)
            //set toast duration
            toast.duration = duration
            //set gravity to bottom
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            // Setting layout to toast
            toast.view = layout
            toast.show()


        }
    }
}