package personal.pol.sanejove.pills.singletone;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import personal.pol.sanejove.pills.entities.Day;

public class PillsAppSingletone extends AppCompatActivity {

    private ArrayList<Day> dayArrayList;
    private int currentPosition;
    private Context context;

    private static class SingletonInstance {
        private static AppSingleton INSTANCE = new AppSingleton();
    }

    public static AppSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private AppSingleton() {
        //Constructor Singleton
        pizzaOrder=new PizzaOrder();
    }
}
