package com.pratamawijaya.cobanavigationlib.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.pratamawijaya.cobanavigationlib.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnViewTransaction.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_viewTransactionFragment)
        }

        btnSendMoney.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_chooseRecepientFragment)
        }

        btnViewBalance.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
