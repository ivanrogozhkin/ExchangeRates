package com.example.exchangerates.screens.noncashrate

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exchangerates.R

class NonCashRateFragment : Fragment() {

    companion object {
        fun newInstance() = NonCashRateFragment()
    }

    private lateinit var viewModel: NonCashRateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_non_cash_rate, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[NonCashRateViewModel::class.java]
        // TODO: Use the ViewModel
    }

}