package com.example.activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    fun toastFun( text:String){
        Toast.makeText(this,"$text", Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {//lunch install လုပ်
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toastFun("OnCreate")

    }

    override fun onStart(){//install တင်နေတာ
        super.onStart()
        toastFun("OnStart")
    }

    override fun onResume(){//home screen run နေပြီ acitivity စနေပြီ screen မြင်ရပြီ
        //data update ဖြစ်တဲ့ အခြေအနေ၀
        super.onResume()
        toastFun("OnResume")
    }

    override fun onPause() {
        super.onPause()
        toastFun("OnPause")
    }

    override fun onStop() {
        super.onStop()
        toastFun("OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        toastFun("OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        toastFun("OnRestart")
    }
}