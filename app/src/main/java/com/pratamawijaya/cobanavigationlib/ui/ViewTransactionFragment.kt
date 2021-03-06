package com.pratamawijaya.cobanavigationlib.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pratamawijaya.cobanavigationlib.R

class ViewTransactionFragment : Fragment() {

    companion object {
        fun newInstance() = ViewTransactionFragment()
    }

    private lateinit var viewModel: ViewTransactionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.view_transaction_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ViewTransactionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
