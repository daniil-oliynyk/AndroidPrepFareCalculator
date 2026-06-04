package com.daniil.ridefareestimator

import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.daniil.ridefareestimator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val baseFareValue: Double = 4.00
    private val pricePerKm: Double = 1.50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupInitialUi()

        binding.calculateButton.setOnClickListener { calculateButtonListener() }

        binding.surgeSeekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    binding.surgeValueTextView.text = "Surge: " + progress.toString() + "x"

                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    return
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                    return
                }

            }
        )

    }
    private fun calculateButtonListener() {
        val distance = binding.distanceEditText.text.toString()

        val checkedRadioButtonId = binding.rideTypeRadioGroup.checkedRadioButtonId
        val rideTypePrice = mapRideTypePrice(mapTextToRideType(binding.root.findViewById<RadioButton>(checkedRadioButtonId).text.toString()))

        val surgeValue = binding.surgeSeekBar.progress.toDouble()

        val fare = surgeValue*(baseFareValue + rideTypePrice*(pricePerKm * distance.toDouble()))
        binding.estimatedFareTextView.text = fare.toString()


    }

    private fun setupInitialUi() {
        binding.estimatedFareTextView.text = "$0.00"
        binding.selectedRideTypeTextView.text = "Selected ride type: Standard"
        binding.surgeValueTextView.text = "Surge: 1.0x"
    }


}


