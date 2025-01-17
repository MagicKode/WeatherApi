package ru.myapp.quizapp.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ru.myapp.quizapp.R
import ru.myapp.quizapp.adapter.HourlyAdapter
import ru.myapp.quizapp.adapter.OtherCityAdapter
import ru.myapp.quizapp.databinding.ActivityMainBinding
import ru.myapp.quizapp.model.CityModel
import ru.myapp.quizapp.model.HourlyModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chipNavigator.setItemSelected(R.id.home, true)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerviewHourly()
        initRecyclerOtherCity()

    }

    private fun initRecyclerOtherCity() {
        val items: ArrayList<CityModel> = ArrayList()

        items.add(CityModel("Paris", 28, "cloudy", 12, 20, 30))
        items.add(CityModel("Berlin", 29, "sunny", 5, 22, 12))
        items.add(CityModel("Rome", 30, "cloudy", 30, 50, 50))
        items.add(CityModel("London", 31, "cloudy_2", 20, 20, 35))
        items.add(CityModel("Minsk", 10, "snowy", 8, 5, 25))

        binding.view2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.view2.adapter = OtherCityAdapter(items)
    }

    private fun initRecyclerviewHourly() {
        val items: ArrayList<HourlyModel> = ArrayList()

        items.add(HourlyModel("9 pm", 28, "cloudy"))
        items.add(HourlyModel("10 pm", 29, "sunny"))
        items.add(HourlyModel("11 pm", 30, "windy"))
        items.add(HourlyModel("12 pm", 31, "cloudy_2"))
        items.add(HourlyModel("1 am", 10, "snowy"))

        binding.view1.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )

        binding.view1.adapter = HourlyAdapter(items)
    }
}