package com.gaalbaat.studio351

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun clickDatePicker(view : View){ val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                _, _, monthOfYear, dayOfMonth ->
            // Display Selected date in Toast
            Toast.makeText(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG).show()
        }, year, month, day)
        dpd.show()
    }
    fun clickTimePicker(view : View){

        val c = Calendar.getInstance()
        val m = c.get(Calendar.MINUTE)
        val h = c.get(Calendar.HOUR)

        val tpd = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener(
            function = { _, _, _ ->
            Toast.makeText(this, "Hour "+h.toString() + " : "+ "Mints" + m.toString() +" : " , Toast.LENGTH_LONG).show()
        })
            ,h
            ,m
            ,true)
        tpd.show()
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun clickFloatButton(view: View){

//        floatingActionButton.tooltipText = "Send Email"
    }

}
