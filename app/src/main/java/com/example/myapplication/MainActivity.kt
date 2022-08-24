package com.example.myapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.Model.CauHoiDapAn
import com.example.myapplication.Model.CheckDapAn
import java.util.*
import kotlin.math.log2

class MainActivity : AppCompatActivity() {
    lateinit var txtSoCauHoi : TextView
    lateinit var txtCauHoi : TextView
    lateinit var txtDapAn1 : TextView
    lateinit var txtDapAn2 : TextView
    lateinit var txtDapAn3 : TextView
    lateinit var txtDapAn4 : TextView
    var count: Int = 0 ;
    lateinit var txtThoiGian : TextView

    val list :MutableList<CauHoiDapAn> = mutableListOf()
    var dapAn : CauHoiDapAn = CauHoiDapAn()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCauHoi = findViewById(R.id.txtCauHoi)
        txtSoCauHoi = findViewById(R.id.txtSoCauHoi)
        txtDapAn1 = findViewById(R.id.txtDapAn1)
        txtDapAn2 = findViewById(R.id.txtDapAn2)
        txtDapAn3 = findViewById(R.id.txtDapAn3)
        txtDapAn4 = findViewById(R.id.txtDapAn4)
        txtThoiGian = findViewById(R.id.txtThoiGian)

        val  listDapAn: MutableList<CheckDapAn> = mutableListOf()

        listDapAn.add(CheckDapAn("ăn hành",false))
        listDapAn.add(CheckDapAn("ăn cháo",true))
        listDapAn.add(CheckDapAn("ăn thịt",false))
        listDapAn.add(CheckDapAn("ăn cơm",false))

        val  listDapAn1: MutableList<CheckDapAn> = mutableListOf()

        listDapAn1.add(CheckDapAn("hoa nắng",true))
        listDapAn1.add(CheckDapAn("hoa gió",false))
        listDapAn1.add(CheckDapAn("gió thu",false))
        listDapAn1.add(CheckDapAn("gió lạnh",false))

        val  listDapAn2: MutableList<CheckDapAn> = mutableListOf()

        listDapAn2.add(CheckDapAn("nghĩa thầy",false))
        listDapAn2.add(CheckDapAn("ơn thầy",true))
        listDapAn2.add(CheckDapAn("công thầy",false))
        listDapAn2.add(CheckDapAn("sư thầy",false))

        val  listDapAn3: MutableList<CheckDapAn> = mutableListOf()

        listDapAn3.add(CheckDapAn("hoạ",false))
        listDapAn3.add(CheckDapAn("con",false))
        listDapAn3.add(CheckDapAn("tiền",false))
        listDapAn3.add(CheckDapAn("phúc",true))

        val  listDapAn4: MutableList<CheckDapAn> = mutableListOf()

        listDapAn4.add(CheckDapAn("mực đen",false))
        listDapAn4.add(CheckDapAn("mực thước",true))
        listDapAn4.add(CheckDapAn("mực nước",false))
        listDapAn4.add(CheckDapAn("mực nướng",false))

        val  listDapAn5: MutableList<CheckDapAn> = mutableListOf()

        listDapAn5.add(CheckDapAn("le",false))
        listDapAn5.add(CheckDapAn("liền",false))
        listDapAn5.add(CheckDapAn("lề",true))
        listDapAn5.add(CheckDapAn("lòng",false))

        val  listDapAn6: MutableList<CheckDapAn> = mutableListOf()

        listDapAn6.add(CheckDapAn("trả tiền",false))
        listDapAn6.add(CheckDapAn("trả oán",true))
        listDapAn6.add(CheckDapAn("trả nợ",false))
        listDapAn6.add(CheckDapAn("trả bánh mì",false))

        val  listDapAn7: MutableList<CheckDapAn> = mutableListOf()

        listDapAn7.add(CheckDapAn("tử",true))
        listDapAn7.add(CheckDapAn("tư",false))
        listDapAn7.add(CheckDapAn("từ",false))
        listDapAn7.add(CheckDapAn("tứ",false))

        val  listDapAn8: MutableList<CheckDapAn> = mutableListOf()

        listDapAn8.add(CheckDapAn("que",false))
        listDapAn8.add(CheckDapAn("nết",true))
        listDapAn8.add(CheckDapAn("Con cá",false))
        listDapAn8.add(CheckDapAn("Con cò",false))

        val  listDapAn9: MutableList<CheckDapAn> = mutableListOf()

        listDapAn9.add(CheckDapAn("bát",true))
        listDapAn9.add(CheckDapAn("tô",false))
        listDapAn9.add(CheckDapAn("bát con",false))
        listDapAn9.add(CheckDapAn("thùng",false))

        list.add(CauHoiDapAn(1,"Có rau ăn rau, có cháo ...... ", listDapAn ))
        list.add(CauHoiDapAn(2,"Chữ thầy trong cõi người ta Dặm dài ... ... trời xa biển đầy. ",listDapAn1))
        list.add(CauHoiDapAn(3,"Mười năm luyện tập sách đèn Công danh gặp bước chớ quên .. ....",listDapAn2))
        list.add(CauHoiDapAn(4,"Anh em thuận hòa là nhà có ....",listDapAn3))
        list.add(CauHoiDapAn(5,"Tiền bạc đi trước ... ..... đi sau",listDapAn4))
        list.add(CauHoiDapAn(6,"Giấy rách phải giữ .. ",listDapAn5))
        list.add(CauHoiDapAn(7,"Cứu vật, vật trả ơn, cứu nhân, nhân ... ...",listDapAn6))
        list.add(CauHoiDapAn(8,"Sát nhân, giả ..",listDapAn7))
        list.add(CauHoiDapAn(9,"Cái ... đánh chết cái đẹp",listDapAn8))
        list.add(CauHoiDapAn(10,"Nhà sạch thì mát, ... sạch ngon cơm ",listDapAn9))

        setCauHoi(list.get(count))
        check();
        time60s()
    }

    private fun setCauHoi(cauHoi: CauHoiDapAn) {
        dapAn = cauHoi
        for (i in list.indices){
            if(cauHoi.idSoCauHoi == list.get(i).idSoCauHoi){
                txtSoCauHoi.setText("Câu : " + list.get(i).idSoCauHoi.toString())
                txtCauHoi.setText(list.get(i).tenCauHoi)
                txtDapAn1.setText(list.get(i).list.get(0).dapAnDung)
                txtDapAn2.setText(list.get(i).list.get(1).dapAnDung)
                txtDapAn3.setText(list.get(i).list.get(2).dapAnDung)
                txtDapAn4.setText(list.get(i).list.get(3).dapAnDung)

                fuck
            }
        }
    }

     fun check(){
        txtDapAn1.setOnClickListener(View.OnClickListener {
            checkDapAn(dapAn,dapAn.list.get(0))
        })
         txtDapAn2.setOnClickListener(View.OnClickListener {
             checkDapAn(dapAn,dapAn.list.get(1))
         })
         txtDapAn3.setOnClickListener(View.OnClickListener {
             checkDapAn(dapAn,dapAn.list.get(2))
         })
         txtDapAn4.setOnClickListener(View.OnClickListener {
             checkDapAn(dapAn,dapAn.list.get(3))
         })
    }
    fun checkDapAn(dapAn : CauHoiDapAn ,  checkDapAn : CheckDapAn ){

        if(checkDapAn.check){
            Toast.makeText(this,"Chúc mừng bạn",Toast.LENGTH_SHORT).show()
            Log.d("TAG", "Bạn đã đúng" )
            nextCauHoi()
        }else {

            Log.d("TAG", "Bạn đã sai" )
            Toast.makeText(this,"Bạn đoán sai rồi out trình lew lew >>",Toast.LENGTH_SHORT).show()
        }
    }
    fun nextCauHoi(){
        val currentWord = list.asSequence().shuffled().find { true }
        if(count == list.size - 1 ){
            Toast.makeText (this, "Chúc mừng bạn đã win game", Toast.LENGTH_SHORT).show ()
        }else {
            count++;
            setCauHoi(currentWord!!)
        }
    }
    fun time60s(){
         object  : CountDownTimer(60000,1000){
            override fun onTick(p0: Long) {
                txtThoiGian.setText((p0 / 1000).toString() )

            }
            override fun onFinish() {
                val diaLog : Dialog = Dialog(this@MainActivity)
                diaLog.setContentView(R.layout.dia_log_lose)
                val btnChoiLai : Button = diaLog.findViewById(R.id.btn_choi_lai)
                btnChoiLai.setOnClickListener(View.OnClickListener {
                    diaLog.dismiss()
                    time60s()
                    setCauHoi(list.get(0))
                })
                diaLog.show()
            }
        }.start()
    }
}