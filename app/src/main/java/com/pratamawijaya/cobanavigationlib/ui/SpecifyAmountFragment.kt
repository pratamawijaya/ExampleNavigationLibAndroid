package com.pratamawijaya.cobanavigationlib.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.pratamawijaya.cobanavigationlib.Constants

import com.pratamawijaya.cobanavigationlib.R
import kotlinx.android.synthetic.main.specify_amount_fragment.*

class SpecifyAmountFragment : Fragment() {

    companion object {
        fun newInstance() = SpecifyAmountFragment()
    }

    private lateinit var viewModel: SpecifyAmountViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.specify_amount_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recipientName = arguments?.getString(Constants.RECIPIENT)
        lblRecipient.text = "Send money to $recipientName"

        btnNext.setOnClickListener {
            val bundle = Bundle()
            bundle.putDouble(Constants.AMOUNT, inputAmount.text.toString().toDouble())
            bundle.putString(Constants.RECIPIENT, recipientName)
            view.findNavController().navigate(R.id.action_specifyAmountFragment_to_confirmationFragment, bundle)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SpecifyAmountViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
