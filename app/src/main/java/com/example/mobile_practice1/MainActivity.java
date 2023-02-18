package com.example.mobile_practice1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onCreate. Получено исключение");
        Log.d(TAG, "Метод onCreate. Отладка");
        Log.w(TAG, "Метод onCreate. Предупреждения");
        Log.i(TAG, "Метод onCreate. Информация");
        Log.w(TAG, "Метод onCreate. Подробности");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onStart. Получено исключение");
        Log.d(TAG, "Метод onStart. Отладка");
        Log.w(TAG, "Метод onStart. Предупреждения");
        Log.i(TAG, "Метод onStart. Информация");
        Log.w(TAG, "Метод onStart. Подробности");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onResume. Получено исключение");
        Log.d(TAG, "Метод onResume. Отладка");
        Log.w(TAG, "Метод onResume. Предупреждения");
        Log.i(TAG, "Метод onResume. Информация");
        Log.w(TAG, "Метод onResume. Подробности");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onPause. Получено исключение");
        Log.d(TAG, "Метод onPause. Отладка");
        Log.w(TAG, "Метод onPause. Предупреждения");
        Log.i(TAG, "Метод onPause. Информация");
        Log.w(TAG, "Метод onPause. Подробности");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onStop. Получено исключение");
        Log.d(TAG, "Метод onStop. Отладка");
        Log.w(TAG, "Метод onStop. Предупреждения");
        Log.i(TAG, "Метод onStop. Информация");
        Log.w(TAG, "Метод onStop. Подробности");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onDestroy. Получено исключение");
        Log.d(TAG, "Метод onDestroy. Отладка");
        Log.w(TAG, "Метод onDestroy. Предупреждения");
        Log.i(TAG, "Метод onDestroy. Информация");
        Log.w(TAG, "Метод onDestroy. Подробности");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Метод onRestart. Получено исключение");
        Log.d(TAG, "Метод onRestart. Отладка");
        Log.w(TAG, "Метод onRestart. Предупреждения");
        Log.i(TAG, "Метод onRestart. Информация");
        Log.w(TAG, "Метод onRestart. Подробности");
    }
}