package com.pratamawijaya.cobanavigationlib.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratamawijaya.cobanavigationlib.Constants

import com.pratamawijaya.cobanavigationlib.R
import kotlinx.android.synthetic.main.confirmation_fragment.*

class ConfirmationFragment : Fragment() {

    companion object {
        fun newInstance() = ConfirmationFragment()
    }

    private lateinit var viewModel: ConfirmationViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.confirmation_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val amount = arguments?.getDouble(Constants.AMOUNT)
        val recipient = arguments?.getString(Constants.RECIPIENT)

        lblAmount.text = "$ $amount"
        lblConfirm.text = "Sent to $recipient"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ConfirmationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
