package com.example.expenseapp.view.activity

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expenseapp.view.adapter.FutureMoneyAdapter
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityFutureMoneyBinding
import com.example.expenseapp.model.TranscationData
import kotlinx.android.synthetic.main.activity_future_money.view.*
import kotlinx.android.synthetic.main.main_toolbar.*
import kotlinx.android.synthetic.main.main_toolbar.view.*


class FutureMoneyActivity : BaseActivity<ActivityFutureMoneyBinding>() {

    lateinit var binding: ActivityFutureMoneyBinding
    lateinit var adp:FutureMoneyAdapter
    val arr=ArrayList<TranscationData>()

    override fun setView(fbinding: ActivityFutureMoneyBinding) {
        binding=fbinding
    }
    override fun applyView()=R.layout.activity_future_money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.iconToolbar.setOnClickListener {
            val intent=Intent(this,AddTranscationActivity::class.java)
            startActivity(intent)
        }
        binding.textRemind.setOnClickListener {
            remainderDialog()
        }
        binding.textViewall.setOnClickListener {
            val intent=Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        applyAdapter()
        addTranscation()
    }

    private fun applyAdapter(){
        adp= FutureMoneyAdapter(this,arr)
        binding.recvView.layoutManager=LinearLayoutManager(this@FutureMoneyActivity)
        binding.recvView.adapter=adp
    }

    private fun addTranscation(){
        arr.add(TranscationData("Purchase","21/02/22","1200"))
        arr.add(TranscationData("Invest","13/11/22","2200"))
        arr.add(TranscationData("Loan","09/05/21","1000"))
        arr.add(TranscationData("Saving","31/12/22","1200"))

    }

    private fun remainderDialog() {
        val remind=AlertDialog.Builder(this)
            .setMessage("want to complete pending Transactions?")
            .setTitle("Please complete Transactions")
            .setPositiveButton("Submit",object:DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    Toast.makeText(this@FutureMoneyActivity,"Transaction Completed ",Toast.LENGTH_SHORT).show()
                }
            })
            .setNegativeButton("Cancel",object:DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    Toast.makeText(this@FutureMoneyActivity,"Transaction Failed ",Toast.LENGTH_SHORT).show()
                }
            })
            .setIcon(R.drawable.ic_alert)

        val dialog: AlertDialog = remind.create()
        dialog.show()
    }
}