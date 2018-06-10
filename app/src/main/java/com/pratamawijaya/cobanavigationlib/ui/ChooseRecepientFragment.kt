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
import kotlinx.android.synthetic.main.choose_recepient_fragment.*

class ChooseRecepientFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseRecepientFragment()
    }

    private lateinit var viewModel: ChooseRecepientViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.choose_recepient_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNext.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(Constants.RECIPIENT, inputRecipientName.text.toString())
            view.findNavController().navigate(R.id.action_chooseRecepientFragment_to_specifyAmountFragment, bundle)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ChooseRecepientViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
