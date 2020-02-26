package com.example.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_NAME = "NAME"

    val titleArr = arrayOf("Mazda MX-5","Porsche 911","Alpine A110","Porsche 718 Boxster/Cayman","McLaren 570S","Mercedes-AMG C 63","BMW M2 Competition","Nissan GT-R","Toyota Supra","Ford Mustang")

    val priceArr = arrayOf("Mazda MX-5"
        ,"Mazda"
        ,"Porsche"
        ,"Alpine"
        ,"Cayman"
        ,"McLaren"
        ,"Mercedes"
        ,"Nissan"
        ,"Toyota"
        ,"Ford")

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("รายชื่อรถ")

        val mAdp = ArrayAdapter(
            context, android.R.layout.simple_list_item_1,
            titleArr
        )
        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->

            var name = priceArr[position];

            senderFun(name)
            /*

            Toast.makeText(context,
                " เลขที่จ๊าบ  ${titleArr[position]} เลขที่ยอด ${priceArr[position]}"
                ,Toast.LENGTH_LONG).show()*/
        }
    }
        fun senderFun(str1 : String){
            //กำหนดค่าเริ่มต้น (ตัวมันเอง,class ปลายทาง)
            var goPageSecond = Intent(this,secActivity ::class.java)

            //กำหนดข้อมูลและส่งข้อมูล (ชื่อของข้อมูล,ข้อมูล)
            goPageSecond.putExtra(TAG_NAME,str1)


            //เริ่มต้นเข้าสู่ activity second
            startActivity(goPageSecond)
    }
}
