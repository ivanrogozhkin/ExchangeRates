package com.example.exchangerates.screens.cashrate

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exchangerates.R

class CashRateFragment : Fragment() {

    companion object {
        fun newInstance() = CashRateFragment()
    }

    private lateinit var viewModel: CashRateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cash_rate, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[CashRateViewModel::class.java]
        // TODO: Use the ViewModel
    }

}